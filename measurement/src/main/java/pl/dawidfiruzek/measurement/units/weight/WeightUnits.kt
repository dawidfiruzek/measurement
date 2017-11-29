package pl.dawidfiruzek.measurement.units.weight

import pl.dawidfiruzek.measurement.units.Units

enum class WeightUnits : Units {

    KILOGRAMS {
        override val factor: Double = 1.0
    },
    GRAMS {
        override val factor: Double = 1000.0
    },
    POUNDS {
        override val factor: Double = 2.2046226218
    },
    OUNCES {
        override val factor: Double = 35.2739619496
    },
    STONES {
        override val factor: Double = 0.1574730444
    };

    override fun getBaseUnits(): Units =
            values().first { it.factor == 1.0 }
}
