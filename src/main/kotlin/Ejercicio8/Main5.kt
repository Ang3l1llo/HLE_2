import Ejercicio8.Personaje

fun main(){
    val Goku = Personaje("Goku", 10000, 1000)
    val Vegeta = Personaje("Vegeta", 9000, 900)

    while(Goku.vida > 0 && Vegeta.vida > 0){
        Goku.vida -= Vegeta.ataque
        Vegeta.vida -= Goku.ataque

        println("Vegeta golpea a goku con el cañón garlick. Vida de Goku: ${Goku.vida}")
        println("Goku impacta con su kamehameha. Vida de Vegeta: ${Vegeta.vida}")
    }
    if(Goku.vida < 0) println("Vegeta ha ganado el combate")
    else println("Goku ha ganado el combate")
}