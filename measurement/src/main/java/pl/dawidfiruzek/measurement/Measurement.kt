package pl.dawidfiruzek.measurement

import pl.dawidfiruzek.measurement.units.Units
import java.math.BigDecimal
import java.math.RoundingMode

class Measurement<T : Units>(private val value: BigDecimal, private val units: T) {

    constructor(value: Double, units: T) : this(BigDecimal.valueOf(value), units)

    @Suppress("UNCHECKED_CAST")
    private val baseUnits by lazy {
        units.getBaseUnits() as T
    }

    fun to(units: T): Double {
        val bigDecimalValue = value * units.factor / this.units.factor
        return bigDecimalValue.toDouble()
    }

    operator fun plus(measurement: Measurement<T>): Measurement<T> {
        val value = value / units.factor + measurement.value / measurement.units.factor
        return Measurement(value, baseUnits)
    }

    operator fun minus(measurement: Measurement<T>): Measurement<T> {
        val value = value / units.factor - measurement.value / measurement.units.factor
        return Measurement(value, baseUnits)
    }

    operator fun times(factor: Double): Measurement<T> {
        val value = value * BigDecimal(factor)
        return Measurement(value, units)
    }

    operator fun times(factor: Int): Measurement<T> {
        val value = value * BigDecimal(factor)
        return Measurement(value, units)
    }

    operator fun div(factor: Double): Measurement<T> {
        val value = value.divide(BigDecimal(factor), 10, RoundingMode.HALF_UP)
        return Measurement(value, units)
    }

    operator fun div(factor: Int): Measurement<T> {
        val value = value.divide(BigDecimal(factor), 10, RoundingMode.HALF_UP)
        return Measurement(value, units)
    }
}
