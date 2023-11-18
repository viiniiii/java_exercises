package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner; 
public class IE201_EdvinPerfundi_U5_14 {
    public static void main(String[] args) {
        System.out.println("Vendosni dy numra te plote jonegative qe doni ti gjeni pjesutesin me te madh te perbashket: ");
        Scanner input = new Scanner(System.in);
        int numri1 = input.nextInt();
        int numri2 = input.nextInt();
        int min, max;
        int pmp = 1; 

        if (numri1 < 0 || numri2 < 0) {
            System.out.println("Input i gabuar! ");
        } else {
            if (numri1 > numri2) {
                min = numri2;
                max = numri1;
            } else {
                min = numri1;
                max = numri2;
            }

            for (int i = min; i > 0; i--) {
                if (min % i == 0 && max % i == 0) {
                    pmp = i;
                    break;
                }
            }

            System.out.println("PMP e " + numri1 + " dhe " + numri2 + " eshte " + pmp);
        }

        input.close();
    }
}
