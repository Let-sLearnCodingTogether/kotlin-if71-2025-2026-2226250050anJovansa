package oop

enum class DayOfTheWeeks(val isWeekend: Boolean = false) {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true);

    fun daysUntil(targetHari: DayOfTheWeeks): Int {
        return if (this.ordinal < targetHari.ordinal) {
            targetHari.ordinal - this.ordinal
        } else {
            targetHari.ordinal - this.ordinal + DayOfTheWeeks.entries.count()
        }
    }

    companion object {
        fun today(): DayOfTheWeeks {
            val today = 0
            return DayOfTheWeeks.entries.first { it.ordinal == today }
        }
    }
}

fun main() {
    val today = DayOfTheWeeks.Minggu
    val targetHari = DayOfTheWeeks.Senin
    val sisaHari = today.daysUntil(targetHari)
    println("$sisaHari")

    println(DayOfTheWeeks.today())
}

