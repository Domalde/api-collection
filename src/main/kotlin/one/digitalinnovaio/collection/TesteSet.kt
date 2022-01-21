package one.digitalinnovaio.collection

fun main(){
    val joao = Funcionarios("Joao",1000.0, "CLT")
    val pedro = Funcionarios("Pedro",5000.0, "CLT")
    val maria = Funcionarios("Maria",4000.0, "PJ")

    val funcionarios = setOf(joao, pedro)
    val funcioanrios2 = setOf(maria)

    val resultado = funcionarios.union(funcioanrios2)
    resultado.forEach { println(it)}
    println("_____________")
    val funcionarios3 = setOf(joao, pedro, maria)
    val subtracao = funcionarios3.subtract(funcioanrios2)
    subtracao.forEach{ println(it)}
    println("_____________")
    val intersect = funcionarios.intersect(funcionarios3)
    intersect.forEach { println(it) }
}