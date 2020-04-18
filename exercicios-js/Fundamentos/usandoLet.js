/* nao havera conflito por que sao dois escopos diferentes */

var numero = 1
{
    /* ele procura no escopo menor primeiro, caso n tenha, ele procura no escopo mais abrangente */
    let numero = 2 /* estara visivel apenas dentro do bloco */
    console.log('dentro=', numero)
}
console.log('fora=', numero)

/* usando var em loop */
for (let i=0; i<10; i++){ /* variavel i so estara visivel dentro do bloco */
    console.log(i)
}
//console.log('i=',i)

/* usando let em loop2 */
const funcs = [] 

for (let j=0; j<10; j++){
    funcs.push(function(){
        console.log(j)
    })
}

funcs[8]()
funcs[2]()