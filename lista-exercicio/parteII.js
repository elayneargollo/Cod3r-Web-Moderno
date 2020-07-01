let vetorInteiros = [0,-1,10,-2,-5,5]

function maiorMenor(vetorInteiros){

    let maior =  vetorInteiros[0]
    let menor = vetorInteiros[0]

    for(let i=1; i<vetorInteiros.length; i++){

        if(menor > vetorInteiros[i]){
            menor = vetorInteiros[i];
        }
        if (maior < vetorInteiros[i]){
            maior = vetorInteiros[i];
        }

    }

    result = {
        "maior": maior,
        "menor": menor
    }

    return result;
}

console.log(maiorMenor(vetorInteiros))

function qntNegativo(vetorInteiros){
    let qnt =0;

    for(let i=0; i<vetorInteiros.length; i++){
        if (vetorInteiros[i] < 0){
            qnt++;
        }
    }

    return qnt;
}

console.log('Quantidade de numeros negativos: ' +qntNegativo(vetorInteiros))

let valores = [1,2,3,4,5,6,7,8,9,10]

function mediaValores(valores){

    let soma = 0;

    for (let i=0; i<valores.length; i++){
        soma += valores[i];
    }

    console.log('Media:' +soma/valores.length)
    
}

mediaValores(valores)

let vetorPilha = [1,2,3,4,5]
let vetorAdiciona = [6,7,8,9,10]

function adiciona(vetorPilha, vetorAdiciona){

    for (let i=0; i<vetorAdiciona.length; i++){
        vetorPilha.push(vetorAdiciona[i]);
    }

    console.log('Vetor Pilha: ' + vetorPilha + '\n' + 'VetorAdiciona ' + vetorAdiciona)
}

adiciona(vetorPilha, vetorAdiciona);

let notas = [0.1, 1.5, 4.9, 5.0, 8.9, 5.6, 7.0, 7.4, 9.0, 9.5];

function conceitoNotas(notas){

    for (let i=0; i<notas.length; i++){
        if (notas[i] >= 0 && notas[i]<=4.9){
            console.log('Nota ' + notas[i] + ' tem conceito D')
        } else
        if (notas[i]>=5.0 && notas[i] <= 6.9){
            console.log('Nota ' + notas[i] + ' tem conceito C')
        } else
        if (notas[i] >=7.0 && notas[i] <= 8.9){
            console.log('Nota ' + notas[i] + ' tem conceito B')
        }else  console.log('Nota ' + notas[i] + ' tem conceito A')
    }
}

conceitoNotas(notas)

let param1 = 10
let param2 = 5
let param3 = 20
let param4 = -4

function intervaloImpar(param1, param3){

    if (param1 > param3){
        showImpar(param3, param1)
    } else showImpar(param1, param3)
}

function showImpar(inicio, fim){

    for (let i=inicio; i<fim; i++){
        if(i%2!=0){
            console.log(i)
        }
    }
}

intervaloImpar(param1, param3)
//intervaloImpar(param2, param1)
//intervaloImpar(param4, param1)


