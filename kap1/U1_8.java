import java.util.Scanner;
public class U1_8 {
    public static void main(String[] args) {
        final float PI = 3.14F;
        System.out.println("Vendosni rrezen: ");
        Scanner input = new Scanner(System.in);
        float rrezja = input.nextFloat();
        float perimetri = 2 * rrezja * PI;
        float siperfaqja = rrezja * rrezja * PI;
        System.out.println("perimetri eshte: " + perimetri);
        System.out.println("siperfaqja eshte: " + siperfaqja);
        input.close();
    }
}
