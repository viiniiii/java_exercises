package IE201_EdvinPerfundi_Kapitulli7_8;

import java.util.Scanner;

public class IE201_EdvinPerfundi_U7_26 {
    public static void main(String[] args){
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.out.print("Vendosni 10 numra per array-in e pare: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int numri = scanner.nextInt();
            array1[i] = numri;
        }
        System.out.print("Vendosni 10 numra per array-in e dyte: ");
        for (int i = 0; i < 10; i++) {
            int numri = scanner.nextInt();
            array2[i] = numri;
        }
        if(teBarabarta(array1, array2)){
            System.out.println("Arraysat jane indentike");
        }else{
            System.out.println("Arraysat nuk jane indentike");
        }
        scanner.close();
    }
    public static boolean teBarabarta(int[] list1, int[] list2){
        if(list1.length != list2.length){
            return false;
        }
        for(int i=0; i<list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
