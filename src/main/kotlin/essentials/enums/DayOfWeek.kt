package essentials.enums.dayofweek

// TODO
enum class DayOfWeek(val isWeekend: Boolean, val dayName: String) {
    MONDAY(true, "Monday"),
    TUESDAY(true, "Tuesday"),
    WEDNESDAY(true, "Wednesday"),
    THURSDAY(true, "Thursday"),
    FRIDAY(true, "Friday"),
    SATURDAY(false, "Saturday"),
    SUNDAY(false, "Sunday");

    fun nextDay(): DayOfWeek {
        val nextIndex = (this.ordinal + 1) % entries.size
        return entries[nextIndex]
    }
}

fun main() {
    val friday: DayOfWeek = DayOfWeek.FRIDAY
    println(friday.dayName) // Friday
    println(friday.isWeekend) // false
    val saturday: DayOfWeek = friday.nextDay()
    println(saturday.dayName) // Saturday
    println(saturday.isWeekend) // true
    val monday: DayOfWeek = DayOfWeek.SUNDAY.nextDay()
    println(monday.dayName)
}
