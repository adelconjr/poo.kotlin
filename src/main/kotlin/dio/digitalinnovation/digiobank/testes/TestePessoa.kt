package dio.digitalinnovation.digiobank.testes

import dio.digitalinnovation.digiobank.Pessoa

fun main() {
    val ad = Pessoa(nome = "Adelçon", cpf = "123.456.789-10")

    println(ad.nome)
    println(ad.cpf)
}