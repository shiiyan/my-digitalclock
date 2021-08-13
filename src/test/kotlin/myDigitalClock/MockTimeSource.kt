package myDigitalClock

class MockTimeSource : TimeSource() {
    fun setTime(hours: Int, minutes: Int, seconds: Int) {
        notify(hours, minutes, seconds)
    }
}
