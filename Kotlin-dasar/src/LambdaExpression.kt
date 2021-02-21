//lambda expression adalah function yang tidak meimilki nama
//kita tidak perlu mengetik nama fun
//it parameternya cmn satu jadi gk perlu ngedeklarasiin ulang paramaternya jika parameternya satu
fun main() {
    val lambdaName: (String, String)->String ={ firstName:String, lastName:String->
        val result = "$firstName $lastName"
        result
    }
    println(lambdaName("puput", "Yuniar"))
    //
    val sayHello: (String) -> String ={
        "hello $it"
    }
    println(sayHello("Puput"))
    //method reference/function reference
    //cukup pake ::
    val toUppercase : (String) -> String = ::toUpper
    println(toUppercase("Puput"))
}
//method reference/function reference
fun toUpper(value: String): String = value.toUpperCase()