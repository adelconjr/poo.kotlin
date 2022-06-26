package dio.digitalinnovation.digiobank.testes

import dio.digitalinnovation.digiobank.Cliente
import dio.digitalinnovation.digiobank.ClienteTipo

fun main() {
    val cliente = Cliente(
        nome = "Jose",
        cpf = "111.111.111-20",
        clienteTipo = ClienteTipo.PF,
        senha = "senha789"
    )

    println(cliente)
    TesteAutenticacao().autentica(cliente)
}