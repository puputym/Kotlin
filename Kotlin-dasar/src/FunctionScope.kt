//function dalam function
//jadi hanya function aja yg bisa ngakese
//jadi function nya da dalam main
fun satu(){
    //error hanya main aja yg bisa ngagkes karena di dalam main kecuali function itu ada d luar main baru bisa d akses
    //contohHello()
}
fun dua(){
    //error
    //contohHello()

}
fun main() {
    fun contohHello(){
        println("Hello")
    }
    contohHello()
}