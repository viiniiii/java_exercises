package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;

public class IE201_EdvinPerfundi_U4_8{
    public static void main(String[] args) {
        System.out.println("Vendosni numrin e kodit ne ASCII: (Duhet te jete numer midis 0 dhe 127) ");
        Scanner input = new Scanner(System.in);
        int karakteri = input.nextInt();
        if (karakteri > 0 || karakteri < 127){
            System.out.println("Numri i vendosur korrespondon me karakterin: " + (char) karakteri);
        }else{
            System.out.println("Input i gabuar");
        }
        input.close();
    }
}