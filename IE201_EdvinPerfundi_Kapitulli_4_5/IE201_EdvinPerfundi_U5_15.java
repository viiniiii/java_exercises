package IE201_EdvinPerfundi_Kapitulli_4_5;
public class IE201_EdvinPerfundi_U5_15 {
    public static void main(String[] args) {
        System.out.println("Afishimi i karaktereve ne ACSII nga ! tek ~ : ");
        int count = 0;
        for(int i = 33; i <= 126; i++){
            System.out.print((char) i + " ");
            count += 1;
            if (count % 10 == 0){
                System.out.println("");
            }
        }
    }
}
