package pl.dawidfiruzek.measurement

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import pl.dawidfiruzek.measurement.units.Unit
import pl.dawidfiruzek.measurement.units.UnitLength

class MeasurementTest {

    private lateinit var measurement: Measurement

    @Before
    fun setUp() {
        measurement = Measurement(9.0, UnitLength.kilometers)
    }

    @Test
    fun test() {
        Assert.assertEquals(4, 2 + 2)
    }
}
