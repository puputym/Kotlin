fun main() {
    //val values = arrayOf(10, 10, 10, 10) kalo parameternya pake array
    val result = hitungTotal(10,10, 10)//maka disini langsung diiis angkanya
    println(result)
}
//variabel argumen (varagrs) function
//parametr di posisi terkahir bisa dijadikan jadi varagas
//datanya bisa menerima lebih dari satu input atau semacam array
//bedanya dgn array
// parameter array kita wajib membuat array terlebih dahulu sblm di kirimkan ke function
//jika parameter varagrs kita bisa langsung mengirim datanya, jika lebih drai satu cukup gunakan tanda koma
//varagrs untuk konversi jadi array
//fun hitungTotal(values : Array<Int>): Int{
//    var total = 0
//    for (value in values){
//        total += value
//    }
//    return total
// }
//kalo pake varags cukup kaya gini nulisnya maka isi dalam fungsi tsb berubah jadi array
fun hitungTotal( vararg values : Int ) : Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
 }