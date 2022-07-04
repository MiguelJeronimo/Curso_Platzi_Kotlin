fun main() {
    //Parametros nombrados
    imprimirNombre(nombre="Miguel",apellido="Jerónimo")
}
//Asignar parametros por defecto
fun imprimirNombre(nombre:String, segundoNombre:String ="", apellido:String){
    println("Mi nombre es $nombre $segundoNombre $apellido")
}