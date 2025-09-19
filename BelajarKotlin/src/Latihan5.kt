fun main() {
    var namaHari: Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")

    println("===============================================")
    println("Jumlah hari : ${namaHari.size}")
    println("Hari pertama : ${namaHari.first()}")
    println("Hari terakhir : ${namaHari.last()}")
    namaHari[4] = "Jum'at Barokah"
    println(namaHari[4])
    println("===============================================")

}