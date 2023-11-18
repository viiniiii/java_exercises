package IE201_EdvinPerfundi_Kapitulli_4_5;
import java.lang.Math;
public class IE201_EdvinPerfundi_U4_16 {
    public static void main(String[] args) {
        System.out.println("Afishimi i nje shkronje te rastesishme");
        System.out.println("Kodi\tGerma");
        for(int i = 0; i < 10; i++){
            int shkronja_nr = (int) (Math.random() * 26) + 65;
            char shkronja = (char) shkronja_nr;
            System.out.println(shkronja_nr + "\t" + shkronja);
        }
    }
}
