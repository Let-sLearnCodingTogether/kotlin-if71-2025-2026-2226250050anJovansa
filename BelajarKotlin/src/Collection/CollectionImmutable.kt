fun main() {
    val mataKuliahMutable: MutableList<String> = mutableListOf("Kotlin", "PAB 2", "SOLID")
    val mataKuliahImmutable: List<String> = listOf("Kotlin", "Kalkulus", "ASD")

    println("List Mata kuliah:  $mataKuliahMutable")
    println(mataKuliahImmutable.joinToString())

    val mataKuliahUppercase = mataKuliahImmutable.map {
        it.uppercase()
    }
    println("List Mata kuliah Uppercase: $mataKuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahImmutable.filter {
        it.length>10
    }

    println("Mata Kuliah Filter (>10): $matakuliahLebihDariNKarakter")
}