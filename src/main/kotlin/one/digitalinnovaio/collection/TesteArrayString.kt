package one.digitalinnovaio.collection

fun main(){
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for (i in nomes){
        println(i)
    }

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Maria","João", "José")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}