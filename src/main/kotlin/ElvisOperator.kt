fun main() {
    var nombre : String? = null
    val caracteresDelNombre : Int = nombre?.length ?: 0
    println(caracteresDelNombre)
}