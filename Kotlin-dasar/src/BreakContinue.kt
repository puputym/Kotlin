fun main() {
    //digunakan pada semua perulangan kotlinan
    // break digunakan untuk mengentikan perulangan kotlinan
    //continue digunakan mengentikan perulangan kotlinan yg saat itu sedang berjalan
    var i =0
    while (true){
        println("perulangan $i")
        i++
        if (i > 100){
            break
        }
    }

    for (i in 1..100){
        if (i % 2 == 0){//jika angkanya genap maka continue/lanjut ke perlunagna selanjutnya, tapi kalo ganjil maka print
            continue
        }
        println(i)
    }



}