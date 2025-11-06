package oop

abstract class Printer() {
    abstract fun cetak()

    fun info() {
        println("Info printer")
    }
}

class Epson() : Printer() {
    override fun cetak() {
        println("Print dengan menggunakan Epson")
    }
}

fun main() {
    Epson().cetak()
    Epson().info()
}