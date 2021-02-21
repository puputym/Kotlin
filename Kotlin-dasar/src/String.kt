fun main() {
    var first: String ="Puput"
    var last: String ="yuniar"
    var fullName: String =first + " " + last
    var addres : String = """
        Ds. Mekarmulya, Kecematan Lemahsugih
        Kabupaten majalengka
        Jawa Barat
    """.trimIndent()
    var addres1: String = """"
        >Ds. Mekarmulya, Kecematan Lemahsugih
        >Kabupaten majalengka
        >Jawa Barat
    """.trimMargin(">")
    println(first)
    println(last)
    println(addres)

    //menggabungkan String
    //bisa pake operator +
    println(fullName)
    //bisa pkae string template juga
    //yaitu pake dolar depannya
    var fullName2: String = "$first $last"
    println(fullName2)
    var description: String = "total $fullName2 = ${fullName2.length}"
    println(description)
}