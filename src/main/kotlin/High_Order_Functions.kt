fun main() {
    val largoDelValorInicial = superFuncion(valorInicial="Hola", block={
        valor -> valor.length
    })
    println(largoDelValorInicial)
    val labmda : () -> String = funcionInception("Enrique")
    val valorLambda:String = labmda()
    println(valorLambda)
}
fun superFuncion(valorInicial:String, block:(String)->Int):Int{
    return block(valorInicial)
}

fun funcionInception(nombre:String):()->String{
    return {
        "Hola desde la lambda"
    }
}