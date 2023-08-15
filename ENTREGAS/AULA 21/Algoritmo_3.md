# ALGORITMO 3

```http
1 Function BuscaBinaria(x){
2    esq = 1 
3    dir = n
4        enquanto esq <= dir faca{
5            meio = ((esq + dir) /2) 
6            se A[meio] == x entao 
7                devolve meio 
8            senao se x > A[meio] entao 
9                    esq = meio + 1 
10                senao 
11                    dir = meio - 1 
12            }
13            14 devolve -1
14        }
```

## Linha 2:
```http
esq = 1
```
**Instrução: Inserção de valor**

**1 Instrução!**

## Linha 3:
```http
dir = n
```
**Instrução: Inserção de valor**

**1 Instrução!**

## Linha 4:
```http
enquanto esq <= dir faca{
```
**Instrução: Comparação de Valores**

**2 Instruçôes!**

## Linha 5:
```http
meio = ((esq + dir) /2)
```
**Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)**

**2 Instruções!**

## Linha 6:
```http
se A[meio] == x entao
```
**Instrução: Acesso da Valor de um Array e Comparação de Valores**

**2 Instruções!**

## Linha 7:
```http
devolve meio
```
**Instrução: Retorno de valor**

**1 Instrução!**

## Linha 8:
```http
senao se x > A[meio] entao
```
**Instrução: Acesso da Valor de um Array e Comparação de Valores**

**2 Instruções!**

## Linha 9:
```http
esq = meio + 1
```
**Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)**

**2 Instruções!**

## Linha 11:
```http
dir = meio - 1
```
**Instrução: inserção de Valores e Operação Aritmética Simples (Subtração)**

**2 Instruções!**

## Total de Instruções:

**Contém 14 instruções no total, mas, no pior caso (dir sendo maior que esq), será o produto de instruções dentro do loop com as de fora do loop, as 14 e o número de interações.**
