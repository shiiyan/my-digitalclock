package myDigitalClock

import junit.framework.TestCase

class TestClockDriver(name: String) : TestCase(name) {
    fun testTimeChange() {
        val source = MockTimeSource()
        val sink = MockTimeSink()
        val driver = ClockDriver(source, sink)
        source.setTime(3, 4, 5)
        assertEquals(3, sink.getHours())
        assertEquals(4, sink.getMinutes())
        assertEquals(5, sink.getSeconds())
        source.setTime(7, 8, 9)
        assertEquals(7, sink.getHours())
        assertEquals(8, sink.getMinutes())
        assertEquals(9, sink.getSeconds())
    }
}
