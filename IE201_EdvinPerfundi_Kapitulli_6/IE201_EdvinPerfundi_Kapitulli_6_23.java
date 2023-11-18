package IE201_EdvinPerfundi_Kapitulli_6;

//sa here shfaqet nje karakter i caktuar te fjala e dhene
//sa here shfaqet secili karakter te fjala e dhene (nuk kerkohej)
import java.util.Scanner;

public class IE201_EdvinPerfundi_Kapitulli_6_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendosni nje fjale ");
        String fjala = scanner.nextLine();
        System.out.print("Vendosni karakterin qe doni te ti gjeni numrin te fjala: ");
        char karakteri = scanner.nextLine().charAt(0);
        System.out.println(
                "Karakteri " + karakteri + " shfaqet " + nr_karaktereve(fjala, karakteri) + " here tek fjala " + fjala);
        raport(fjala);
        scanner.close();
    }

    public static int nr_karaktereve(String a, char k) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == k) {
                count += 1;
            }
        }
        return count;
    }

    public static void raport(String a) {
        char[] karakteret_e_shfaquara = new char[a.length()];
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char karakteri = a.charAt(i);
            if (!(kontrollo(karakteret_e_shfaquara, karakteri))) {
                for (int j = i; j < a.length(); j++) {
                    if (karakteri == a.charAt(j)) {
                        count++;
                    }

                }
                System.out.println("Karakteri " + karakteri + " shaqet " + count + " here ");
                count = 0;
                karakteret_e_shfaquara[i] = karakteri;
            }

        }

    }

    public static boolean kontrollo(char[] A, char c) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == c) {
                return true;
            }
        }
        return false;
    }
}