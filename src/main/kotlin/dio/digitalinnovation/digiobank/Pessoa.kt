package dio.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Adelçon"
    var cpf: String = "123.456.789-10"
    private set

    constructor()
    fun pessoaInfo() = "$nome $cpf"
}

fun main() {
    val ad = Pessoa()

    println(ad.pessoaInfo())
}