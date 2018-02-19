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

operator fun MyDate.rangeTo(other: MyDate): DateRange =
        DateRange(start = this, endInclusive = other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateIterator(val start: MyDate, val end: MyDate, var current: MyDate = start): Iterator<MyDate> {
    override fun next(): MyDate {
        val tmp = current
        current = current.nextDay()
        return tmp
    }

    override fun hasNext(): Boolean = current <= end
}

class DateRange(val start: MyDate, val endInclusive: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(start, endInclusive)

    operator fun contains(date: MyDate): Boolean = date >= start && date <= endInclusive
}
