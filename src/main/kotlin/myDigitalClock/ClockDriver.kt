package myDigitalClock

class ClockDriver(source: TimeSource, sink: TimeSink) {
    private val itsSink: TimeSink = sink

    init {
        source.setDriver(this)
    }

    fun update(hours: Int, minutes: Int, seconds: Int) {
        itsSink.setTime(hours, minutes, seconds)
    }
}
