/* recebe tres notas, calcula a media e verifica se o aluno foi aprovado ou nao */

const nota1 = 4.5
const nota2 = 5.0
const nota3 = 8.6
const verifica = 'number'

console.log('Media para aprovacao deve ser igual ou maior a 15 pontos.')

/* so faz o calculo da media se as tres notas forem do tipo number */
if (typeof nota1 == verifica && typeof nota2 == verifica && typeof nota3 == verifica){  
    const media = nota1 + nota2 + nota3 / 3

    if (media >= 15.0){
        console.log('Resultado: aprovado com media ' +media.toFixed(2))
    } else console.log('Resultado: reprovado com media ' +media.toFixed(2))

} else console.log('Erro de integridade nos valores.')
