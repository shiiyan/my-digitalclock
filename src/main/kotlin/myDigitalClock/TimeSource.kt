package myDigitalClock

interface TimeSource {
    fun registerObserver(observer: ClockObserver)
}
