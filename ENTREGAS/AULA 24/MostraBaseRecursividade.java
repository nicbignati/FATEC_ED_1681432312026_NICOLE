package Aula24;

import javax.swing.JOptionPane;

public class MostraBaseRecursividade {

    public static void main(String[] args) {
        String inputBase = JOptionPane.showInputDialog("Digite a base numérica (10, 2, 8 ou 16):");

        int base = Integer.parseInt(inputBase);

        if (base == 2 || base == 10 || base == 8 || base == 16) {
            String inputValor = JOptionPane.showInputDialog("Digite o valor inicial:");

            int valor = Integer.parseInt(inputValor);
            String mensagemResultado = "Resultado da conversão em base " + base + " é: ";

            if (valor == 0) {
                mensagemResultado += "0"; 
            } else {
                String resultado = converterParaBase(valor, base);
                mensagemResultado += resultado;
            }

            JOptionPane.showMessageDialog(null, mensagemResultado);
        } else {
            JOptionPane.showMessageDialog(null, "Base numérica incorreta. Use 2, 10, 8 ou 16.");
        }
    }

    public static String converterParaBase(int valor, int base) {
        if (valor == 0) {
            return ""; 
        }

        int digito = valor % base;
        String resto = converterParaBase(valor / base, base);

        return resto + digito;
    }
}
