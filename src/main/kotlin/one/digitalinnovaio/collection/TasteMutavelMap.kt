package one.digitalinnovaio.collection

fun main() {
    val joao = Funcionarios("Joao", 1000.0, "CLT")
    val pedro = Funcionarios("Pedro", 5000.0, "CLT")
    val maria = Funcionarios("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("___________")

    repositorio.findAll().forEach{println(it)}

}