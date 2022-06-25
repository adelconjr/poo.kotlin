package dio.digitalinnovation.digiobank.testes

import dio.digitalinnovation.digiobank.Banco

fun main() {
    val digioBank = Banco( nome = "DigioBank", numero = 12 )

    println(digioBank.info())

    val banco2 = digioBank.copy( nome = "Banco 2" )

    println(banco2.info())
}