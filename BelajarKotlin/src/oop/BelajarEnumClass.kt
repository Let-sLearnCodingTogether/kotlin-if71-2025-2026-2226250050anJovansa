package oop

enum class DayOfTheWeek(val isWeekend: Boolean = false) {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true)
}

fun main() {
    val days = DayOfTheWeek.values()
    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }

    val today = DayOfTheWeek.valueOf("Senin") //case sensitive
    println("Hari ini hari : ${today.name}, hari ini weekend : ${today.isWeekend}")
    when (today) {
        DayOfTheWeek.Senin -> println("Yah, senin lagi")
        DayOfTheWeek.Selasa -> println("Hari selesa")
        DayOfTheWeek.Sabtu, DayOfTheWeek.Minggu -> println("Hari libur")
        else -> println("Hari lain")
    }
}