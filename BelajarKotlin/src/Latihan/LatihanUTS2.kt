package Latihan

class Karyawan(var nama: String, var id: String, var gajiPokok: Double) {

    fun tampilkanProfil() {
        println("ID   : $id")
        println("Nama : $nama")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk.toDouble() / 22) * gajiPokok
    }

}

fun main() {
    val Karyawan1 = Karyawan("Jovansa Putra Laksana", "1", 10_000.0)
    val Karyawan2 = Karyawan("Joy", "2", 8_000.0)

    Karyawan1.tampilkanProfil()
    println("Gaji : ${Karyawan1.hitungGajiBulanan(22)}")
    println("-------------")
    Karyawan2.tampilkanProfil()
    println("Gaji : ${Karyawan2.hitungGajiBulanan(20)}")
}