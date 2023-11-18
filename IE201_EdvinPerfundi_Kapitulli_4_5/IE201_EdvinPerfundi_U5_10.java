package IE201_EdvinPerfundi_Kapitulli_4_5;

public class IE201_EdvinPerfundi_U5_10 {
    public static void main(String[] args){
        System.out.println("Numrat e pjestueshem me 5 dhe 6 nga 100 ne 1000:");
        int count = 0;
        for(int i = 100; i < 1000; i++){
            if(i % 30 == 0){
                System.out.print(i + " ");
                count += 1;
                if (count % 10 == 0){
                    System.out.println("");
                }
            }
        }
    }
}
