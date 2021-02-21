//label adalah pennanda
//semua expression di kotlin bisa ditandai dengan label
//untuk membuat label dikotlin, cukup menggunakan nama label diikuti dgn karakter @
//gak boleh ada spasi
//kegunaanya label bisa diintergrasikan dengan break, continue dan return
//biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada,
//namun dengan menggunakan label kita bisa mennetukan label mana kode akan berhenti
//tidak rekomendasikan untuk digunakan
fun main() {
    loopI@ for(i in 1..10){
      loopJ@ for(j in 0..10){
            println("$i * $j = ${i * j}")
            if (j==5){
                break@loopI
            }
        }
    }
    println()
    loopI@ for(i in 1..10){
        loopJ@ for(j in 0..10){
            if (j>5){
                continue@loopJ
            }
            println("$i * $j = ${i * j}")
        }
    }
    //return to label
    fun test(name: String, operation:(String) -> Unit): Unit =operation(name)
        test("eko") test@{
            if(it ==""){
                return@test
            }else {
                println("eko")
            }
        }

}