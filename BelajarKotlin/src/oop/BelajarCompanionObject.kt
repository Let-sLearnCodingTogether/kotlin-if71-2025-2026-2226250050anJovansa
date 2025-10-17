package oop

class Kalkulator {
    companion object {
        fun tambah(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun main() {
    println(Kalkulator.tambah(5, 2))
}