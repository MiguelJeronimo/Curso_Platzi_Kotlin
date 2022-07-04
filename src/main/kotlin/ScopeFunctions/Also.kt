package ScopeFunctions
/**
* Also: Nos permite contener una variable,
 * Luego ejecutar un codigo con esa variable,
 * Luego devolver como un parametro para que vuelva a ser utilizada por una función mas adeltante
* */
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4A","Huawei Redmi 9", "Xiaomi Mi A3").also {
        list->println("El valor original de la lista $list")
        //asReversed convertia la lista y la ordenava al revez
    }.asReversed()
    println(moviles)
}