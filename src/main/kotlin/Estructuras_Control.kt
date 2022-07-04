fun main() {
    val nombre = ""
    if (nombre.isEmpty()) print("El largo de nuestra variable es ${nombre.length}") else println("Error, lavariable esta vacia")
    //asinacion inmutable, se esta asigando la condicional en una asignacion de variable
    val mensaje : String = if (nombre.length>4){
        "Tu nombre es largo"
    } else if(nombre.isEmpty()){
        " El nombre esta vacio"
    }
    else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}