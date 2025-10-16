package oop

class MahasiswaConstructorDefaultValue(val npm: String, val nama: String, var ipk: Float = 0.0F) {
    init {
        println("Ini blok init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue("22226250050", "Jovansa Putra Laksana")

    println(mahasiswaPertama.ipk)

    val mahasiswaKedua = MahasiswaConstructorDefaultValue("22226250051", "Fernando Feliansyah", 3.5F)
//    println(mahasiswaKedua.ipk)
}