package IE201_EdvinPerfundi_Kapitulli_6;

// klasa trekendesh 2 metoda: 1.i vlefshem 2.siptrek + metode llogarit
// perimetrin + metode string tipitrekendeshit i cili kthen nese trek esht
// barabrinjes dybrinjeshem cfaredoshem
// te permirsohet kodi i kls drejtkendesh ne men te tille qe klasa te kete 3 var
// fushe per tre brinjet, konstuktorin pa argument, kontruktorin qe krijon klas
// trekendesh cfaredo, konstruktor qe krijon trekendesh barabrinjes
// metodat get dhe set per te punuar me brinjet brinjet private
// me metod sip peri dhe tipi i trekendeshit
import java.util.Scanner;

public class IE201_EdvinPerfundi_Kapitulli_6_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendosni gjatesite e trekendshit: ");
        double brinja1 = scanner.nextDouble();
        double brinja2 = scanner.nextDouble();
        double brinja3 = scanner.nextDouble();

        if (Trekendeshi.i_vlefshem(brinja1, brinja2, brinja3)) {
            double siperfaqja = Trekendeshi.gjej_siperfaqen(brinja1, brinja2, brinja3);
            double perimetri = Trekendeshi.gjej_perimetrin(brinja1, brinja2, brinja3);
            String tipi = Trekendeshi.gjej_tipin(brinja1, brinja2, brinja3);

            System.out.println("Siperfaqja e trekendeshit eshte: " + siperfaqja);
            System.out.println("Perimetri eshte: " + perimetri);
            System.out.println("Trekendeshi eshte trekendesh " + tipi);
        } else {
            System.out.println("Trekendeshi nuk eshte i vlefshem");
        }
        scanner.close();
    }

    public static class Trekendeshi {
        public static boolean i_vlefshem(double a, double b, double c) {
            return (a + b > c) && (b + c > a) && (a + c > b);
        }

        public static boolean i_vlefshem(int a, int b, int c) {
            return (a + b > c) && (b + c > a) && (a + c > b);
        }

        public static double gjej_siperfaqen(double a, double b, double c) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public static double gjej_siperfaqen(int a, int b, int c) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public static double gjej_perimetrin(int a, int b, int c) {
            return a + b + c;
        }

        public static double gjej_perimetrin(double a, double b, double c) {
            return a + b + c;
        }

        public static String gjej_tipin(double a, double b, double c) {
            if (a == b && b == c) {
                return "Barabrinjes";
            } else if (a == b || b == c || a == c) {
                return "Dybrinjeshem";
            } else {
                return "I cfaredoshem";
            }
        }

        public static String gjej_tipin(int a, int b, int c) {
            if (a == b && b == c) {
                return "Barabrinjes";
            } else if (a == b || b == c || a == c) {
                return "Dybrinjeshem";
            } else {
                return "I cfaredoshem";
            }
        }
    }

}