const valores = [7.9, 0.2,6] 

for (var i=0; i<valores.length; i++){
    console.log(valores[i])
}

console.log('Usando PUSH')
valores.push(5.2)

for (var i=0; i<valores.length; i++){
    console.log(valores[i])
}

console.log('Usando POP')
valores.pop()

for (var i=0; i<valores.length; i++){
    console.log(valores[i])
}

console.log('Usando DELETE')
delete valores[1]

for (var i=0; i<valores.length; i++){
    console.log(valores[i])
}

