package myDigitalClock

import java.util.Vector

open class TimeSource {
    private val itsObservers: Vector<ClockObserver> = Vector()

    fun registerObserver(observer: ClockObserver) {
        itsObservers.add(observer)
    }

    protected fun notify(hours: Int, minutes: Int, seconds: Int) {
        itsObservers.forEach { it.update(hours, minutes, seconds) }
    }
}
