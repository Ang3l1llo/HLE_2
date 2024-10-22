import Ejercicio5.Personaje

fun main(){

    //Se ahorra mucho código y por tanto tiempo, tanto en la creación de la clase
    //Cuyo constructor va implícito al declarar los atributos
    //Como a la hora de instanciarla
    val Goku = Personaje("Goku",10000,1000)

    Goku.mostrarInfo()
}