package oop

open class Kendaraan1() {
    open fun Klakson() {
        println("Suara Klakson")
    }
}

class Mobil() : Kendaraan1() {
    override fun Klakson() {
        println("Klakson Mobil")
    }
}

class Motor() : Kendaraan1() {
    override fun Klakson() {
        println("Klason Motor")
    }
}

fun main() {
    Mobil().Klakson()
}