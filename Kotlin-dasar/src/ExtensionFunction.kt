//fungsinya menambahkna  function tipe data pada tipe data yg sudah ada
//cukup tambahakn tipe data lalu diikuti dgn tanda .(titik)
//menagakses pake kata kunci this
fun String.hello(): String{//fungsi dengan tipe data string
    return "Hello $this"//memanngilanya pake this, karean dalam tana kutip make pake $ kalo di luar itu bosa juga kok

}
fun main() {
    val name ="Puput"
    val hello = name.hello()

    println(hello)
    println(name.hello())
    //name.hello()

}