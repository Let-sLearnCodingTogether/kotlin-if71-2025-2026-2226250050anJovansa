package oop

class Gedung(val nama: String) {
    private val alamat: String = "jln. Sudirman"

    inner class RuangRapat() {
        fun mulaiRapat() {
            println("Rapat di mulai")
            println("Rapat di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val gedung = Gedung("UMDP")
    val ruang = gedung.RuangRapat()
    ruang.mulaiRapat()
}