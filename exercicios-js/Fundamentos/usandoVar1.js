{{{{var sera= 'Sera???'}}}}
console.log(sera)

function teste(){
    var local = 123  /* variavel disponivel apenas dentro da funcao */
    console.log(local)
}

teste()

var numero = 1 
{
    var numero = 2
    console.log('dentro=', numero)
}
console.log('fora=', numero)

/* usando var em loop */
for (var i=0; i<10; i++){ /* var nao tem escopo de bloco, logo, estara visivel fora do bloco */
    console.log(i)
}
console.log('i=',i)

const funcs = [] 

for (var j=0; j<10; j++){
    funcs.push(function(){
        console.log(j)
    })
}

funcs[8]()
funcs[2]()