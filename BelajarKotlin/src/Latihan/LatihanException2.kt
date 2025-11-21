package Latihan

data class Barang(val nama: String, var stok: Int)

class StokHabisException(msg: String) : Exception(msg)

fun beliBarang(barang: Barang, jumlahBeli: Int) {
    if (jumlahBeli > barang.stok) {
        throw StokHabisException("Gagal beli [${barang.nama}]. Stok hanya sisa [${barang.stok}]")
    } else {
        barang.stok -= jumlahBeli
        println("Berhasil membeli [$jumlahBeli] [${barang.nama}]")
        println("Sisa stok ${barang.stok}")
    }
}

fun main() {
    val barang1 = Barang("Laptop LOQ", 10)

    try {
        beliBarang(barang1, 9)
    } catch (error: StokHabisException) {
        println("${error.message}")
    }
}