package pl.dawidfiruzek.measurement.units

enum class UnitLength(val factor: Double) : Unit {
    milimeters(0.001),
    centimeters(0.01),
    decimeters(0.1),
    meters(1.0),
    kilometers(1000.0);

    override val type: String
        get() = UnitLength::class.java.simpleName
}
