package Atividade_24;

import java.util.Scanner;

public class Recursividade {

    public static void main(String[] args) {
        
        Scanner scannerEntrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos da sequência de Fibonacci:");
        
        int comprimentoSequencia = scannerEntrada.nextInt();
        
        imprimeSequenciaFibonacci(0, comprimentoSequencia, 1, 1); 
    }
    
    public static void imprimeSequenciaFibonacci(int n, int comprimento, int current, int next) {
        if (n < comprimento) {
            System.out.print(current + " ");
            int newNext = current + next;
            imprimeSequenciaFibonacci(n + 1, comprimento, next, newNext);
        }
    }
}
