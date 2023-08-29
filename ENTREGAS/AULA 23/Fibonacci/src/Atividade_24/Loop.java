package Atividade_24;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner scannerEntrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos da sequência de Fibonacci:");
        
        int comprimentoSequencia = scannerEntrada.nextInt();
        
        int anterior = 1;
        int atual = 1;
        
        System.out.print(anterior + " ");
        
        for (int i = 1; i < comprimentoSequencia; i++) {
            System.out.print(atual + " ");
            
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}