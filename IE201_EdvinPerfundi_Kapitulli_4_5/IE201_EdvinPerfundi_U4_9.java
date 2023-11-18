package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;

public class IE201_EdvinPerfundi_U4_9{
    public static void main(String[] args) {
        System.out.print("Vendosni vetem nje karakter: ");
        Scanner input = new Scanner(System.in);
        char karakteri = input.next().charAt(0);
        String unicode = String.format("\\u%04X", (int)karakteri);
            System.out.println("Unicode i karakterit te vendosur eshte: " + unicode);
        input.close();
    }
}