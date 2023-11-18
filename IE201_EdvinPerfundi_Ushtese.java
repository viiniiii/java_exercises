//2 array emstud dhe notat krijo funk qe kthen array me stud stud qe kan marr notat max
//funk qe kthen kalueshmerine 
import java.util.Scanner;
public class IE201_EdvinPerfundi_Ushtese {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrin e studenteve: ");
        int nr_stud = scanner.nextInt();
        String[] emrat_e_studenteve = new String[nr_stud];
        int[] notat_e_studenteve = new int[nr_stud]; 
        System.out.print("Vendosni emrat e " + nr_stud + " studenteve: " );
        for(int i = 0; i < nr_stud; i++){
            emrat_e_studenteve[i] = scanner.next();
        }
        System.out.println("Vendosni notat e " + nr_stud + " studenteve: " );
        for(int i = 0; i < nr_stud; i++){
            notat_e_studenteve[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Studentet me noten maksimale jane: ");
        String[] ekselentet = studentet_nota_max(emrat_e_studenteve, notat_e_studenteve);
        for(int i = 0; i < ekselentet.length; i++){
            System.out.print(ekselentet[i] + " ");
        }
        System.out.println("\nKalueshmeria eshte: " + kalueshmeria(notat_e_studenteve));
    }
    public static String[] studentet_nota_max(String[] emrat, int[] notat){
        int nota_max = 4;
        int count = 0;
        for(int i = 0; i < notat.length; i++){
            if(notat[i] > nota_max){
                nota_max = notat[i];
            }
        }
        for(int i = 0; i < notat.length; i++){
            if(nota_max == notat[i]){
                count++;
            }
        }
        String[] fatlumet = new String[count];
        int poz = 0;
        for(int i = 0; i < notat.length; i++){
            if(nota_max == notat[i]){
                fatlumet[poz] = emrat[i]; 
                poz++;
            }
        }
        return fatlumet;
    }
    public static double kalueshmeria(int[] notat){
        double count = 0.0;
        for(int i = 0; i < notat.length; i++){
            if(notat[i] != 4){
                count++;
            }
        }
        return count/notat.length;
    }
}
