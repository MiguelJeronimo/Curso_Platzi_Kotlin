fun main() {
    val nombreColor = "Carmesi"
    /*
    * El when sirve para comprar varias sentencias en vez de utilizar varios if
    * */
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegria")
        //comparar varios valores en una sola linea
        "Rojo","Carmesi" -> println("El rojo es el color del calor")
        //para poder comprar cuando el color no sea amarillo ni rojo utilizaremos el else dentro del when
        else -> println("Error, no tengo la información del color")
    }
    //comparar enteros
    val code = 500
    when(code){
        //comprar rangos dentro del when utilizando la palabra reservada in
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado!")
    }
    val tallaZapatos = 45
    val mensaje = when(tallaZapatos){
        41,43 -> "Tenemos diponible"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento, no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41,42,43,44 y 45"
    }
    println(mensaje)
}