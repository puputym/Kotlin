fun main() {
    fun sayHello(name: String =""): String{

    // untuk if
//        return if (name == ""){//retrunnya disimpan disini untuk mempersingkat jika if elsenya ada banyak
//            "hello cantik!"//biasanya disini
//        }else{
//            "hello $name"//biasanya disini juga
//        }
//    }
        //untuk when
        return when(name) {//disimpan disinin returnnya
            ""-> "Hello Cantik"//biasanya disini setelah tanda panah
            else-> "Hello $name"

        }
    }
    println(sayHello("Puput"))
    println(sayHello())
}