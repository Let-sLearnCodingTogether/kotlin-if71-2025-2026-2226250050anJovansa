package oop

class Mahasiswa(val npm: String, val nama: String, var ipk: Float) {
    init {
        println("init blok")
    }
}

fun main() {
    val mahasiswaPertama = Mahasiswa("2226250050", "Jovansa Putra Laksana", 3.95F)

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 4.0F
    println(mahasiswaPertama.ipk)
}