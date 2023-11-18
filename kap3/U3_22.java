package kap3;
import java.util.Scanner;
import java.lang.Math;

public class U3_22 {
    public static void main(String[] args) {
        System.out.println("Vendos koordinatat nje nga nje duke shtypur enter: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double largesia = Math.sqrt(Math.pow(a-0,2)+Math.pow(b-0,2));
        if (largesia > 10){
            System.out.println("Pika ndodhet jashte drejtezes");
        }else{
            System.out.println("Pika ndodhet brenda drejtezes");
        }
        input.close();
    }
}