package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;
public class IE201_EdvinPerfundi_U4_11 {
    public static void main(String[] args) {
        System.out.print("Vendosni vetem nje numer 0-15: ");
        Scanner input = new Scanner(System.in);
        int numerdhjetor = input.nextInt();
        if (numerdhjetor >= 0 && numerdhjetor <= 15) {
            String numerbaze16 = Integer.toHexString(numerdhjetor);
            System.out.println("Numri " + numerdhjetor + " korrespondon me numrin " + numerbaze16 + " ne baze 16.");
        } else {
            System.out.println("Input i gabuar. Duhet te vendosni numer midis 0-15");
        }
        input.close();
    }
}
