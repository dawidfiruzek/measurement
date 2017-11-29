package pl.dawidfiruzek.measurement.units.length

import pl.dawidfiruzek.measurement.units.Units

enum class LengthUnits : Units {

    METERS {
        override val factor: Double = 1.0
    },
    CENTIMETERS {
        override val factor: Double = 100.0
    },
    MILLIMETERS {
        override val factor: Double = 1000.0
    },
    INCHES {
        override val factor: Double = 39.3700787402
    },
    FEET {
        override val factor: Double = 3.2808398950
    };

    override fun getBaseUnits(): Units =
            values().first { it.factor == 1.0 }
}
