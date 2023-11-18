package kap2;
//switchin qe afishon orarin mesimor te asaj dites qe japim
import java.util.Scanner;
public class Sem2_2 {
    public static void main(String[] args) {
        System.out.println("Vendosni diten e javes: ");
        Scanner input = new Scanner(System.in);
        int dita = input.nextInt();
        switch(dita){
            case 1:
                System.out.println("10:30 - 12:30 --- Seminar ne \"Matematike e zbatuar\" ");
                break;
            case 2:
                System.out.println("8:30 - 10:30 --- Seminar ne \"Arkitekture kompjuteri\" ");
                System.out.println("10:30 - 12:30 --- Seminar ne \"Mikroekonomi\" ");
                System.out.println("12:30 - 14:30 --- Seminar ne \"Programim ne Java\" ");
                break;
            case 3:
                System.out.println("12:30 - 14:30 --- Seminar ne \"Bazat e statistikes\" ");
                break;
            case 4:
                System.out.println("8:30 - 10:30 --- Leksion ne \"Mikrokenomi\" ");
                System.out.println("10:30 - 12:30 --- Leksion ne \"Programim ne Java\" ");
                System.out.println("12:30 - 14:30 --- Leksion ne \"Matematike e zbatuar\" ");
                break;
            case 5:
                System.out.println("8:30 - 10:30 --- Seminar ne \"Bazat e statistikes\" ");
                System.out.println("10:30 - 13:30 --- Leksion ne \"Arkitekture kompjuteri\" ");
                break;
            case 6:
                System.out.println("Diten e shtune nuk zhvillohet mesim");
                break;
            case 7:
                System.out.println("Diten e djele nuk zhvillohet mesim");
                break;
            default:
                System.out.println("Duhet te vendosni nje nga ditet e javes (1-7)");
                break;
        }
        input.close();
    }
}

/*
 Dsh: 
 3.12
 3.19 + siperfaqja
 3.22 root from class math
 3.31
 */
