package one.digitalinnovaio.collection

import kotlin.math.max

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0,4000.0)

    for (i in salarios){
        println(i)
    }
    println("_______________")
    //println("Maior salário: ${salarios.max()}")
   // println("Menor salário: ${salarios.min()}")
    println("Média salário: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter{it > 2500.0}
    println("_______________")

    salariosMaior2500.forEach {println(it)}


}