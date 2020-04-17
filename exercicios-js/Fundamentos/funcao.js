console.log(typeof Object)

class Produto{}
console.log(typeof Produto)

/* 
Uma funcao eh um verbo, uma acao. Define um bloco de codigo.
Ela recebe os dados de entrada, realiza o passo a passo e no final retorna um resultado.
Toda funcao tem um nome que pode ser reutilizada durante o programa.

Ela pode não receber nenhum paramentro e tbm n retornar nenhum resultado ;)
*/

//funcao sem retorno
function imprimirSoma(numero1, numero2){
    console.log(numero1 + numero2)
}

imprimirSoma(2,3)

//Funcao com retorno
function soma(a, b=1){
    return a+b
}

console.log(soma(3,2))
console.log(soma(2))

//Armazenando uma funcao em uma variavel 
const mostarSoma = function (a,b){
    console.log(a + b)   
}
mostarSoma(2,5)

//Armazenando uma funcao arrow em uma variavel
const adicao = (a,b) => {
    return a+b
}
console.log(adicao(2,7))

//Retorno implicito
const subtracao = (a,b) => a - b
console.log(subtracao(1,1))