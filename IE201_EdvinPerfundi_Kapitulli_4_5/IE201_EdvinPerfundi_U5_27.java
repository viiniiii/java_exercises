package IE201_EdvinPerfundi_Kapitulli_4_5;
public class IE201_EdvinPerfundi_U5_27 {
    public static void main(String[] args) {
        System.out.println("Afishimi i viteve te brishte nga 101 tek 2100 : ");
        int count = 0;
        for(int viti = 100; viti <= 2100; viti++){
            if((viti % 4 == 0 && viti % 100 != 0) || viti % 400 == 0){
                System.out.print(viti + " ");
                count += 1;
                if (count % 10 == 0){
                    System.out.println("");
            }
            }
        }
        System.out.println("Jane gjithsej " + count + " vite");
    }
}
