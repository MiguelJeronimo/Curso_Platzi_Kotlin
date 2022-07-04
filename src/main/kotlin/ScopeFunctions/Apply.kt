package ScopeFunctions
/**
 * Apply: Nos permite realizar operaciones sobre una variable y luego devolver el valor
 * */
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4A","Huawei Redmi 9", "Xiaomi Mi A3").apply {
        removeIf { movil -> movil.contains("Google") }
    }
    println(moviles)
    val colores:MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("Cantidad de colores es: $size")
    }
}