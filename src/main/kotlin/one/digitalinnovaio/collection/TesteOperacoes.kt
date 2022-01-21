package one.digitalinnovaio.collection

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0,4000.0)

    for (i in salarios){
        println(i)
    }
    println("_______________")
    println("Maior salário: ${salarios.maxOf {it}}")
    println("Menor salário: ${salarios.minOf {it}}")
    println("Média salário: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter{it > 2500.0}
    println("_______________")

    salariosMaior2500.forEach {println(it)}
    println("_______________")
    println(salarios.count {it in 2000.0..5000.0})
    println(salarios.find {it == 1000.0})
    println(salarios.any {it == 1000.0})





}