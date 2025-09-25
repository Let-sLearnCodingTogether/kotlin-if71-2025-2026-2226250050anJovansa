fun main() {
    print("Masukkan nama anda :")
    val namaPemain = readln()
    var kesehatanPemain: Int = 100
    var punyaKunciEmas: Boolean = false
    var jumlahPotion: Int = 2
    var sedangBermain: Boolean = true
    var pilihanRuang: Int

    while (sedangBermain == true) {
        statusInformation(namaPemain,kesehatanPemain,jumlahPotion)
        if(pintuMasukGua()==true){
            pilihanRuang = ruanganTekaTeki()
        }else{
            kesehatanPemain -= 25
            println("Kembali ke awal")
            continue
        }

        if(pilihanRuang == 1){
            println("Naga mengeluarkan api dan kesehatan pemain berkurang 35 poin")
            kesehatanPemain -= 35
        }else if(pilihanRuang == 2){
            println("Pemain mendapatkan kunci emas")
            punyaKunciEmas = true
        }else if(pilihanRuang == 3){
            println("Pemain digigit ular dan kesehatan pemain berkurang 15 poin")
            kesehatanPemain -= 15
        }else{
            println("Pemain kembali ke awal")
            continue
        }

        if(kesehatanPemain <= 0){
            println("Pemain Mati!!!")
            break
        }

        if(punyaKunciEmas == true){
            println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
            break
        }else{
            println("Pintu terkunci dan membutuhkan kunci emas")
        }

        println("Apakah ingin menggunakan potion y/n")
        var pilihanTiga = readln()
        if(pilihanTiga == "y"){
            jumlahPotion -= 1
            kesehatanPemain += 10
        }else{
            println()
        }
    }

}

fun statusInformation(nama: String, hp: Int, potion: Int) {
    println("Nama        : $nama")
    println("HP          : $hp")
    println("Sisa Potion : $potion")
}

fun pintuMasukGua(): Boolean{
    println("1). Jalur gelap dan seram")
    println("2). Jalur tenang dan sunyi")
    println("Didepan kamu terdapat 2 buah jalur (1,2)")
    var pilihPertama = readln().toIntOrNull()
    if(pilihPertama == 1){
        return true
    }else{
        println("Pemain menginjak perangkap dan kesehatan pemain berkurang 25 poin")
        return false
    }
}

fun ruanganTekaTeki(): Int{
    println("Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
    println("1). Naga")
    println("2). Griffin")
    println("3). Ular")
    println("4). Tidak memilih")
    println("Pilih patung untuk ditantang")
    var pilihKedua = readln().toIntOrNull()

    when(pilihKedua){
        1 -> return 1
        2 -> return 2
        3 -> return 3
        else -> return 4
    }

}