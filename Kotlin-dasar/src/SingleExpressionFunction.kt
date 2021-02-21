//deklarasi function hanya dgn 1 baris kode
//hanya butuh = setelah deklarasi nama function dan tipe data pengembalian
//tanpa kurung kurawal
fun double(a: Int): Int = a*2
fun hi(name: String): Unit =println("hi $name")
fun main() {
    println(double(10))
    hi("puput")
}