package kap3;
import java.util.Scanner;

public class U3_19 {
    public static void main(String[] args) {
        System.out.println("Vendos brinjet nje nga nje duke shtypur enter: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            double p = (a + b + c) / 2;
            double perimetri = a + b + c;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
            System.out.println("Perimetri eshte: " + perimetri);
            System.out.println("Siperfaqja eshte: " + area);
        }else{
            System.out.println("It is not a triangle!");
        }
        
        input.close();
    }
}