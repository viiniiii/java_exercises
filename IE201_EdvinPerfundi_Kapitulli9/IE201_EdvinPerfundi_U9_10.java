package IE201_EdvinPerfundi_Kapitulli9;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U9_10 {
    public static class EkuacioniKuadratik {
        private double a, b, c;

        // Konstruktori
        public EkuacioniKuadratik(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // Metoda get per a, b dhe c
        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        // Metoda per llogaritjen e dallorit
        public double getDallor() {
            return b * b - 4 * a * c;
        }

        // Metoda per kthimin e rrenjes se pare
        public double getRrenja1() {
            double dallori = getDallor();
            if (dallori >= 0) {
                return (-b + Math.sqrt(dallori)) / (2 * a);
            } else {
                return 0;
            }
        }

        // Metoda per kthimin e rrenjes se dyte
        public double getRrenja2() {
            double dallori = getDallor();
            if (dallori >= 0) {
                return (-b - Math.sqrt(dallori)) / (2 * a);
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perdoruesi vendos vlert e a, b dhe c
        System.out.print("Vendos vlerën e a: ");
        double a = input.nextDouble();
        System.out.print("Vendos vlerën e b: ");
        double b = input.nextDouble();
        System.out.print("Vendos vlerën e c: ");
        double c = input.nextDouble();
        input.close();
        // Krijimi i nje objekti EkuacioniKuadratik
        EkuacioniKuadratik ekuacioni = new EkuacioniKuadratik(a, b, c);

        // Llogaritja e dallorit
        double dallori = ekuacioni.getDallor();

        // Afishimi i rezultatit bazuar te dallori
        if (dallori > 0) {
            System.out.println("Ekzistojne dy rrenje reale:");
            System.out.println("Rrenja e pare: " + ekuacioni.getRrenja1());
            System.out.println("Rrenja e dyte: " + ekuacioni.getRrenja2());
        } else if (dallori == 0) {
            System.out.println("Ekziston nje rrenje reale:");
            System.out.println("Rrenja: " + ekuacioni.getRrenja1());
        } else {
            System.out.println("Ekuacioni nuk ka rrenje reale.");
        }
    }

}