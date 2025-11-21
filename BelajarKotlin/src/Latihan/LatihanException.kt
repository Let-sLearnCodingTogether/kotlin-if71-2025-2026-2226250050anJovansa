package Latihan

class NilaiTidakValidException(msg: String) : Exception(msg)

fun validasiNilai(nilai: Int) {
    if (nilai < 0 || nilai > 100) {
        throw NilaiTidakValidException("Nilai haru antara 0 hingga 100")
    } else {
        println("Nilai berhasil diinput: [$nilai]")
    }
}

fun main() {
    try {
        validasiNilai(105)
    } catch (error: NilaiTidakValidException) {
        println("${error.message}")
    }
}