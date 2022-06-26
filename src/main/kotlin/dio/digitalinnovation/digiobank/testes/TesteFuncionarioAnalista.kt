package dio.digitalinnovation.digiobank.testes

import dio.digitalinnovation.digiobank.Analista

fun main() {
    val analista = Analista( nome = "Adelson", cpf = "123.456.789-10", salario =  1200.00 )

    ImprimeRelatorioFuncionario.imprime(analista);
}