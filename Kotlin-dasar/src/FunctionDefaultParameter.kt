//paramter yg tidak wajib diisi saat pemanggilannya
//default paramter 
fun hello(firstname: String, lastname: String =""){
    println("hello $firstname $lastname")
}
fun main() {
    //paramter nya da dua tapi tidak wajib di isi
    hello("puput")
    //bisa dua paramter
    hello("puput", "yuniar")
}