fun main() {
    val listaDeFrutas: List<String> = listOf("Manzana", "Pera","Frambrueza","Durazno")
    for (fruta in listaDeFrutas){
        println("hoy voy a comerme una fruta llamada $fruta")
    }
//puede escribirse en una sola linea
    for (fruta in listaDeFrutas) println("hoy voy a comerme una fruta llamada $fruta")
    //foreach      aqui se esta utilizando una función anonima entre llaves
    listaDeFrutas.forEach{ fruta-> println("hoy voy a comerme una fruta llamada $fruta")}
    //map
    val caracteresDeFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFrutas)

    //filter
    val listaFiltrada = caracteresDeFrutas.filter { largoDeFrutas -> largoDeFrutas > 5 }
    println(listaFiltrada)
}