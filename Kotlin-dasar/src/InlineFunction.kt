//inline function kemampuan kotlin mengubah HOF menjadi inline function
//dmna dgn inline function, code HOF akan di duplicate agara pada saat runtime, aplikasi tidak perlu membuat object lambda berulang2
//ketika di compile akang seperti function biasa kaya tailrecursive
//pakai ketika butuh saja
//cek ke tools -> kotlin->show by code
//kalo pengen salah satu paramteernya yg inline pakai noinline di parameternya
inline fun hello(name:()-> String, noinline name2:()-> String):String{
    return "hello ${name()} ${name2()}"
}
fun main() {
//    println(hello{"Puput"})
//    println(hello{"yuniar"})
    for (i in 1..100){
        println(hello({"puput"}, {"yuniar"}))
    }
}