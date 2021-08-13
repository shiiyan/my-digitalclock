package myDigitalClock

class MockTimeSource : TimeSource {
    private lateinit var itsDriver: ClockDriver

    override fun setDriver(driver: ClockDriver) {
        itsDriver = driver
    }

    fun setTime(hours: Int, minutes: Int, seconds: Int) {
        itsDriver.update(hours, minutes, seconds)
    }
}
