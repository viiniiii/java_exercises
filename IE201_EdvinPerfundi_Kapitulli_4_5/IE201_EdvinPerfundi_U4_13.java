package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;

public class IE201_EdvinPerfundi_U4_13 {
    public static void main(String[] args) {
        System.out.print("Vendosni nje shkronje: ");
        Scanner input = new Scanner(System.in);
        char shkronja = input.nextLine().charAt(0);

        if (Character.isLetter(shkronja)) {
            if (Character.toUpperCase(shkronja) == 'A' || Character.toUpperCase(shkronja) == 'E' || Character.toUpperCase(shkronja) == 'I' || Character.toUpperCase(shkronja) == 'O' || Character.toUpperCase(shkronja) == 'U' || Character.toUpperCase(shkronja) == 'Y') {
                System.out.println("Shkronja e vendosur eshte zanore");
            } else {
                System.out.println("Shkronja e vendosur eshte bashktingellore");
            }
        } else {
            System.out.println("Input i gabuar. Duhet te vendosni nje shkronje.");
        }
        input.close();
    }
}