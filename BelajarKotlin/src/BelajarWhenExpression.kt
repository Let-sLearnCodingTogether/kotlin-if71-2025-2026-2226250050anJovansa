fun main() {
//    val finalExam = 'A'
//
//    when (finalExam) {
//        'A', 'B' -> println("Lulus")
//        'C' -> println("Ya bisa lulus")
//        else -> println("Tidak lulus")
//    }
//
//    when {
//        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
//        finalExam == 'C' -> println("Ya bisa lulus")
//        else -> println("Tidak lulus")
//    }
    var angka: Int = 0
    var nilaiLulus = arrayOf('A', 'B')
    val finalExam = 'A'

    when (angka) {
        0 -> angka += 1
        1 -> angka += 1
        2 -> angka += 2
        else -> angka += 3
    }
    println(angka)

    when (finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when (finalExam) {
        is Char -> println("Ini char")
        is String -> println("Ini string")
        !is Char -> println("Bukan char")
    }
}