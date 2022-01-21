package one.digitalinnovaio.collection

fun main(){
    val joao = Funcionarios("Joao",1000.0, "CLT")
    val pedro = Funcionarios("Pedro",5000.0, "CLT")
    val maria = Funcionarios("Maria",4000.0, "PJ")

    val funcionarios= listOf(joao,pedro,maria)

    funcionarios.forEach {println(it)}
    println("_____________")
    println(funcionarios.find { it.nome == "Maria"})
    println("_____________")
    funcionarios.sortedBy { it.salario }.forEach {println(it)}
    println("_____________")
    funcionarios.groupBy { it.tipoContrato }.forEach {println(it)}

}

data class Funcionarios(
    val nome: String,
    val salario: Double,
    val tipoContrato: String)
    {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
    }