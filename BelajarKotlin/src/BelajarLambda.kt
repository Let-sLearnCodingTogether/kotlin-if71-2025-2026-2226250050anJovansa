fun main() {
    val jumlahkan = { a: Int, b: Int -> a + b }
    println(jumlahkan(5, 10))

    val angka = listOf<Int>(5, 10, 2)

    val x = angka.map { n -> n * 2 }
    val y = angka.map { it * 3 }
    println(x)
    println(y)
}