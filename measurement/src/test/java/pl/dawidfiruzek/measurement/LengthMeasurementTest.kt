package pl.dawidfiruzek.measurement

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import pl.dawidfiruzek.measurement.units.length.LengthUnits

class LengthMeasurementTest : BaseTest() {

    private lateinit var measurement: Measurement<LengthUnits>

    @Before
    fun setUp() {
        measurement = Measurement(3.45, LengthUnits.METERS)
    }

    @Test
    fun test() {
        val result = measurement + Measurement(0.77, LengthUnits.METERS)

        Assert.assertEquals(4.22, result.to(LengthUnits.METERS), delta)
        Assert.assertEquals(422.0, result.to(LengthUnits.CENTIMETERS), delta)
        Assert.assertEquals(4220.0, result.to(LengthUnits.MILLIMETERS), delta)
        Assert.assertEquals(166.1417322836, result.to(LengthUnits.INCHES), delta)
        Assert.assertEquals(13.8451443569, result.to(LengthUnits.FEET), delta)
    }
}
