import dio.digitalinnovation.digiobank.Gerente

fun main() {
    val gerente = Gerente( nome = "Joao", cpf = "987.654.321-00", salario = 2000.00 )

    ImprimeRelatorioFuncionario.imprime(gerente);
}