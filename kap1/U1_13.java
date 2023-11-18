
public class U1_13 {
    public static void main(String[] args) {
        System.out.println("Sistemi: ");
        float a = 3.4f;
        float b = 50.2f;
        float e = 44.5f;
        float c = 2.1f;
        float d = 0.55f;
        float f = 5.9f;
        System.out.println(a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
