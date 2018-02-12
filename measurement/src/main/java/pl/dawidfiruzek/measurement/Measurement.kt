package pl.dawidfiruzek.measurement

import pl.dawidfiruzek.measurement.units.Units
import java.math.BigDecimal
import java.math.RoundingMode

class Measurement<T : Units>(private val value: BigDecimal, private val units: T) {

    companion object {
        internal const val divisionPrecision = 10
    }

    constructor(value: Double, units: T) : this(BigDecimal.valueOf(value), units)

    fun to(units: T): Double {
        val bigDecimalValue = value.divideWithPrecision(this.units.factor) * units.factor
        return bigDecimalValue.toDouble()
    }

    operator fun plus(measurement: Measurement<T>): Measurement<T> {
        val value = value + measurement.value.divideWithPrecision(measurement.units.factor) * units.factor
        return Measurement(value, units)
    }

    operator fun minus(measurement: Measurement<T>): Measurement<T> {
        val value = value - measurement.value.divideWithPrecision(measurement.units.factor) * units.factor
        return Measurement(value, units)
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
        val value = value.divideWithPrecision(BigDecimal(factor))
        return Measurement(value, units)
    }

    operator fun div(factor: Int): Measurement<T> {
        val value = value.divideWithPrecision(BigDecimal(factor))
        return Measurement(value, units)
    }
}

internal fun BigDecimal.divideWithPrecision(by: BigDecimal): BigDecimal =
        this.divide(by, pl.dawidfiruzek.measurement.Measurement.divisionPrecision, RoundingMode.HALF_UP)
