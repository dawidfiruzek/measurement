package pl.dawidfiruzek.measurement.units

interface Units {
    val factor: Double
    fun getBaseUnits(): Units
}