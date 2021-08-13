package myDigitalClock

class ClockDriver(source: TimeSource, sink: TimeSink) : ClockObserver {
    private val itsSink: TimeSink = sink

    init {
        source.setObserver(this)
    }

    override fun update(hours: Int, minutes: Int, seconds: Int) {
        itsSink.setTime(hours, minutes, seconds)
    }
}
