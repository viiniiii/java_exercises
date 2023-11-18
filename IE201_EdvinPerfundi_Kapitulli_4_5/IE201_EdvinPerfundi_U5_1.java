package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.util.Scanner; 
public class IE201_EdvinPerfundi_U5_1 {
    public static void main(String[] args){
        System.out.println("Vendosni numrat qe doni te mblidhni, numrat mund te jeni pozitive ose negative por duhet te jene te plote. Vendosni 0 per te perfunduar vendosjen e numrave.");
        Scanner input = new Scanner(System.in);
        int nr_neg = 0;
        int nr_poz = 0;
        int shuma = 0;
        int numri = input.nextInt();
        while (numri != 0){
            if (numri > 0){
                nr_poz += 1;
            }else{
                nr_neg += 1;
            }
            shuma += numri;
            numri = input.nextInt();
        }
        System.out.println("shuma eshte: " + shuma + " jane " + nr_poz + " numra pozitive dhe " + nr_neg + " numra negative.");
        input.close();
    }
}
