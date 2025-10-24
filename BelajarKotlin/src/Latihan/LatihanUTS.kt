package Latihan

fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    var namaBarang: String = ""
    var jumlahBarang: Int = 10000

    val minStok = stokBarang.minByOrNull {
        it.value
    }

    stokBarang.entries.forEach { (key, value) ->
        if (jumlahBarang > value) {
            namaBarang = key
            jumlahBarang = value
        }
    }

    println(namaBarang + " " + jumlahBarang)
    println(minStok?.key + " " + minStok?.value)

}