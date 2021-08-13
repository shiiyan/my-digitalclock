package myDigitalClock

interface TimeSource {
    fun setDriver(driver: ClockDriver)
}
