const saudacao = 'Opa' // contexto lexico 1 => eh o contexto no qual a variavel foi definida fisicamente no codigo

function exec(){
    const saudacao = 'Falaa' // contexto lexico 2
    return saudacao
}

// Objetos sao grupos aninhados de pares nome/valor
const cliente = {
    nome: 'Pedro',
    idade: 32,
    peso: 95.2,
    endereco: {
        logradouro: 'rua muito legal',
        numero: 123
    }
}

console.log(saudacao)
console.log(exec())
console.log(cliente)
