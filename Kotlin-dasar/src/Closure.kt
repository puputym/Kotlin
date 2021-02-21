//kemampuan  function, lambda, function berinteraksi dgn data2 sekitarnya dalam scope yg sama
//harapa gunakan fitur ini dgn sangant bijak karena bisa mengubah data milik org lain
fun main() {
    var counter = 0
    val lambdaIncrement: ()-> Unit= {
        println("Lambda Increment")
        counter++//conternya bisa d pakai di 3 function,lambda
    }
    val anonymousIncrement = fun(){
        println("Anonymous Increment")
        counter++
    }
    fun functionIncrement(){
        println("Function Increment")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}