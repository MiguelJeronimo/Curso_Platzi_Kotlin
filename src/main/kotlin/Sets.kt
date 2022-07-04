fun main() {
    //los Sets no pueden tener elementos repetidos
    //Sets inmutables
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)
    //Set mutables
    val numeroFavoritos = mutableSetOf(1,2,3,4)
    println(numeroFavoritos)
    numeroFavoritos.add(5)
    println(numeroFavoritos)
    //eliminar elementos en sets
    //en los sets se elimina dependiendo del valor que contenga,
    // que en las listas se elimina mediante la posición dentro de la lista
    numeroFavoritos.remove(5)
    println(numeroFavoritos)
    val valorDelSet: Int? = numeroFavoritos.firstOrNull{ numero -> numero > 2}
    println(valorDelSet)
}