package pl.dawidfiruzek.measurement.units.weight

import pl.dawidfiruzek.measurement.units.Units
import java.math.BigDecimal

enum class WeightUnits : Units {

    KILOGRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1.0)
    },
    TONNES {
        override val factor: BigDecimal = BigDecimal.valueOf(1e-3)
    },
    DEKAGRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1e2)
    },
    GRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1e3)
    },
    CENTIGRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1e5)
    },
    MILLIGRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1e6)
    },
    MICROGRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(1e9)
    },
    LONG_TONS {
        override val factor: BigDecimal = BigDecimal.valueOf(9.84206528e-4)
    },
    SHORT_TONS {
        override val factor: BigDecimal = BigDecimal.valueOf(1.10231131e-3)
    },
    HUNDREDWEIGHTS {
        override val factor: BigDecimal = BigDecimal.valueOf(1.96841306e-2)
    },
    CENTALS {
        override val factor: BigDecimal = BigDecimal.valueOf(2.20462262e-2)
    },
    QUARTERS {
        override val factor: BigDecimal = BigDecimal.valueOf(7.87365222e-2)
    },
    STONES {
        override val factor: BigDecimal = BigDecimal.valueOf(1.574730444e-1)
    },
    POUNDS {
        override val factor: BigDecimal = BigDecimal.valueOf(2.2046226218)
    },
    OUNCES {
        override val factor: BigDecimal = BigDecimal.valueOf(3.52739619496e1)
    },
    DRAMS {
        override val factor: BigDecimal = BigDecimal.valueOf(5.643833911933e2)
    },
    PENNYWEIGHTS {
        override val factor: BigDecimal = BigDecimal.valueOf(6.430149313726e2)
    },
    CARATS {
        override val factor: BigDecimal = BigDecimal.valueOf(5.0e3)
    },
    GRAINS {
        override val factor: BigDecimal = BigDecimal.valueOf(1.54323583529414e4)
    };
}
