package pl.dawidfiruzek.measurement.units.length

import pl.dawidfiruzek.measurement.units.Units
import java.math.BigDecimal

enum class LengthUnits : Units {

    METERS {
        override val factor: BigDecimal = BigDecimal.valueOf(1.0)
    },
    CENTIMETERS {
        override val factor: BigDecimal = BigDecimal.valueOf(100.0)
    },
    MILLIMETERS {
        override val factor: BigDecimal = BigDecimal.valueOf(1000.0)
    },
    INCHES {
        override val factor: BigDecimal = BigDecimal.valueOf(39.3700787402)
    },
    FEET {
        override val factor: BigDecimal = BigDecimal.valueOf(3.2808398950)
    };

    override fun getBaseUnits(): Units =
            values().first { it.factor == BigDecimal.valueOf(1.0) }
}
