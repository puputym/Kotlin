fun main() {
    //Range cuku gunain ..(titik dua kali)
    //0..10 range dari 0 sampai 10
    //count() mendapatkan totatl data di range dari
    //contains(value) mengecek apakah ada value tsb
    //first mendapatkan nilai operator
    //last mendapatkan niali terakhir
    //step mendapatkan nilai tiap kenaikan

    var range = 1..100
    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.contains(500))
    println(range.first)
    println(range.last)
    println(range.step)
    println()
    //range terbalik terbalik
    val range2 = 100 downTo 1//100 downTo 1 step 2
    println(range2)
    println(range2.count())
    println(range2.contains(50))
    println(range2.first)
    println(range2.last)
    println(range2.step)
}