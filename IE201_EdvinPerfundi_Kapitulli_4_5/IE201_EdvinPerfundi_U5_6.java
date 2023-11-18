package IE201_EdvinPerfundi_Kapitulli_4_5;

public class IE201_EdvinPerfundi_U5_6 {
    public static void main(String[] args){
        System.out.println("Milje \t Kilometra\tKilometra\tmilje");
        for(int i = 1; i < 10; i++){
            System.out.println(i + "\t" + String.format("%.3f", 1.609344 * i) + "\t" + "|" + "\t" + (5 * (i + 3)) + "\t" + String.format("%.3f", 5 * (i + 4) * 1.0 / 1.609344));
        }
    }
}
