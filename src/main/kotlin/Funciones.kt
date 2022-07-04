fun main() {
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)

}
//funcion que devuelve unit
fun imprimirFrase(frase:String):Unit{
    println("Tu frase es: ${frase}")
}
//funcion con retorno
/**fun randomCase(frase:String):String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2)==0){
        frase.toUpperCase()
    }else{
        frase.toLowerCase()
    }
}*/
//funciones de extensión
fun String.randomCase():String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2)==0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}