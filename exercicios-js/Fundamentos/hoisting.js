function usarVar(){ /* efeito de mover a variavel para cima */
    console.log('a=',a)
    var a=2
    console.log('a=',a)
}
usarVar()

function usarLet (){ /* nao funciona o efeito de incamento, ou seja, hoisting */
    console.log('b=',b)
    let b=3
    console.log('b=',b)
}
usarLet()