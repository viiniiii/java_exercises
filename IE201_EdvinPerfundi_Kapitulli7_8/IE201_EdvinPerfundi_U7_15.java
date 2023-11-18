
package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U7_15 {
    public static void main(String[] args) {
        int[] numrat = new int[10];
        System.out.print("Vendosni 10 numra: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numrat[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Array para: ");
        for (int i = 1; i < numrat.length; i++)
        System.out.print(numrat[i] + " ");
        numrat = eliminoVleraDyshifta(numrat);
        System.out.println();
        System.out.println("Array pas: ");
        for (int i = 1; i < numrat.length; i++)
        System.out.print(numrat[i] + " ");

    }

    public static int[] eliminoVleraDyshifta(int[] array) {
        int[] array_i_ri = new int[array.length];
        int nrEl = 0;

        for (int i = 0; i < array.length; i++) {
            if (!kontrollo(array_i_ri, array[i])) {
                array_i_ri[nrEl] = array[i];
                nrEl++;
            }
        }
        return array_i_ri;
    
}
    public static boolean kontrollo(int[] A, int c) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == c) {
                return true;
            }
        }
        return false;
    }

}