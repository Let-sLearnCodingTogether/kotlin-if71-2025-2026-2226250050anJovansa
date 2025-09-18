fun main() {
    var totalBelanja: Double = 0.0
    val hargaItem1: Double = 25_000.0
    val hargaItem2: Double = 15_000.0
    val diskon: Double = 10_000.0
    val biayaLayanan: Double = 100.0
    var layanan: Double = 0.0

    println("Status Awal -> Total Belanja: Rp.$totalBelanja")
    totalBelanja += (hargaItem1 * 3)
    println("Setelah Item A -> Total Belanja: Rp.$totalBelanja")
    totalBelanja += (hargaItem2 * 2)
    println("Setelah Item B -> Total Belanja: Rp.$totalBelanja")
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja: Rp.$totalBelanja")
    layanan += totalBelanja
    layanan /= biayaLayanan
    totalBelanja += layanan
    println("Ditambah Biaya Layanan (Rp.$layanan)  -> Total Belanja: Rp.$totalBelanja")
    println()
    println("=========================================================")
    println("Total Akhir yang Harus Dibayar: Rp.$totalBelanja")
    println("=========================================================")

}