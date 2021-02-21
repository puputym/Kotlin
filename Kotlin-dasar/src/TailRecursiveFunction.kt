//teknik mengubah recursive function yang kita buat menjadi looping biasa ketika dijalankan
//tidak semua recursive function bisa ssecara otomatis dibuat menjadi tail recursive function, ada syarat2nya
//di functionnya harus tambahakna tailrec
//hanya memanggil dirinya sendiri tanpa ada embel2 dengan data lain
fun main() {
    tailrec fun display(value: Int) {//kalo tanpa tailrec akan stackoverflow
        println("Recursive $value")
        if(value > 0){
            display(value-1)//gak boleh ada embel2 lagi kaya dikali atau dibagi
        }
    }
    println(display(10000))

    tailrec fun factrorialRecursive(values: Int ,total: Int=1): Int{
        return when(values){
            1->total //jika valuesnya bukan satau maka masuk ke else
            else-> factrorialRecursive(values-1, total*values)
        }
    }
    println(factrorialRecursive(10))
}