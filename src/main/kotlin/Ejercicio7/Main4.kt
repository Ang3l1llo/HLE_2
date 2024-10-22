fun main() {

    //Se ahorra nuevamente mucho código ya que no hace falta interfaz alguna
    //A la izquierda se le pasan los parámetros y a la derecha el bloque de código a ejecutar
    println(multiplicar(5))

    val operacion: (Int, Int) -> Int = { a, b -> a + b }
    println(operacion(3, 4))
}

fun multiplicar(num: Int): Int {
    return num * 2
}