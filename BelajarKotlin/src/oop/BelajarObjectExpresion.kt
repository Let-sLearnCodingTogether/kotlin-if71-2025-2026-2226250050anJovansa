package oop

fun main() {
    val person = object {
        val nama = "Jovansa Putra Laksana"
        fun greet(): String {
            return "Hello $nama"
        }
    }

    println(person.greet())
}