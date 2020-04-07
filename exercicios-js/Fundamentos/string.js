const escola = 'cod3r'

/* retorna o caractere no determinado indice da String */
console.log(escola.charAt(4))

/* pega o valor na tabela ASC */
console.log(escola.charCodeAt(3))

/* retorna o indice associado ao digito 'o' dentro da palavra escola  */
console.log(escola.indexOf('o'))

/* retorna a substring comecando do indice escolhido */
console.log(escola.substring(1))

/* retorna a substring comecando o indice 0 e terminando no indice 3*/
console.log(escola.substr(0,3))

/* concatenando */
console.log('Escola '.concat(escola).concat('!'))

/* substitui todos os digitos dentro do texto pela letra E*/
console.log(escola.replace(3,'e'))

/* transforma uma string em array utilizando como separador a virgula */
 console.log('Alison,Elayne,Natalia'.split(','))