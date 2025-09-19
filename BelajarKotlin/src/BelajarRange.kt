fun main() {
    val range = 0..1000
    val range2 = 0..1000 step 2
    val rangeChar = 'a'..'o'
    val rangeUntil = 1 until 10
    val rangeDownTo = 10 downTo 0

    println(range.count())
    println(range.contains(50))
    println(range.toList()[6])

    println(range2.count())
    println(range2.contains(51))

    for (index in range) {
        println(range.toList()[index])
    }

    for (index in range2) {
        println(index)
    }
}