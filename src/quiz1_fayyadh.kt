fun main (){
    grade()
    deskripsi()

}

fun grade () {
    val sangatbagus = 'A'
    val bagus = 'B'
    val cukup = 'C'

    println("Andi mendapat matematika dengan grade : "+ sangatbagus)
    println ("Anton mendapatkan nilai fisika dengan grade : $bagus")
    println ("Budi mendapatkan nilai kimia dengan grade : $sangatbagus")
    println ("Sehingga orang tua mereka semua bangga")

}

fun deskripsi () {
    val keterangan = mutableMapOf(
        "A" to "Orang tuanya senang",
        "B" to "Orang tuamya Biasa aja",
        "C" to "Orang tuanya cekewaa"
    )
    println("tetapi mereka semua mendapat kan grade buruk di infor sehingga " + keterangan ["C"])
}
