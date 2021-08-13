package myDigitalClock

class MockTimeSink(
    private var itsHours: Int = 0,
    private var itsMinutes: Int = 0,
    private var itsSeconds: Int = 0
) : ClockObserver {
    override fun update(hours: Int, minutes: Int, seconds: Int) {
        itsHours = hours
        itsMinutes = minutes
        itsSeconds = seconds
    }

    fun getHours(): Int = itsHours

    fun getMinutes(): Int = itsMinutes

    fun getSeconds(): Int = itsSeconds
}
