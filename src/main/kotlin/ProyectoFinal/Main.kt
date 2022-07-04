package ProyectoFinal

// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main() {
    while (true){
        println("Hola soy tu bola ocho magina")
        println("Cual de estas opciones deseas realizar:")
        println("1. Realizar una pregunta")
        println("2. Revisar todas las respuestas")
        println("3. Salir")
        //ReadLine es para ingresar datos por teclado
        val valorIngresado = readLine()
        //aplicando el when
        when(valorIngresado){
            "1" -> realizarPregunta()
            "2" -> mostrarRespuesta()
            "3" -> salir()
            else -> mostrarError()
        }
    }
}

fun mostrarError(){
    println("Vaya parece que has elegido una opción no validad, intente de nuevi.")
}

fun salir() {
    println("Hasta luego")
}

fun mostrarRespuesta() {
    TODO("Not yet implemented")
    println("A Selecciona una opción")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudosas")
    println("3. Revisar solo las respuestas negativas")
    val opcionesIngresadas = readLine()
    when(opcionesIngresadas){
        "1"-> mostrarRespuestasPorTipo()
        "2"-> mostrarRespuestasPorTipo()
        "3"-> mostrarRespuestasPorTipo()
        "4"-> mostrarRespuestasPorTipo()
        else-> println("Respuesta no valida!")
    }
}

fun mostrarRespuestasPorTipo(tipoDerespuesta:String = "TODOS") {
        when(tipoDerespuesta){
            "TODOS"-> respuestas.keys.forEach{respuesta->println(respuesta)}
            RESPUESTA_AFIRMATIVA-> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
                .also { respuestasPositivas -> respuestasPositivas.keys }
            RESPUESTA_NEGATIVA-> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
                .also { respuestasNegativas -> respuestasNegativas.keys }
            RESPUESTA_DUDOSA-> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
                .also { respuestasDudosas -> respuestasDudosas.keys }
        }
}

fun realizarPregunta(){
    println("¿Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta a eso es:")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}