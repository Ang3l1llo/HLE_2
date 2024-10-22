package Ejercicio5

class Personaje (val nombre : String, var vida : Int, var ataque : Int){

    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}

