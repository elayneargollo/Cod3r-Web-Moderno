/* Escreva um algoritmo que calcule e imprima a média obtida pelo aluno para aprovação direta (se superior a 7.0) 
ou o valor mínimo que o aluno (não aprovado por média) precisa obter numa prova final para ser aprovado. 
Considere que são realizadas três provas durante o semestre e que para aprovação em final a média obtida de
acordo com a equação abaixo precisa ser igual ou superior a 5.0 */

const prova1 = 4.0
const prova2 = 6.5
const prova3 = 5.9
const notaProvaFinal = 4.5

const media = (prova1 + prova2 + prova3)/3
let mediaFinal = null

if(media>7.0){
    console.log('Aprovacao Direta')
}else 
    mediaFinal = ((media*2) + notaProvaFinal) / 3
    if (mediaFinal>=5.0){
        console.log('Aluno Aprovado em final')
    } else console.log('Aluno Reprovado')

/* Escreva um algoritmo que leia o horário de entrada (hora, minuto) 
e o horário de saída (hora, minuto) de uma aula e escreva o tempo de duração desta aula, no formato hora:minuto */

let horaEntrada = 20
let minutoEntrada = 40

let horaSaida = 18
let minutoSaida = 20

let duracaoHora = null
let duracaoMinuto = null

let contMinuto=0
let contHora=0

if(horaSaida<horaEntrada){
    while(horaEntrada<24){
        horaEntrada++
        contHora++
    } if (horaEntrada==24){
        horaEntrada = 0
    }
    duracaoHora = contHora + (horaSaida-horaEntrada)
}

if(minutoSaida < minutoEntrada){
    while (minutoEntrada<60){
        minutoEntrada++
        contMinuto++
    } if (minutoEntrada==60){
        minutoEntrada = 0
        duracaoHora--
    }
    duracaoMinuto = minutoSaida + contMinuto
} else duracaoMinuto = minutoSaida - minutoEntrada

console.log(' ' + duracaoHora + ':' +duracaoMinuto)

/* Escreva um algoritmo que leia dois valores numéricos, representando um dia e um mês e escreva a data equivalente por extenso. 
Por exemplo, se os números informados forem 02 e 06, a saída deverá ser ‘dois de junho’; 
caso a data informada seja 01 e 12, a saída deverá ser ‘primeiro de dezembro’ */

let dia = 31
let mes = 13
let data = ''
let resto = ''

let vinte = 'vinte'
let trinta = 'trinta'

let dez = 'dez'
let onze = 'onze'
let doze = 'doze'
let treze = 'treze'
let quatorze = 'quatorze'
let quinze = 'quinze'
let dezesseis = 'dezesseis'
let dezessete = 'dezessete'
let dezoito = 'dezoito'
let dezenove = 'dezenove'

if(dia>=20 && dia<30){
    if (dia==20){
        data = vinte
    } else

    resto = 30-dia
    resto = 10 - resto
    data = vinte + ' '

}else if (dia>=30 && dia<=31){
    if (dia==30){
        data = trinta 
    } else resto = 31 - 30
            data = trinta + ' '
   
} else if(dia<10 || dia>=10 && dia<=19){
    resto = dia
} 

switch (resto){
    case 01:
        data += 'primeiro'
        break;
     case 02:
        data += 'dois'
        //...
    case 3:
        data += 'tres'
        break;      
    case 9:
        data += 'nove'
        break;
    case 11:
        data = onze
        break; 
}

let num = parseInt(dia)

switch (mes){
    case 01:
        console.log(data + ' de Janeiro')
        break;
    case 02:
        if(num <=29){ 
            console.log(data + ' de Fevereiro')
            break;
        } else console.log('Data invalida')
        break;
    case 06:
        if(num <=30){ 
            console.log(data +' de Junho')
            break;
        } else console.log('Data invalida')
        break;
    //...
    case 12:
        console.log('Dezembro')
        break;
    default:
        console.log('Mes invalido')        
}

