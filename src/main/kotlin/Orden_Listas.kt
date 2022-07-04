fun main() {
    val numeroDeLoterias = listOf(11,22,43,56,78,66)
    //ordenando la lista
    val numeroSorted = numeroDeLoterias.sorted()
    println(numeroSorted)
    //ordenando lista automaticamente
    val numerosDeLoteriaDescendentes = numeroDeLoterias.sortedDescending()
    println(numerosDeLoteriaDescendentes)
    //ordenar con una condisión
    val ordenarPorMultiplos = numeroDeLoterias.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)
    //ordenación aleatoria
    val numerosAleatorios = numeroDeLoterias.shuffled()
    println(numerosAleatorios)
    //ordenar de forma inversa
    val numerosEnReversa = numeroDeLoterias.reversed()
    println(numerosEnReversa)
    //Map: Permito convertir un elemento a otro tipo
    val mensajeDeNumeros = numeroDeLoterias.map {
            numero -> "Tu numero de loteria ${numero}"
    }
    println(mensajeDeNumeros)
    //filter: filtrar elemento dependiendo de una condición
    val numeroFiltrado = numeroDeLoterias.filter { numero -> numero > 50}
    println(numeroFiltrado)
}