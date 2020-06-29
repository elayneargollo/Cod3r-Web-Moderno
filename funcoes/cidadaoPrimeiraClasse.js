// forma literal
function fun1(){
}

//  armazena em uma varíavel
const fun2 = function () {
}

// armazena em um array
const array = [function (a,b) {
    return a + b;
}]

// atributo de objeto
const obj = {} 
obj.falar = function () {
    return 'opa'
}

// passar funcao como param
function run(fun){
    fun ()
}

// funcao pode retornar/conter uma função
function soma(a,b){
    return function (c){
        console.log
    }
}

