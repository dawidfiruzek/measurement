package pl.dawidfiruzek.measurement

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import pl.dawidfiruzek.measurement.units.weight.WeightUnits

class WeightMeasurementTest : BaseTest() {

    private lateinit var measurement: Measurement<WeightUnits>

    @Before
    fun setUp() {
        measurement = Measurement(2.0, WeightUnits.KILOGRAMS)
    }

    @Test
    fun test() {
        val result = measurement + Measurement(2.6, WeightUnits.KILOGRAMS)

        Assert.assertEquals(4.6, result.to(WeightUnits.KILOGRAMS), delta)
        Assert.assertEquals(4600.0, result.to(WeightUnits.GRAMS), delta)
        Assert.assertEquals(10.1412640603, result.to(WeightUnits.POUNDS), delta)
        Assert.assertEquals(162.2602249682, result.to(WeightUnits.OUNCES), delta)
        Assert.assertEquals(0.7243760042, result.to(WeightUnits.STONES), delta)
    }
}
