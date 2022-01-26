package one.digitalinnovaio.collection

fun main() {
    val joao = Funcionarios("Joao", 1000.0, "CLT")
    val pedro = Funcionarios("Pedro", 5000.0, "CLT")
    val maria = Funcionarios("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("_________LIST_________")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("__________________")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("_________SET_________")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("__________________")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    println("__________________")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }



}