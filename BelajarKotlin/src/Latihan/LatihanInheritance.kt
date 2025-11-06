package Latihan

open class Pegawai(val nama: String, val gajiDasar: Int) {
    open fun hitungGaji(): Int {
        return gajiDasar
    }
}

class Manager(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar) {
    override fun hitungGaji(): Int {
        return super.hitungGaji()
    }
}

class Programmer(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar) {
    override fun hitungGaji(): Int {
        return super.hitungGaji()
    }
}

fun main() {
    val dataPegawai: List<Pegawai> = listOf(
        Manager("Jovansa", 10_000_000),
        Programmer("Michael", 5_000_000),
        Programmer("Adrian", 3_000_000)
    )

    dataPegawai.forEach { println("Nama : ${it.nama} \t Gaji : ${it.hitungGaji()}") }

}
