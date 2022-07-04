package ScopeFunctions

fun main() {
    var nombre:String? = null
    nombre?.let {
        valor -> println("El nombre no es nullo, es $valor")
    }
    nombre = "Miguel"
    nombre.let {
       valor -> println("El nombre no es nullo, es $valor")
    }
}