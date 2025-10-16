package oop

class MahasiswaFunction(val nama: String) {
    fun sayHello() {
        println("Selamat Malam $nama")
    }

    fun sayHello(word: String) {
        println("$word $nama")
    }

    fun sayHello(word: String, nama: String) {
        println("$word $nama ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction("Jovansa Putra Laksana")
    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Siang")
    mahasiswaPertama.sayHello("Selamat Pagi", "Nama :")

}