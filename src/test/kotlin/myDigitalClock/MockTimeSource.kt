package myDigitalClock

class MockTimeSource : TimeSource {
    private lateinit var itsObserver: ClockObserver

    override fun setObserver(observer: ClockObserver) {
        itsObserver = observer
    }

    fun setTime(hours: Int, minutes: Int, seconds: Int) {
        itsObserver.update(hours, minutes, seconds)
    }
}
