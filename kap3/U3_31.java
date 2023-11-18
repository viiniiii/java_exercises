package kap3;
import java.util.Scanner;

public class U3_31 {
    public static void main(String[] args) {
        System.out.print("Vendos 0 per te konvertuar nga dollare ne RMB kineze ose 1 per te konvertuar nga RMB kineze ne dollare: ");
        Scanner input = new Scanner(System.in);
        int numri = input.nextInt();
        double vlera;
        int shuma;
        switch(numri){
            case 0:
                System.out.print("Ju keni zgjedhur te konvertoni nga dollare ne RMB kineze. Vendosni shumen: ");
                shuma = input.nextInt();
                vlera = shuma * 7.31;
                System.out.println(shuma + " dollare jane te barabarte me " + vlera + " RMB kineze");
                break;
            case 1:
                System.out.print("Ju keni zgjedhur te konvertoni nga RMB kineze ne dollare. Vendosni shumen: ");
                shuma = input.nextInt();
                vlera = shuma * 0.14;
                System.out.println(shuma + " RMB kineze jane te barabarte me " + vlera + " dollare");
                break;
            default: System.out.println("Input i gabuar");
        }
        
        input.close();
    }
}
