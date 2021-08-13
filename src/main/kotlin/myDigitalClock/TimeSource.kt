package myDigitalClock

interface TimeSource {
    fun getHours(): Int
    fun getMinutes(): Int
    fun getSeconds(): Int
}
