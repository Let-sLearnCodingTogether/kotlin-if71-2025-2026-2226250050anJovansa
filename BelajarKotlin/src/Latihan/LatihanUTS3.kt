package Latihan

fun breakLine() {
    println("=========================================================")
}

fun soal1() {
    print("Masukkan nama peserta : ")
    val inputNama: String? = readlnOrNull()
    val nama: String? = if (inputNama!!.isBlank()) null else inputNama
    print("Nama peserta          : ${nama ?: "Nama tidak diketahui"}")
}

fun soal2() {
    val namaPeserta: List<String> = listOf("Andi", "Budi", "Citra", "Andi", "Dina", "Budi")
    println("Jumlah peserta (asli) : ${namaPeserta.size}")
    println("Jumlah peserta unik   : ${namaPeserta.toSet().size}")
    println("Daftar peserta unik   : ${namaPeserta.toSet()}")
}

fun soal3() {
    val nilaiTes: Map<String, Int> = mapOf("Andi" to 85, "Budi" to 90, "Citra" to 70, "Dina" to 60)
    nilaiTes.forEach { (t, u) ->
        println("Nama:$t\t| Nilai:$u")
    }
}

data class Mahasiswa1(var nama: String, var nilai: Int?) {
    fun statusKelulusan(): String {
        return if ((nilai ?: 0) >= 70) {
            "Lulus"
        } else {
            "Tidak Lulus"
        }
    }

    fun tampilkanInfo() {
        println("Nama\t:${nama}")
        println("Nilai\t:${nilai ?: 0}")
        println("Status\t:${statusKelulusan()}")
    }

    companion object {
        fun jumlahMahasiswa(total: List<Any>): Int {
            return total.size
        }
    }
}

fun main() {
    var mahasiswaList: List<Mahasiswa1> = mutableListOf(
        Mahasiswa1("Andi", 85),
        Mahasiswa1("Budi", 90),
        Mahasiswa1("Citra", null),
        Mahasiswa1("Andi", 85),
        Mahasiswa1("Andi", 85)
    )
    val mahasiswaMap: Map<String, Int?> = mahasiswaList.associate { it.nama to it.nilai }
    val mahasiswaSet: Set<Mahasiswa1> = mahasiswaList.toSet()

    mahasiswaList.forEach { it.tampilkanInfo(); println() }
    println()
    println("Total mahasiswa terdaftar: ${Mahasiswa1.jumlahMahasiswa(mahasiswaList)}")
    println("Daftar mahasiswa unik: ${mahasiswaSet.map { it.nama }}")
}