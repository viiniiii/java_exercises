//perdoruesi e mbush array me 10 numra dhe kthehet poz i el min
package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U7_10 {
    public static void main(String[] args) {
        double[] numrat = new double[10];
        System.out.print("Vendosni 10 numra: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double numri = scanner.nextDouble();
            numrat[i] = numri;
        }
        System.out.println("Indeksi i elementit minimal eshte: " + indeksiElementitMinimal(numrat));
        scanner.close();

    }

    public static int indeksiElementitMinimal(double[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

}