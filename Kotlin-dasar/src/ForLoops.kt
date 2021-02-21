fun main() {
    //For loops atau perulangan
    var names = arrayOf("EKO", "Puput", "Chandra")
    for (name in names) {
        println(name)
    }
    for (value in 0..100 step 10){
        println(value)
    }

    for (value in 100 downTo 0 step 5){
        println(value)
    }
    val ukuranArray = names.size-1
    for (i in 0..ukuranArray){
        println("index $i = ${names.get(i)}")
    }
}