package pl.dawidfiruzek.measurement

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import pl.dawidfiruzek.measurement.units.length.LengthUnits
import pl.dawidfiruzek.measurement.units.length.LengthUnits.CENTIMETERS
import pl.dawidfiruzek.measurement.units.length.LengthUnits.FEET
import pl.dawidfiruzek.measurement.units.length.LengthUnits.INCHES
import pl.dawidfiruzek.measurement.units.length.LengthUnits.METERS
import pl.dawidfiruzek.measurement.units.length.LengthUnits.MILLIMETERS

class LengthMeasurementTest : BaseTest() {

    private lateinit var measurement: Measurement<LengthUnits>

    @Before
    fun setUp() {
        measurement = Measurement(3.45, METERS)
    }

    @Test
    fun testAddition() {
        val result = measurement + Measurement(0.77, METERS)

        assertEquals(4.22, result.to(METERS), delta)
        assertEquals(4.220e2, result.to(CENTIMETERS), delta)
        assertEquals(4.2200e3, result.to(MILLIMETERS), delta)
        assertEquals(1.661417322836e2, result.to(INCHES), delta)
        assertEquals(1.38451443569e1, result.to(FEET), delta)
    }

    @Test
    fun testSubtraction() {
        val result = measurement - Measurement(4.894, METERS)

        assertEquals(-1.444, result.to(METERS), delta)
        assertEquals(-1.444e2, result.to(CENTIMETERS), delta)
        assertEquals(-1.444e3, result.to(MILLIMETERS), delta)
        assertEquals(-5.68503937008e1, result.to(INCHES), delta)
        assertEquals(-4.7375328084, result.to(FEET), delta)
    }

    @Test
    fun testDoubleMultiplication() {
        val result = measurement * 2.5

        assertEquals(8.625, result.to(METERS), delta)
        assertEquals(8.625e2, result.to(CENTIMETERS), delta)
        assertEquals(8.625e3, result.to(MILLIMETERS), delta)
        assertEquals(3.39566929134225e2, result.to(INCHES), delta)
        assertEquals(2.8297244094375e1, result.to(FEET), delta)
    }

    @Test
    fun testIntegerMultiplication() {
        val result = measurement * 2

        assertEquals(6.9, result.to(METERS), delta)
        assertEquals(6.9e2, result.to(CENTIMETERS), delta)
        assertEquals(6.9e3, result.to(MILLIMETERS), delta)
        assertEquals(2.7165354330738e2, result.to(INCHES), delta)
        assertEquals(2.26377952755e1, result.to(FEET), delta)
    }
}
