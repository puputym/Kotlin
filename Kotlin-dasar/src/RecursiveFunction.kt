//function yang memamnggil dirinya sendiri
//contoh kasus factorial dengan recursiv


fun main() {
    // menggunaka factrorial for loop
    fun factrorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *=i
        }
        return result
    }
    println(factrorialLoop(10))

    fun factrorialRecursive(values: Int): Int{
        return when(values){
            1->1 //jika valuesnya bukan satau maka masuk ke else
            else-> values * factrorialRecursive(values-1)
        }
    }
    println(factrorialRecursive(5))
}