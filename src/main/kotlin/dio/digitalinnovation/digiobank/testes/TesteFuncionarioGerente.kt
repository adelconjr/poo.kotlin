import dio.digitalinnovation.digiobank.Gerente
import dio.digitalinnovation.digiobank.testes.TesteAutenticacao

fun main() {
    val gerente = Gerente( nome = "Joao", cpf = "987.654.321-00", salario = 2000.00, senha = "senha123" )

    ImprimeRelatorioFuncionario.imprime(gerente);
    TesteAutenticacao().autentica(gerente)
}