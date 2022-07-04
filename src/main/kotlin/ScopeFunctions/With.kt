package ScopeFunctions
/**Nos permite acceder directamente a las propiedades de una variable
 * que pasamos como parametro
 */

fun main() {
    val colores = listOf("Azul","Amarillo","Rojo")
    //nos permite acceder a las propiedades de colores sin necesidad de llamar a la variable
    with(colores){
        println("Nuestros colores son: $this")
        println("Esta lista tiene una cantidad de colores $size")
    }
}