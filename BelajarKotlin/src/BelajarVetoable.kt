import kotlin.properties.Delegates

class NilaiMahasiswa {
    var nilai: Float by Delegates.vetoable(0.0f) { property, oldValue, newValue ->
        if (newValue > 0.0f && newValue <= 100f) {
            println("Nilai berhasil diubah")
            true
        } else {
            println("Nilai harus lebih besar dari 0 dan kecil sama dengan 100")
            false
        }
    }
}

fun main() {
    val mhs = NilaiMahasiswa()
    mhs.nilai = 101f
    println(mhs.nilai)

    mhs.nilai = 80f
    println(mhs.nilai)
}