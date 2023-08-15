ALGORITMO 3

Function BuscaBinaria(x){
    esq = 1 
    dir = n
        enquanto esq <= dir faca{
            meio = ((esq + dir) /2) 
            se A[meio] == x entao 
                devolve meio 
            senao se x > A[meio] entao 
                    esq = meio + 1 
                senao 
                    dir = meio - 1 
            }
            14 devolve -1
        }

Linha 2:

esq = 1
Instrução: Inserção de valor

1 Instrução!

Linha 3:

dir = n
Instrução: Inserção de valor

1 Instrução!

Linha 4:

enquanto esq <= dir faca{
Instrução: Comparação de Valores

2 Instruçôes!

Linha 5:

meio = ((esq + dir) /2)
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

2 Instruções!

Linha 6:

se A[meio] == x entao 
Instrução: Acesso da Valor de um Array e Comparação de Valores

2 Instruções!

linha 7:

devolve meio 
Instrução: Retorno de valor

1 Instrução!

Linha 8:

senao se x > A[meio] entao 
Instrução: Acesso da Valor de um Array e Comparação de Valores

2 Instruções!

linha 9:

esq = meio + 1 
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

2 Instruções!

Linha 11:

dir = meio - 1 
Instrução: inserção de Valores e Operação Aritmética Simples (Subtração)

2 Instruções!

Total de Instruções:

Contém 14 instruções no total, mas, no pior caso (dir sendo maior que esq), será o produto de
 instruções dentro do loop com as de fora do loop, as 14 e o número de interações.

