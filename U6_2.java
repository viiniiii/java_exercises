
//te ndertohet prg i cili nje vler te vendosur nga perdoruesi e konverton nga celsius ne farenheit
import java.util.Scanner;

public class U6_2 {
    public static double konverttoC(double temp) {
        return 5.0 / 9 * (temp - 32);
    }

    public static double konverttoF(double temp) {
        return 9.0 / 5 * temp + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni temperaturen qe doni te konvertoni: ");
        int sasia = scanner.nextInt();
        System.out.println("Shtypni f per te konvertuar ne farenheit ose c per te konvertuar ne celsius: ");
        char zgjedhja = scanner.next().charAt(0);
        switch (zgjedhja) {
            case 'f':
                double farenheit = konverttoF(sasia);
                System.out.println("Temperatura ne farenheit eshte: " + farenheit);
                break;
            case 'c':
                double celsius = konverttoC(sasia);
                System.out.println("Temperatura ne celsius eshte: " + celsius);
                break;
            default:
                System.out.println("input i gabuar");
        }
        scanner.close();
    }

}