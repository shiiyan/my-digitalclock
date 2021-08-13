package myDigitalClock

interface TimeSource {
    fun setObserver(observer: ClockObserver)
}
