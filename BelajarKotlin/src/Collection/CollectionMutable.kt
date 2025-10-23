fun main() {
    val mataKuliahPilihan: MutableList<String> = mutableListOf("Kotlin", "Logika Fuzzy")
    val mataKuliahMutable: MutableList<String> = mutableListOf("Kotlin", "PAB 2", "SOLID")

    var mataKuliah = mataKuliahPilihan+mataKuliahMutable
    println("Mata kuliah Pilihan: $mataKuliah")

    mataKuliahPilihan.add("Web 2")
    mataKuliahPilihan.add(1, "Web 1")
    mataKuliahPilihan.removeAt(1)
    println("Mata kuliah Pilihan: $mataKuliahPilihan")
}