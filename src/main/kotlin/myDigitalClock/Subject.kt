package myDigitalClock

import java.util.Vector

open class Subject {
    private val itsObservers: Vector<Observer> = Vector()

    fun registerObserver(observer: Observer) {
        itsObservers.add(observer)
    }

    protected fun notifyObservers() {
        itsObservers.forEach { it.update() }
    }
}
