
public class U1_11 {

    public static void main(String[] args) {
        long popullsia = 312032486;
        System.out.println("popullia aktuale " + popullsia);
        long sekondat_ne_vit = 365 * 24 * 60 * 60;
        long lindjet = sekondat_ne_vit / 7;
        long vdekjet = sekondat_ne_vit / 13;
        long emigrimet = sekondat_ne_vit / 45;
        for (int i = 1; i <= 5; i++) {
            popullsia += lindjet - vdekjet + emigrimet;
            System.out.println("popullia viti " + i + ": " + popullsia);
        }
    }
}
