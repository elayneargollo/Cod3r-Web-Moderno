function jurosSimples(capital, juros, tempo){
    juros /= 100;
    tempo /= 12

    return capital + (capital*juros*tempo)
}

function JurosCompostos(capital, juros, tempo){
    juros /= 100;
    tempo /= 12

    return ((1+juros)**(tempo))*capital
}

console.log(JurosCompostos(1400, 7,24))
console.log(jurosSimples(2490,30,8))

function fatorial(num){
    let fat = 1;

    for (let i=num; i>=1; i--){
        fat *= i;
    }

    return fat;
}

console.log(fatorial(4))

function diaUtil (dia){

    let util = 'Dia útil'
    let fimDeSemana = 'Fim de semana'
    let diaInvalido = 'Dia inválido'

    switch (dia){
        case 1: 
            return fimDeSemana;
            break;
        case 2: 
            return util;
            break;
        case 3:
            return util;
            break;
        case 4:
            return util;
            break;
        case 5:
            return util;
            break;
        case 6:
            return util;
            break;
        case 7:
            return fimDeSemana;
            break;
        default:
            return diaInvalido;
    }
}

console.log(diaUtil(11))
console.log(diaUtil(7))
console.log(diaUtil(4))

function vendaDeFrutas(fruta){

    switch (fruta){
        case 'maçã':
            return ("Não vendemos essa fruta aqui")
            break;
        case 'kiwi':
            return ("Estamos com escassez de kiwis")
            break;
        case 'melancia':
            return ("Aque está, são 3 reais o quilo")
            break;
        default: 
            return ('error');           
    }
    
}

let fruta = 'melancia';
console.log(vendaDeFrutas(fruta))