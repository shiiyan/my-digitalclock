package myDigitalClock

class MockTimeSource : Subject(), TimeSource {
    private var itsHours: Int = 0
    private var itsMinutes: Int = 0
    private var itsSeconds: Int = 0

    fun setTime(hours: Int, minutes: Int, seconds: Int) {
        itsHours = hours
        itsMinutes = minutes
        itsSeconds = seconds
        notifyObservers()
    }

    override fun getHours(): Int = itsHours

    override fun getMinutes(): Int = itsMinutes

    override fun getSeconds(): Int = itsSeconds
}
