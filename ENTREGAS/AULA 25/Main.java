package Aula25;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        while (true) {
            String input = JOptionPane.showInputDialog("Digite até 20 valores (ou prossiga com os numeros):");

            if (input == null) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                tree.insert(value);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico.");
            }
        }

        System.out.println("Árvore binária após a inserção dos valores:");
        tree.inorderTraversal(tree.root);
    }
}
