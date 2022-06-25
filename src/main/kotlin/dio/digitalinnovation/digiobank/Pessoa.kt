package dio.digitalinnovation.digiobank

class Pessoa {
    val nome: String = "Adelçon"
    val cpf: String = "123.456.789-10"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }

}

fun main() {
    val ad = Pessoa()

    println(ad.nome)
    println(ad.cpf)
    println(ad.Endereco().rua)
}