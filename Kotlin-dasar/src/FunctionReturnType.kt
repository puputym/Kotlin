//function yang mengembalikan data
fun jumlah(a: Int, b: Int): Int {
    val total = a + b
    return total//bisa dalam if else
}
fun bagi(a: Int, b: Int): Int {
    if (b==0){
        return 0
    }else{
        val result = a/b
        return result
    }
}
fun main() {
    //bisa gini
    println(jumlah(10, 10))
    println(jumlah(500, 10))
    //bisa gini
    val result = jumlah(100, 100)
    println(result)
    //kalo gini gak bakal ada hasilnya karen agk ada penampungnya
    //terhiraukan
    jumlah(5, 5)
    println(bagi(10, 0))
    println(bagi(10,10 ))
}