package Aula25;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        while (true) {
            String input = JOptionPane.showInputDialog("Digite at� 20 valores (ou prossiga com os numeros):");

            if (input == null) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                tree.insert(value);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inv�lida. Por favor, insira um valor num�rico.");
            }
        }

        System.out.println("�rvore bin�ria ap�s a inser��o dos valores:");
        tree.inorderTraversal(tree.root);
    }
}
