fun main() {
    //mirip percabanag if bedanya lebih sederhana le//untuk kasus sederhana juga
//    if (nilai ==A){
//        good job
//    }else if (nilai == B){
//        good
//    }
    val nilai ='A'
    when (nilai) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("not bad")
        'D' -> println("bad")
        'E' -> println("bad bad")
        else-> println("ups")
    }
    when (nilai) {
        //if(niali ==A || nilai == B|| nilai == C)
        'A', 'B', 'C' -> println("lulus")//multiple opsi
        'E' -> println("Tidak lulus")
        else-> println("try again")
    }
    val passValue = arrayOf('A', 'B', 'C')
    when (nilai) {
        in passValue -> println("selamat anda lulus")//multiple opsi
        !in passValue -> println(" maaf anda Tidak lulus")
    }
    val nama ="Puput"
    when (nama) {
        is String -> println("nama adalah String")//multiple opsi
        !is String -> println("Bukan String")
    }
    //when pengganti if else expression
    val examValue = 90
    when{
        examValue > 80 -> println("Amazing")//kaya if nya
        examValue > 60 -> println("not bad")//else if
        else -> println("Try again next year")
    }
}