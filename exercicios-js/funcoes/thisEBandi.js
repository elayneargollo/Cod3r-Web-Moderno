const pessoa = {
    saudacao: 'Bom dia',

    falar(){
        console.log(this.saudacao) 
    }
}

pessoa.falar();

const falar = pessoa.falar
falar() // conflito entre OO e funcional

// amarra determinado objeto a funcao bind
const falarDePessoa = pessoa.falar.bind(pessoa)
falarDePessoa()