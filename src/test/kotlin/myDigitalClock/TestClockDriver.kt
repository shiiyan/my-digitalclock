package myDigitalClock

import junit.framework.TestCase

class TestClockDriver(name: String) : TestCase(name) {
    private lateinit var source: MockTimeSource
    private lateinit var sink: MockTimeSink

    override fun setUp() {
        source = MockTimeSource()
        sink = MockTimeSink()
        source.registerObserver(sink)
    }

    fun testTimeChange() {
        source.registerObserver(sink)
        source.setTime(3, 4, 5)
        assertSinkEquals(sink, 3, 4, 5)
        source.setTime(7, 8, 9)
        assertSinkEquals(sink, 7, 8, 9)
    }

    fun testMultipleSinks() {
        val sink2 = MockTimeSink()
        source.registerObserver(sink2)
        source.setTime(12, 13, 14)
        assertSinkEquals(sink, 12, 13, 14)
        assertSinkEquals(sink2, 12, 13, 14)
    }

    private fun assertSinkEquals(sink: MockTimeSink, hours: Int, minutes: Int, seconds: Int) {
        assertEquals(hours, sink.getHours())
        assertEquals(minutes, sink.getMinutes())
        assertEquals(seconds, sink.getSeconds())
    }
}
