fun main() {
    var myInt: Int = 130
    var myByte: Byte = myInt.toByte()

    println(myByte)
    // cara menampilkan angka memjadi biner.
    println(Integer.toBinaryString(myInt).padStart(length = 32, padChar = '0'))
    // alasan hasil convert negatif karena komputer membaca angka dengan cara biner.

    var myInt2: Int = 40_000
    var myShort: Short = myInt2.toShort()

    println(myShort)

    var myDouble: Double = 99.86
    var myInt3: Int = myDouble.toInt()

    println(myInt3)

    var myInt4: Int = 2_000_000_000
    var myLong: Long = myInt4.toLong()

    println(myLong)

    var myDouble2: Double = 1234.56789123
    var myFloat: Float = myDouble2.toFloat()

    println(myFloat)

    var myInt5: Int = 66
    var myChar: Char = myInt5.toChar()

    println(myChar)
}