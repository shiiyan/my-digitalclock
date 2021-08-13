package myDigitalClock

class MockTimeSink(
    private var itsHours: Int = 0,
    private var itsMinutes: Int = 0,
    private var itsSeconds: Int = 0,
    private val itsSource: TimeSource
) : Observer {
    override fun update() {
        itsHours = itsSource.getHours()
        itsMinutes = itsSource.getMinutes()
        itsSeconds = itsSource.getSeconds()
    }

    fun getHours(): Int = itsHours

    fun getMinutes(): Int = itsMinutes

    fun getSeconds(): Int = itsSeconds
}
