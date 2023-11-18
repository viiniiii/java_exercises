package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U7_34 {
    public static void main(String[] args){
        System.out.print("Vendosni nje fjale: ");
        Scanner scanner = new Scanner(System.in);
        String fjala = scanner.nextLine().strip();
        scanner.close();
        System.out.println("\nFjala me shkronjat e renditura eshte: " + sort(fjala));
        
    }

    public static String sort(String tekst) {
        char[] shkronjat = tekst.toCharArray();
    
        for (int k = 0; k < shkronjat.length - 1; k++) {
            for (int i = k + 1; i < shkronjat.length; i++) {
                if (shkronjat[i] < shkronjat[k]) {
                    char temp = shkronjat[k];
                    shkronjat[k] = shkronjat[i];
                    shkronjat[i] = temp;
                }
            }
        }
    
        return new String(shkronjat);
    }
}
