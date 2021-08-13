package myDigitalClock

class MockTimeSink(
    private var itsHours: Int = 0,
    private var itsMinutes: Int = 0,
    private var itsSeconds: Int = 0
) : TimeSink {
    override fun setTime(hours: Int, minutes: Int, seconds: Int) {
        itsHours = hours
        itsMinutes = minutes
        itsSeconds = seconds
    }

    fun getHours(): Int = itsHours

    fun getMinutes(): Int = itsMinutes

    fun getSeconds(): Int = itsSeconds
}
