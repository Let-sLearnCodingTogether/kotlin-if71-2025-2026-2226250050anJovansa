class nilaiUjian(nilaiUts: Double) {
    var nilaiUts: Double = nilaiUts
        get() = field * 0.1 //custom getter (field (backing field) merujuk pada variable diatasnya
        set(value) { //custom setter
            field = if (value < 0) 0.0 else value
        }

    val nilaiAkhir: Double
        get() = nilaiUts * 2
}

fun main() {
    val nilaiMhs1 = nilaiUjian(80.3)
    println(nilaiMhs1.nilaiUts)
    println(nilaiMhs1.nilaiAkhir)

    nilaiMhs1.nilaiUts = -20.0
    println(nilaiMhs1.nilaiUts)

    nilaiMhs1.nilaiUts = 80.5
    println(nilaiMhs1.nilaiUts)
}