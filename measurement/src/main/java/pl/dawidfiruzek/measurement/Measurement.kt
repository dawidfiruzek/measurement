package pl.dawidfiruzek.measurement

import pl.dawidfiruzek.measurement.units.Units

class Measurement<T : Units>(private val value: Double, private val units: T) {

    @Suppress("UNCHECKED_CAST")
    private val baseUnits by lazy {
        units.getBaseUnits() as T
    }

    fun to(units: T): Double =
            value * units.factor / this.units.factor

    operator fun plus(measurement: Measurement<T>): Measurement<T> {
        val value = value / units.factor + measurement.value / measurement.units.factor
        return Measurement(value, baseUnits)
    }

    operator fun minus(measurement: Measurement<T>): Measurement<T> {
        val value = value / units.factor - measurement.value / measurement.units.factor
        return Measurement(value, baseUnits)
    }
}
