fun main() {
    val daftarMahasiswas = listOf(
        Pair("Budi", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7)
    )

//    for (daftarMahasiswa in daftarMahasiswas) {
//        if (daftarMahasiswa.second > 3.5) {
//            println(daftarMahasiswa.first)
//        }
//    }

//    val x = daftarMahasiswas.map {
//        if (it.second > 3.5) {
//            println(it.first)
//        }
//    }

    val x = daftarMahasiswas.filter { it.second > 3.5 }.map { it.first }

    println(x)
}