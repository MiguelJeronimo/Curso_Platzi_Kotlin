fun main() {
    //declarando una lambda
    val myLambdas : (String) -> Int = { valor -> valor.length }
    //obtener el valor de la lambda, se debe invocar a la lambda
    val labmdaEjecutada :Int = myLambdas("Que pedo")
    println(labmdaEjecutada)
    //pasar una lambda como parametro
    val saludos = listOf("hello","Hola", "Chao")
    val longitudDeSaludos = saludos.map(myLambdas)
    //Esto es equivalente a que si hicieramos lo siguente
    val longitudSaludos = saludos.map {
        valor -> valor.length
    }
    println(longitudDeSaludos)
    println(longitudSaludos)
}