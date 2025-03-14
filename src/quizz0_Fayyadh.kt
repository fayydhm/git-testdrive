fun main () {
    Vtabung()
    ikan()
    karang()
    println ("maka itulah hewan hewan yang hidup di akuarium tabung")
}

fun Vtabung () {
    val jarijari = 5
    val tinggi = 10
    val Pi = 3.14
    var volume = Pi*tinggi*jarijari*jarijari

    println ("maka volume tabung adalah " + volume +" M^3")

}
fun ikan () {
    val spesies = mutableListOf("paus","Hiu","barakuda")
    print ("jenis jenis ikan yang didalam tabung adalah ikan ")
    println (spesies [2])

}

fun karang () {
    val jenis = mutableMapOf(
        "scallop" to "kerang kipas",
        "Oyster" to "Tiram"
    )
    println ("maka kerang yang ada di dalam tabung " + jenis ["scallop"])
}

