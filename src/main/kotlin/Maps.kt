fun main() {
    val edadDesuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDesuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )

    println(edadSuperHeroesMutable)
//Agregar elementos a los maps
    edadSuperHeroesMutable.put("Wolverine", 45)
    println(edadSuperHeroesMutable)
    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)
    //obtener el valor del map
    val edadIronman = edadSuperHeroesMutable["Ironman"]
    println(edadIronman)
    //eliminar un elemento en el map
    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)
    //ver las key de un map
    println(edadSuperHeroesMutable.keys)
    //ver los valores de un map
    println(edadSuperHeroesMutable.values)
}