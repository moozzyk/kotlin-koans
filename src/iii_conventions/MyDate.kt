package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (other.year > year ||
                (other.year == year && other.month > month) ||
                (other.year == year && other.month == month && other.dayOfMonth > dayOfMonth)) {
            return -1
        }

        if (other.year == year && other.month == month && other.dayOfMonth == dayOfMonth) {
            return 0
        }

        return 1
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(date: MyDate): Boolean = date >= start && date <= endInclusive
}
