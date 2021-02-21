//cara menggunaknaya beda sedikit
//
// mirip lambda tapi masih menggunakan func
fun main() {
    fun hello(value: String, tranform : (String)-> String) : String {
        val name = tranform(value)
        return "hello $name"
    }
    //anonymusFunction
    val upper = fun (value: String): String{
        return if (value ==""){
            "ups"
        }else{
            value.toUpperCase()
        }
    }
    println(hello("put", upper))
    println(hello("", upper))
}