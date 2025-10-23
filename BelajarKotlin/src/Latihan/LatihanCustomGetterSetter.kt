package Latihan

class PersegiPanjang(val panjang: Double, val lebar: Double) {
    val luas: Double
        get() = panjang * lebar
}

class Mahasiswa(ipk: Double) {
    var ipk: Double = ipk
        set(value) {
            field = if (value < 0.0) 0.0 else if (value > 4.0) 4.0 else value
        }
}

fun main() {
    val kotak: PersegiPanjang = PersegiPanjang(10.0, 5.0)
    println(kotak.luas)

    val mhs: Mahasiswa = Mahasiswa(0.0)
    mhs.ipk = 6.0
    println(mhs.ipk)
}