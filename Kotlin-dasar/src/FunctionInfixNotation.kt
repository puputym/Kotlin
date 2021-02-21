//harus sbg function memebr(di OOP) atau function extension
//harus memeilki 1 parameter
//gak boleh default atau varags parameternya
infix fun String.to(type: String): String{
    if(type=="UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}
fun main() {
    val result = "Puput yuniar" to "UP"//LO untuk toLowerCase
    println(result)
}