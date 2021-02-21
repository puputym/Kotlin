fun main() {
    //array kumpulan data dengan tipe data yg sama
    val member: Array<String> = arrayOf("Puput", "Yuniar", "Maulida")
    val number= arrayOf(8,9,10);

    println(member[1])
    //mengubah isi index 0
    member.set(0, "cantik")
    println(member[0])
    println(number[1])

    val members: Array<String?> = arrayOfNulls(10)
    members[0] ="puput"
    members[3] = null
    println(members[0])
    println(members[1])
    println(members.size)



}