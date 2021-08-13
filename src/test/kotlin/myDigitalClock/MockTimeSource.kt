package myDigitalClock

import java.util.Vector

class MockTimeSource : TimeSource {
    private val itsObservers: Vector<ClockObserver> = Vector()

    override fun registerObserver(observer: ClockObserver) {
        itsObservers.add(observer)
    }

    fun setTime(hours: Int, minutes: Int, seconds: Int) {
        itsObservers.forEach { it.update(hours, minutes, seconds) }
    }
}
