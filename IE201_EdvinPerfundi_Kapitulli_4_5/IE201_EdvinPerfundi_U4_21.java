package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;
public class IE201_EdvinPerfundi_U4_21 {
    public static void main(String[] args) {
        System.out.print("Vendosni Numrin e sigurimeve shoqerore ne formation: DDD-DD-DDDD ku D eshte nje numer: ");
        Scanner input = new Scanner(System.in);
        String numri = input.nextLine();
        if(numri.length() != 11){
            System.out.println("Numri eshte vendosur gabim");
        }else{
            Boolean check = false;
            for(int i = 0; i < 3; i++){
                if(Character.isDigit(numri.charAt(i)) != true){
                    check = true;
                }
            }
            for(int i = 4; i < 6; i++){
                if(Character.isDigit(numri.charAt(i)) != true){
                    check = true;
                }
            }
            for(int i = 7; i < 10; i++){
                if(Character.isDigit(numri.charAt(i)) != true){
                    check = true;
                }
            }
            if(numri.charAt(3) != '-' || numri.charAt(6) != '-'){
                check = true;
            }
            if (check){
                System.out.println("Jo te gjitha shifrat jane numra ose nuk eshte vendosur ne formatin e duhur");
            }else{
                System.out.println("Te dhenat e futura jane korrekte");
            }
        }
        input.close();
    }
}


