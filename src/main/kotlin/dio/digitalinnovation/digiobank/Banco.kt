package dio.digitalinnovation.digiobank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "Nome: $nome Número: $numero"
}
