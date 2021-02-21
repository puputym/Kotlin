fun main() {
    //var age: Byte = 30//kalo 200 bakal error karena rentangnya -179 sampai 179
    //tipe data numbers
    // 1. number : byte, short, int, long
    // 2. Floating desimal pakai . float & double
    //literal : decimal, hexa, binary
    //    decimalliteral = 100
    //    hexa = 0x
    //    binary 0b
    var age: Int = 200
    //ujungnya pake F kalo yg double tidak usah

    var sample: Float = 10.1F
    var binary: Int = 0b01010101
    //penggunaan angka bisa pake _ untuk mudah dibaca
    var price: Long = 9_000_000_000L

    println(age)
    println(sample)
    println(binary)

    //conversi angka ke tipe data lain
    var number: Byte = 100
    var int: Int = number.toInt()
    var doubleBinary: Double =binary.toDouble()
    println(doubleBinary)
    println(int)
}