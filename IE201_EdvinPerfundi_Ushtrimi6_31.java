

/*  Shkruani një program që kërkon nga përdoruesi të japë një numër karte si një numër të plotë i tipit long.
 Programi afishon një mesazh që sinjalizon nëse numri i kartës është i vlefshëm apo i pavlefshëm.  */
import java.util.Scanner;

public class IE201_EdvinPerfundi_Ushtrimi6_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrin e kartes: ");
        long numri_kartes = scanner.nextLong();
        if (getSize(numri_kartes) > 16 || getSize(numri_kartes) < 13) {
            // Nëse numri i shifrave të kartës nuk është i saktë sepse nuk ka gjatësinë e
            // duhur
            System.out.println(
                    "Numri i kartës së vendosur ka " + getSize(numri_kartes) + " por duhet të ketë 13-16 shifra.");
        } else if (!(getPrefix(numri_kartes, 1) == 4 || getPrefix(numri_kartes, 1) == 5
                || getPrefix(numri_kartes, 2) == 37 || getPrefix(numri_kartes, 1) == 6)) {
            // Nëse karta nuk fillon me 4, 5, 37 ose 6
            System.out.println("Karta është e pavlefshme");
        } else {
            System.out.println(eshteVlefshem(numri_kartes) ? "Karta është e vlefshme" : "Karta është e pavlefshme");
        }
        scanner.close();
    }

    public static boolean eshteVlefshem(long number) {
        /* Kthen true nese numri i kartes eshte i vlefshem */
        return (shumaDyfishePozicioneCift(number) + shumaPozicioneveTek(number)) % 10 == 0;
    }

    public static int shumaDyfishePozicioneCift(long number) {
        /* Kap rezultatin e Hapit 2 */
        int sum = 0;
        boolean pozTek = false;
        while (getSize(number) > 0) {
            if (!pozTek) {
                pozTek = !pozTek;
                number /= 10;
                continue;
            }
            int digit = (int) (number % 10);
            sum += getShifra(digit * 2);
            pozTek = !pozTek;
            number /= 10;
        }
        return sum;
    }

    public static int getShifra(int number) {
        // Kthen këtë numër nëse është njëshifror përndryshe, kthen shumën e dyshifrave

        if (getSize(number) == 1) {
            return number;
        } else {
            return (number % 10) + (number / 10);
        }
    }

    public static int shumaPozicioneveTek(long number) {
        // Kthen shumën në pozicionet tek të numrit
        int sum = 0;
        boolean pozTek = true;
        while (getSize(number) > 0) {
            if (!pozTek) {
                pozTek = !pozTek;
                number /= 10;
                continue;
            }
            int digit = (int) (number % 10);
            sum += getShifra(digit);
            pozTek = !pozTek;
            number /= 10;
        }

        return sum;
    }

    public static boolean prefixPerputhur(long number, int d) {
        // Kthen true nëse shifra është prefix për numrin
        return d == getPrefix(number, getSize(d));
    }

    public static int getSize(long d) {
        // Kthen numrin e shifrave në d
        return (int) Math.log10(d) + 1;
    }

    public static long getPrefix(long number, int k) {
        /*
         * Kthen k numrat e parë të shifrave nga numri
         * Nëse numri i shifrave në numër është më i vogël se k, atëherë kthen numrin
         */
        if (getSize(number) <= k) {
            return number;
        } else {
            return number / (long) Math.pow(10, getSize(number) - k);
        }
    }
}