const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Maria"
    println(nombre)
    println(PI)

    val boolean : Boolean = true
    val numeroLargo : Long = 3L
    val double : Double = 2.7182
    val float : Float = 1.1F

    val primerValor = 20
    val segundoValor = 10
    //val tercerValor = primerValor.minus(segundoValor)
    val tercerValor = primerValor - segundoValor

    println(tercerValor)

    //las variables de strings se pueden sumar
    val apellido = "Vetri"
    val giuseppe = "Guiseppe"
    //template en kitlin
    val nombreCompleto = "Mi nombre es $giuseppe $apellido"
    println(nombreCompleto)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}