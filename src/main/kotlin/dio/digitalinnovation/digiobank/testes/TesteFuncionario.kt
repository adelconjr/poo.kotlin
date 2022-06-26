package dio.digitalinnovation.digiobank.testes

import dio.digitalinnovation.digiobank.Funcionario
import java.math.BigDecimal

fun main() {
    val funcionario = Funcionario( nome = "Adelçon", cpf = "123.456.789-10", salario =  BigDecimal.valueOf(1200) )

    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}