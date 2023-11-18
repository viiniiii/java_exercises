package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner;
public class IE201_EdvinPerfundi_U4_19 {
    public static void main(String[] args) {
        System.out.print("Numrin ISBN me 9 shifra: ");
        Scanner input = new Scanner(System.in);
        String ISBN = input.nextLine();
        if(ISBN.length() != 9){
            System.out.println("Input i gabuar duhen vendosur 9 shifra");
        }else{
            Boolean check = false;
            for(int i =0; i < 9; i++){
                if(Character.isDigit(ISBN.charAt(i)) != true){
                    check = true;
                }
            }
            if (check){
                System.out.println("Jo te gjitha shifrat jane numra");
            }else{
                int shifra = 0;
                for(int j =0; j<9; j++){
                    shifra += (int) ISBN.charAt(j);
                    shifra = shifra % 11;
                } 
                    if (shifra == 10){
                        System.out.println("Shifra e fundit e kodit ISBN eshte: X");
                    }else{
                        System.out.println("Shifra e fundit e kodit ISBN eshte: " + shifra);
                    }
            }
            }
        input.close();
    }
}
