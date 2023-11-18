package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U7_8 {
    public static void main(String[] args) {
        double[] numrat = new double[10];
        System.out.print("Vendosni 10 numra: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double numri = scanner.nextDouble();
            numrat[i] = numri;
        }
        System.out.println("Mesatarja e array eshte: " + mesatarja(numrat));
        scanner.close();

    }

    public static int mesatarja(int[] array) {
        int shuma = 0;
        for (int i = 0; i < array.length; i++) {
            shuma = shuma + array[i];
        }
        return shuma / array.length;
    }

    public static double mesatarja(double[] array) {
        double shuma = 0;
        for (int i = 0; i < array.length; i++) {
            shuma = shuma + array[i];
        }
        return shuma / array.length;
    }

}