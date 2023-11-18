package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner; 
public class IE201_EdvinPerfundi_U5_46 {
    public static void main(String[] args) {
        System.out.print("Vendosni nje string te cfaredoshem: ");
        Scanner input = new Scanner(System.in);
        String fjala = input.nextLine();
        for(int i = fjala.length() - 1; i >= 0; i--){
            System.out.print(fjala.charAt(i));
        }

        input.close();
    }
}