fun main() {
    calculateStudyScore(kuis1 = 93.4, kuis2 = 89.2, tugas1 = 100.0, tugas2 = 99.7, uts = 95.4, uas = 89.4)
}

fun calculateStudyScore(kuis1: Double, kuis2: Double, tugas1: Double, tugas2: Double, uts: Double, uas: Double) {
    println(kuis1 + kuis2 + tugas1 + tugas2 + uts + uas)
}