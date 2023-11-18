
import java.math.BigInteger;

public class IE201_EdvinPerfundi_U10_18 {
    public static void main(String[] args) {
        BigInteger vleraFillestare = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

        for (int i = 0; i < 5; ) {
            if (vleraFillestare.isProbablePrime(100)) {
                System.out.println(vleraFillestare);
                i++;
            }
            vleraFillestare = vleraFillestare.add(BigInteger.ONE);
        }
    }
}