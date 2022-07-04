package ScopeFunctions
/**
 * Run: Nos ejecuta una serie de operaciones luego de declarar una variable
 * */
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4A","Huawei Redmi 9", "Xiaomi Mi A3")
        .run {
            //contains sirve para comparar cadenas, si esta contiene la cadena que se envia por parametro(Devuelve true)
            removeIf { movil->movil.contains("Google") }
            this
        }
    println(moviles)
}