
import java.util.Arrays;
public class IE201_EdvinPerfundi_Ushtrimi7_27 {
    public static void main(String[] args){
        int[] array1 = new int[100000]; 
        for(int i=0; i<array1.length; i++){
            array1[i] = (int) (Math.random() * 100000);
        }
        int[] array2 = new int[100000]; 
        for(int i=0; i<array2.length; i++){
            array2[i] = (int) (Math.random() * 100000);
        }
        long kohafill, kohamba;
        kohafill = System.nanoTime();
        boolean rezultati1 = kontrollo1(array1,array2);
        kohamba = System.nanoTime();
        System.out.println("Koha e ekzektutimit te funksionit te pare eshte: " + (kohamba - kohafill) + " nanosekonda" + "Outputi eshte: " + rezultati1);
        kohafill = System.nanoTime();
        boolean rezultati2 = kontrollo2(array1,array2);
        kohamba = System.nanoTime();
        System.out.println("Koha e ekzektutimit te funksionit te dyte eshte: " + (kohamba - kohafill) + " nanosekonda" + "Outputi eshte: " + rezultati2);
    }
    public static boolean kontrollo1(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            boolean perputhen = false;
    
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    perputhen = true;
                    break; 
                }
            }
    
            if (!perputhen) {
                return false;
            }
        }
    
        return true;
    }
    public static boolean kontrollo2(int[] list1,int[] list2){
        Arrays.sort(list1);
        Arrays.sort(list2);
        if(list1.length != list2.length){
            return false;
        }
        for(int i=0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
    }

