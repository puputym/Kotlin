const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"


fun main() {
    //varaibel mutable bisa di ubah contohnya var
    // immutable tidak bisa diubah contohnya val
    // var/val namaVaribale: tipeData = data
    var first: String ="Puput"
    var last ="yuniar"//gapapa gk ngemasukin tipe datanya juga kalo ada valuenyasudah terdeteksi string/ atau yg lainnya
    //mengubah varibel
    last ="maulida yuniar"//kalo menggunakan val akan error
    println(last)

    //Nullable
    //bisa menggunakan tanda tanya setelah tipe datanya
    //tapi tidak direkomendasikan fitur ini teh
    var firstName: String? = "Puput"
    firstName = null
    //caranya salah karena ada Nullable
    //println(firstName.length)
    //benar
    println(firstName)
    println(firstName?.length)

    //Variable Constants untuk keperluan global bisa d akses dimanapun
    //wajib pake val bukan var
    println("ini adalah $APP versi $VERSION")
}