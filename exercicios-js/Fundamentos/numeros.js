const peso = 1.1
const peso2 = Number('2.0')

console.log(peso, peso2)

/* verifica se eh um numero inteiro */
console.log(Number.isInteger(peso))
console.log(Number.isInteger(peso2))

const avaliacao1 = 9.871
const avaliacao2 = 6.871

const total = avaliacao1 * peso + avaliacao2 * peso2
const media = total / (peso + peso2)

/* define a quantidade de casas decimais */
console.log(media.toFixed(2))

/* transforma o Number em String */
console.log(media.toString());

/* transforma binario */
console.log(media.toString(2));
console.log(typeof media) /* tipo do dado */
console.log(typeof Number) /* funcao */
