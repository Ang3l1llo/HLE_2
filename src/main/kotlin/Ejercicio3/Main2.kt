
fun main(){

    //Lo más característico es q se simplifica mucho la sintaxis, puesto que no hay que declarar tipo

    var cofres = arrayOf("Espada","Escudo","Pocion")

    for(items in cofres){
        println("Has encontrado: ${items}")
    }
}