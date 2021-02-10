// Tudo que será executado rodará na main()

// Tipos de dados
/*
 Int, Float, Long, Byte, Short, Null, Char, Array, Double, Boolean
*/

// Tipos de variaveis
/*
Var - Mutavel, CamelCase
Val - Imutável, CamelCase
Const Val - Valor Imutavel, SNAKE_UPPERCASE - constante
*/
package app

const val MIN_AGE = 16
const val MAX_AGE = 90

fun main(args: Array<String>){
    // Variavel com tipagem para string
    var currentAge:Int
    
    println(MAX_AGE)
    
    currentAge = 22
    println(currentAge)
    // Você não pode alterar o tipo da variavel,
    // precisa ser convertido
    currentAge = "200".toInt()
    println(currentAge)

}