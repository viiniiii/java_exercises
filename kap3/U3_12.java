package kap3;
import java.util.Scanner;
import java.lang.Math;

public class U3_12 {
    public static int permbys_numrin(int number){
        int numri_ri = 0;
        int gjatesia = (int) (Math.log10(number) + 1);
        for(int i = 1; i <= gjatesia; i++){
            int digit = number % 10;
            numri_ri = (numri_ri * 10) + digit;
            number /= 10;
        }
        return numri_ri;
    }
    public static void main(String[] args) {
        System.out.print("Vendos inputin: ");
        Scanner input = new Scanner(System.in);
        int numri = input.nextInt();
        if (permbys_numrin(numri) == numri){
            System.out.println("Eshte number polindrom");
        }else{
            System.out.println("Nuk eshte numer polindrom");
        }
        input.close();
    }
}
