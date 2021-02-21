fun main() {
    sayHello("Chanra", "bdg")
    sayHello("puput", "Majalengka")
    hello("puput", "yuniar")
    hello("puput", null)
}

fun sayHello(nama: String, kota: String){
    println("Hello nama saya $nama dari $kota")
}
fun hello(firstName: String, lastName: String?){
    if (lastName ==null){
        println("Hello $firstName")
    }else{
        println("Hello  $firstName $lastName")
    }
}