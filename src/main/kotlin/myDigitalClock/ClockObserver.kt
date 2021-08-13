package myDigitalClock

interface ClockObserver {
    fun update(hours: Int, minutes: Int, seconds: Int)
}
