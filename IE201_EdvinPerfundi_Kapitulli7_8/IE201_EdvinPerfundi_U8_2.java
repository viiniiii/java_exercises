package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U8_2 {
    public static void main(String[] args){
        System.out.print("Vendosni 16 numra, 4 per secilin rresht te matrices: ");
        Scanner scanner = new Scanner(System.in);
        double [][] matrica = new double[4][4];
        for(int i=0; i < matrica.length; i++){
            for(int j=0; j < matrica[i].length; j++){
                matrica[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        System.out.println("\nShuma e diagonales kryesore eshte: " + shumaDiagonaleKryesore(matrica));
    }
    public static double shumaDiagonaleKryesore(double[][] matric){
        double shuma = 0;
        for(int i=0; i<matric.length; i++){
            shuma += matric[i][i];
        }
        return shuma;
    }
}
