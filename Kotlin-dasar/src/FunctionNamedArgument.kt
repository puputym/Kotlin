//fitur dimana kita bisa menyebutkan paramter saat memamnggil function tanpa tau urutannya, tanpa wajib tahu posisi tiap parameternya bisa acak untuk memanggilnya
fun mahasiswa(nama : String, nim: Int, email: String){
    println("$nama $nim $email")
}

fun main() {
    mahasiswa(
        //meskipun urutannya berbeda saat di print sana
        //tetap akan mengikuti functionnya
        //bebas posiis isi paramterenya
        nim = 1800591,
        email = "puput@upi.edu",
        nama = "Puput yuniar"

    )
}