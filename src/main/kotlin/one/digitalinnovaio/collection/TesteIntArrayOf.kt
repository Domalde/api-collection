package one.digitalinnovaio.collection

fun main(){
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println(it)
    }

    values.forEach { valor ->
        println(valor)
    }

    for (i in values){
        println(i)
    }
}