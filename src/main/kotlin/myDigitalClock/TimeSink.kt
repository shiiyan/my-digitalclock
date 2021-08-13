package myDigitalClock

interface TimeSink {
    fun setTime(hours: Int, minutes: Int, seconds: Int)
}
