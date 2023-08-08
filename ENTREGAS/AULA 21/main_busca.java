package BUSCA;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class main_busca {

    public static void main(String[] args) {
        int[] array = {5, 8, 12, 15, 20, 25, 30, 35, 40, 45};
        int tamanho = array.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de K: ");
        int k = scanner.nextInt();
        scanner.close();

        long startTime = System.nanoTime(); 
        int resultado = busca_valor.busca(array, tamanho, k);
        long endTime = System.nanoTime(); 

        double elapsedTimeInSeconds = (endTime - startTime) / 1e9; 
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(','); 
        DecimalFormat decimalFormat = new DecimalFormat("#0.######", symbols);
        String formattedTime = decimalFormat.format(elapsedTimeInSeconds);
        
        if (resultado != -1) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento não encontrado");
        }
        
        System.out.println("Tempo de busca: " + formattedTime + " segundos");
    }
}


	



