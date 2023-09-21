enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (var nome: String, var idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int, var nivel: Nivel)

 val conteudoCss1 = ConteudoEducacional("CSS Básico", 60, Nivel.BASICO)
 val conteudoCss2 = ConteudoEducacional("CSS Intermediário", 120, Nivel.INTERMEDIARIO)
 val conteudoCss3 = ConteudoEducacional("CSS Avançado", 180, Nivel.AVANCADO)
    
 val listaConteudosCss = mutableListOf(conteudoCss1, conteudoCss2, conteudoCss3)
    
 val formacaoCss = Formacao("Formacao CSS", listaConteudosCss)

 val conteudoKt1 = ConteudoEducacional("Kotlin Básico", 60, Nivel.BASICO)
 val conteudoKt2 = ConteudoEducacional("Kotlin Intermediário", 120, Nivel.INTERMEDIARIO)
 val conteudoKt3 = ConteudoEducacional("Kotlin Avançado", 180, Nivel.AVANCADO)
    
 val listaConteudosKotlin = mutableListOf(conteudoKt1, conteudoKt2, conteudoKt3)
    
 val formacaoKotlin = Formacao("Formacao Kotlin", listaConteudosKotlin)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        
        inscritos.add(usuario)
        println("O usuario ${usuario.nome} foi matriculado em ${this.nome} com sucesso.")
    }
    
}

fun main() {
    val aluno1 = Usuario ("Guilherme", 22)
    formacaoKotlin.matricular(aluno1)
    
    val aluno2 = Usuario ("Isadora", 21)
    formacaoCss.matricular(aluno2)
}
