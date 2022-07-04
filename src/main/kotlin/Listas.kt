fun main() {
    //lista inmutable
    val listaDeNombres = listOf("Juan","Enrique","Cami")
    println(listaDeNombres)
    //lista mutable
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor: String? = listaDeNombres.firstOrNull()
    println(primerValor)

    //remover elementos de una lista
    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf{ caracter -> caracter.length > 3}
    println(listaVacia)

    //Arrays
    val myArray = arrayOf(1,2,3)
    println("Nuestro array: ${myArray}")
    println("Array como lista ${myArray.toList()}")
}