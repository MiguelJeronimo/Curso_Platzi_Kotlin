fun main() {
    var nombre : String? = null
    //println(nombre?.length)
    try{
        throw NullPointerException("Referencia nula")
    } catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicación")
    }
    //try/catch asigando a una variable
    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {primerValor/segundoValor}catch (exception : Exception){0}
    println(resultado)
}