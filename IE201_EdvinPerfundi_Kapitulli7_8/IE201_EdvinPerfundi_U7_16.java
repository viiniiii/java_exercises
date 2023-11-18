package IE201_EdvinPerfundi_Kapitulli7_8;
import java.util.Arrays;

public class IE201_EdvinPerfundi_U7_16 {
    public static void main(String[] args){
        int[] array = new int[1000000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)Math.random() * 10000000;
        }
        Arrays.sort(array);
        long kohafill, kohamba;
        kohafill = System.nanoTime();
        LinearSearch(array, 8574);
        kohamba = System.nanoTime();
        System.out.println("Koha e ekzektutimit te funksionit te kerkimit linear eshte: " + (kohamba - kohafill) + " nanosekonda");
        kohafill = System.nanoTime();
        BinarySearch(array, 8574);
        kohamba = System.nanoTime();
        System.out.println("Koha e ekzektutimit te funksionit te kerkimit binar eshte: " + (kohamba - kohafill) + " nanosekonda");
    }
    public static int LinearSearch(int[] list, int celesi){
        for(int i = 0; i < list.length; i++){
            if(celesi == list[i]){
                return i;
            }
        }
            return -1;
        
    }
    public static int BinarySearch(int[] list, int celesi){
        int majtas = 0;
        int djathtas = list.length - 1;
        while(djathtas >= majtas){
            int mes = (majtas + djathtas) / 2;
            if(celesi < list[mes]){
                djathtas = mes - 1;
            }else if(celesi == list[mes]){
                return mes;
            }else{
                majtas = mes + 1;
            }
        }
        return -majtas - 1;
    }
}
