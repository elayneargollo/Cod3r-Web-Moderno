const prod1 = {} /* Objeto eh uma colecao de valores e chaves */

prod1.nome = 'Celular Ultra Mega'
prod1.preco = 4998.90
prod1['desconto'] = 0.40

console.log(prod1)

const prod2 = {
    nome: 'Camisa',
    preco: 79.90
}

console.log(prod2)

/* estrutura aninhada de objeto */
var prod7 = {
    nome: 'Calca', /* chave/valor */
        prod3: {
            nome: 'Cigarrete',
            preco: 89.00,
        },
        prod4: {
            nome: 'Skinny',
            preco: 90.99,
        }
}

console.log(prod7)