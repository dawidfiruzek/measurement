package pl.dawidfiruzek.measurement

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import pl.dawidfiruzek.measurement.units.weight.WeightUnits
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.CARATS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.CENTALS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.CENTIGRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.DEKAGRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.DRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.GRAINS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.GRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.HUNDREDWEIGHTS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.KILOGRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.LONG_TONS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.MICROGRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.MILLIGRAMS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.OUNCES
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.PENNYWEIGHTS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.POUNDS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.QUARTERS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.SHORT_TONS
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.STONES
import pl.dawidfiruzek.measurement.units.weight.WeightUnits.TONNES

class WeightMeasurementTest : BaseTest() {

    private lateinit var measurement: Measurement<WeightUnits>

    @Before
    fun setUp() {
        measurement = Measurement(2.0, KILOGRAMS)
    }

    @Test
    fun testAddition() {
        val result = measurement + Measurement(2.6, KILOGRAMS)

        assertEquals(4.6, result.to(KILOGRAMS), delta)
        assertEquals(4.6e-3, result.to(TONNES), delta)
        assertEquals(4.6e2, result.to(DEKAGRAMS), delta)
        assertEquals(4.6e3, result.to(GRAMS), delta)
        assertEquals(4.6e5, result.to(CENTIGRAMS), delta)
        assertEquals(4.6e6, result.to(MILLIGRAMS), delta)
        assertEquals(4.6e9, result.to(MICROGRAMS), delta)
        assertEquals(4.5273499e-3, result.to(LONG_TONS), delta)
        assertEquals(5.0706320e-3, result.to(SHORT_TONS), delta)
        assertEquals(9.05470008e-2, result.to(HUNDREDWEIGHTS), delta)
        assertEquals(1.014126406e-1, result.to(CENTALS), delta)
        assertEquals(3.621880021e-1, result.to(QUARTERS), delta)
        assertEquals(7.243760042e-1, result.to(STONES), delta)
        assertEquals(1.01412640603e1, result.to(POUNDS), delta)
        assertEquals(1.622602249682e2, result.to(OUNCES), delta)
        assertEquals(2.5961635994892e3, result.to(DRAMS), delta)
        assertEquals(2.957868684314e3, result.to(PENNYWEIGHTS), delta)
        assertEquals(2.3e4, result.to(CARATS), delta)
        assertEquals(7.09888484235304e4, result.to(GRAINS), delta)
    }

    @Test
    fun testSubtraction() {
        val result = measurement - Measurement(1.32, KILOGRAMS)

        assertEquals(6.8e-1, result.to(KILOGRAMS), delta)
        assertEquals(6.8e-4, result.to(TONNES), delta)
        assertEquals(6.8e1, result.to(DEKAGRAMS), delta)
        assertEquals(6.8e2, result.to(GRAMS), delta)
        assertEquals(6.8e4, result.to(CENTIGRAMS), delta)
        assertEquals(6.8e5, result.to(MILLIGRAMS), delta)
        assertEquals(6.8e8, result.to(MICROGRAMS), delta)
        assertEquals(6.6926042e-4, result.to(WeightUnits.LONG_TONS), delta)
        assertEquals(7.49571684e-4, result.to(WeightUnits.SHORT_TONS), delta)
        assertEquals(1.338520881e-2, result.to(WeightUnits.HUNDREDWEIGHTS), delta)
        assertEquals(1.499143382e-2, result.to(WeightUnits.CENTALS), delta)
        assertEquals(5.35408351e-2, result.to(WeightUnits.QUARTERS), delta)
        assertEquals(1.070816702e-1, result.to(WeightUnits.STONES), delta)
        assertEquals(1.4991433828, result.to(WeightUnits.POUNDS), delta)
        assertEquals(2.39862941257e1, result.to(WeightUnits.OUNCES), delta)
        assertEquals(3.837807060114e2, result.to(WeightUnits.DRAMS), delta)
        assertEquals(4.372501533334e2, result.to(WeightUnits.PENNYWEIGHTS), delta)
        assertEquals(3.4e3, result.to(WeightUnits.CARATS), delta)
        assertEquals(1.04940036800002e4, result.to(WeightUnits.GRAINS), delta)
    }

    @Test
    fun testDoubleMultiplication() {
        val result = measurement * 0.67

        assertEquals(1.34, result.to(KILOGRAMS), delta)
        assertEquals(1.34e-3, result.to(TONNES), delta)
        assertEquals(1.34e2, result.to(DEKAGRAMS), delta)
        assertEquals(1.34e3, result.to(GRAMS), delta)
        assertEquals(1.34e5, result.to(CENTIGRAMS), delta)
        assertEquals(1.34e6, result.to(MILLIGRAMS), delta)
        assertEquals(1.34e9, result.to(MICROGRAMS), delta)
        assertEquals(1.31883671e-3, result.to(WeightUnits.LONG_TONS), delta)
        assertEquals(1.477097142e-3, result.to(WeightUnits.SHORT_TONS), delta)
        assertEquals(2.6376735004e-2, result.to(WeightUnits.HUNDREDWEIGHTS), delta)
        assertEquals(2.9541943108e-2, result.to(WeightUnits.CENTALS), delta)
        assertEquals(1.05506939748e-1, result.to(WeightUnits.QUARTERS), delta)
        assertEquals(2.11013879496e-1, result.to(WeightUnits.STONES), delta)
        assertEquals(2.954194313212, result.to(WeightUnits.POUNDS), delta)
        assertEquals(4.7267109012464e1, result.to(WeightUnits.OUNCES), delta)
        assertEquals(7.56273744199022e2, result.to(WeightUnits.DRAMS), delta)
        assertEquals(8.61640008039284e2, result.to(WeightUnits.PENNYWEIGHTS), delta)
        assertEquals(6.7e3, result.to(WeightUnits.CARATS), delta)
        assertEquals(2.06793601929415e4, result.to(WeightUnits.GRAINS), delta)
    }

    @Test
    fun testIntegerMultiplication() {
        val result = measurement * 3

        assertEquals(6.0, result.to(KILOGRAMS), delta)
        assertEquals(6.0e-3, result.to(TONNES), delta)
        assertEquals(6.0e2, result.to(DEKAGRAMS), delta)
        assertEquals(6.0e3, result.to(GRAMS), delta)
        assertEquals(6.0e5, result.to(CENTIGRAMS), delta)
        assertEquals(6.0e6, result.to(MILLIGRAMS), delta)
        assertEquals(6.0e9, result.to(MICROGRAMS), delta)
        assertEquals(5.905239168e-3, result.to(WeightUnits.LONG_TONS), delta)
        assertEquals(6.61386786e-3, result.to(WeightUnits.SHORT_TONS), delta)
        assertEquals(1.181047836e-1, result.to(WeightUnits.HUNDREDWEIGHTS), delta)
        assertEquals(1.322773572e-1, result.to(WeightUnits.CENTALS), delta)
        assertEquals(4.724191332e-1, result.to(WeightUnits.QUARTERS), delta)
        assertEquals(9.448382664e-1, result.to(WeightUnits.STONES), delta)
        assertEquals(1.32277357308e1, result.to(WeightUnits.POUNDS), delta)
        assertEquals(2.116437716976e2, result.to(WeightUnits.OUNCES), delta)
        assertEquals(3.3863003471598e3, result.to(WeightUnits.DRAMS), delta)
        assertEquals(3.8580895882356e3, result.to(WeightUnits.PENNYWEIGHTS), delta)
        assertEquals(3e4, result.to(WeightUnits.CARATS), delta)
        assertEquals(9.25941501176484e4, result.to(WeightUnits.GRAINS), delta)
    }

    //todo fix values
    @Test
    fun testDoubleDivision() {
        val result = measurement / 2.11

        assertEquals(6.8e-1, result.to(KILOGRAMS), delta)
        assertEquals(6.8e-4, result.to(TONNES), delta)
        assertEquals(6.8e1, result.to(DEKAGRAMS), delta)
        assertEquals(6.8e2, result.to(GRAMS), delta)
        assertEquals(6.8e4, result.to(CENTIGRAMS), delta)
        assertEquals(6.8e5, result.to(MILLIGRAMS), delta)
        assertEquals(6.8e8, result.to(MICROGRAMS), delta)
//        assertEquals(6.6926042e-4, result.to(WeightUnits.LONG_TONS), delta)
//        assertEquals(7.49571684e-4, result.to(WeightUnits.SHORT_TONS), delta)
//        assertEquals(1.338520881e-2, result.to(WeightUnits.HUNDREDWEIGHTS), delta)
//        assertEquals(1.499143382e-2, result.to(WeightUnits.CENTALS), delta)
//        assertEquals(5.35408351e-2, result.to(WeightUnits.QUARTERS), delta)
//        assertEquals(1.070816702e-1, result.to(WeightUnits.STONES), delta)
//        assertEquals(1.4991433828, result.to(WeightUnits.POUNDS), delta)
//        assertEquals(2.39862941257e1, result.to(WeightUnits.OUNCES), delta)
//        assertEquals(3.837807060114e2, result.to(WeightUnits.DRAMS), delta)
//        assertEquals(4.372501533334e2, result.to(WeightUnits.PENNYWEIGHTS), delta)
//        assertEquals(3.4e3, result.to(WeightUnits.CARATS), delta)
//        assertEquals(1.04940036800002e4, result.to(WeightUnits.GRAINS), delta)
    }

    @Test
    fun testIntegerDivision() {
        val result = measurement / 13

        assertEquals(6.8e-1, result.to(KILOGRAMS), delta)
        assertEquals(6.8e-4, result.to(TONNES), delta)
        assertEquals(6.8e1, result.to(DEKAGRAMS), delta)
        assertEquals(6.8e2, result.to(GRAMS), delta)
        assertEquals(6.8e4, result.to(CENTIGRAMS), delta)
        assertEquals(6.8e5, result.to(MILLIGRAMS), delta)
        assertEquals(6.8e8, result.to(MICROGRAMS), delta)
//        assertEquals(6.6926042e-4, result.to(WeightUnits.LONG_TONS), delta)
//        assertEquals(7.49571684e-4, result.to(WeightUnits.SHORT_TONS), delta)
//        assertEquals(1.338520881e-2, result.to(WeightUnits.HUNDREDWEIGHTS), delta)
//        assertEquals(1.499143382e-2, result.to(WeightUnits.CENTALS), delta)
//        assertEquals(5.35408351e-2, result.to(WeightUnits.QUARTERS), delta)
//        assertEquals(1.070816702e-1, result.to(WeightUnits.STONES), delta)
//        assertEquals(1.4991433828, result.to(WeightUnits.POUNDS), delta)
//        assertEquals(2.39862941257e1, result.to(WeightUnits.OUNCES), delta)
//        assertEquals(3.837807060114e2, result.to(WeightUnits.DRAMS), delta)
//        assertEquals(4.372501533334e2, result.to(WeightUnits.PENNYWEIGHTS), delta)
//        assertEquals(3.4e3, result.to(WeightUnits.CARATS), delta)
//        assertEquals(1.04940036800002e4, result.to(WeightUnits.GRAINS), delta)
    }
}
