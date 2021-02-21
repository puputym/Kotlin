//HOF adalah function yang menggunakan function sbg parameter atau mengembalikan function
//lambda dalam function
fun main() {
    fun hello(value: String, tranform : (String)-> String) : String {
        val name = tranform(value)
        return "hello $name"
    }
    val lambdaUpper= {result: String -> result.toUpperCase()}
    println(hello("puput", lambdaUpper))
    println(hello("cantik", {result: String -> result.toLowerCase()}))

    //biar enak liatnya
    //dinamakan trailing lambda
    val hasil = hello("Puput") {
        it.toLowerCase()
    }
    println(hasil)

}