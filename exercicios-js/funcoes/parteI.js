function operacao(num1, num2){

    console.log(
        'Soma:' + (num1 + num2) + ' ' +
        'Subtracao: ' + (num1 - num2) + ' ' +
        'Multiplicacao: ' + (num1*num2) +  ' ' +
        'Divisao: ' + (num1/num2)
    )
}

operacao(1,2)

function classificarTriangulo (tam1, tam2, tam3){

    if ((tam1 === tam2) && (tam2 === tam3)){
        console.log('Triangulo Equilátero');
    }else 
    if ((tam1===tam2) || (tam1===tam3) || (tam3===tam2)){
        console.log('Triangulo Isósceles')
    } else console.log('Triangulo escaleno')
}

classificarTriangulo(1,2,3)
classificarTriangulo(2,2,3)
classificarTriangulo(3,2,3)
classificarTriangulo(3,2,2)
classificarTriangulo(2,2,2)

function baseElevadaAoExpoente (base, expoente){
    console.log(base**expoente)
}

baseElevadaAoExpoente(2,2)
baseElevadaAoExpoente(3,2)

function dividendoEDivisor (dividendo, divisor){
    console.log('Divisao: ' + (dividendo/divisor) + ' ' + 'Resto:' + (dividendo%divisor));
}

dividendoEDivisor(2,2)
dividendoEDivisor(10,5)
dividendoEDivisor(10,3)

function imprimir (){

    let cont = 0; 

    while (cont < 11){
        console.log('Hello World!')
        cont++;
    }
}

imprimir();

function contador(){

    for (let i=1; i<51; i++){
        console.log(i)
    }
}

contador();

function EncontrarPares(){

    for (let cont=0; cont<101; cont++){
        if (cont%2 === 0){
            console.log(cont + ' é par')
        }
    }
}

EncontrarPares();

const numeros = [1,2,3,4,5,6,7,8,9,11,14,21];

function paresEImpares(numeros){

    let qntPar = 0;
    let qntImpar = 0;

    for (let i=0; i<numeros.length; i++){
        if (numeros[i]%2 === 0){
            qntPar++;
        } else qntImpar++;
    }

    console.log('Quantidade de pares: ' +qntPar + ' ' + 'Quantidade de impares: ' +qntImpar)
}

paresEImpares(numeros);


