package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner; 
public class IE201_EdvinPerfundi_U5_50 {
    public static void main(String[] args) {
        System.out.print("Vendosni nje string te cfaredoshem: ");
        Scanner input = new Scanner(System.in);
        String fjala = input.nextLine();
        int count = 0;
        for(int i = 0; i < fjala.length(); i++){
            if (Character.isUpperCase(fjala.charAt(i))){
                count += 1;
                System.out.println(fjala.charAt(i));
            }
        }
        System.out.print("Jane " + count + " shkronja kapitale");

        input.close();
    }
}