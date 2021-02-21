fun main() {
    //&& dan
    //|| atau
    //! kebalikan/tidak gak ngebandingin 2 boolean kaya yg atas
    //&& harus dua2nya benar
    //|| bisa salah satu benar maka hasilnya true
    //false or false maka false
    // ! true jadi false or false//false jadi true or false

    val finalexam = 80
    val kehadiran = 75
    val quis = 80

    val kkmexam = finalexam > 75
    val kkmhadir = kehadiran > 80
    val kkmquis = quis > 75
    val apakahlulus = kkmexam && kkmhadir && kkmquis
    //val apakahlulus = (kkmexam && kkmhadir) && kkmquis// dibandingnya yg 2 awal dulu lalu hasilnya d bandingin sam ayg terkahir
    //val apakahlulus = (kkmexam && kkmhadir) || kkmquis// berlaku untuk or juga
    println(apakahlulus)
}