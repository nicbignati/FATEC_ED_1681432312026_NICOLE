package Aula24;

import javax.swing.JOptionPane;

public class MostraBaseRecursividade {

    public static void main(String[] args) {
        String inputBase = JOptionPane.showInputDialog("Digite a base num�rica (10, 2, 8 ou 16):");

        int base = Integer.parseInt(inputBase);

        if (base == 2 || base == 10 || base == 8 || base == 16) {
            String inputValor = JOptionPane.showInputDialog("Digite o valor inicial:");

            int valor = Integer.parseInt(inputValor);
            String mensagemResultado = "Resultado da convers�o em base " + base + " �: ";

            if (valor == 0) {
                mensagemResultado += "0"; // Trata o caso especial em que o valor � 0
            } else {
                String resultado = converterParaBase(valor, base);
                mensagemResultado += resultado;
            }

            JOptionPane.showMessageDialog(null, mensagemResultado);
        } else {
            JOptionPane.showMessageDialog(null, "Base num�rica incorreta. Use 2, 10, 8 ou 16.");
        }
    }

    public static String converterParaBase(int valor, int base) {
        if (valor == 0) {
            return ""; // Caso base: retorna uma string vazia quando o valor � 0
        }

        int digito = valor % base;
        String resto = converterParaBase(valor / base, base);

        // Concatena o d�gito calculado com o resultado da convers�o recursiva
        return resto + digito;
    }
}
