
/*  Shkruani një program që kërkon nga përdoruesi të japë një numër karte si një numër të plotë i tipit long.
 Programi afishon një mesazh që sinjalizon nëse numri i kartës është i vlefshëm apo i pavlefshëm.  */
 import java.util.Scanner;

 public class IE201_JubianaKoçiu_Ushtrimi6_31 {
     /** Metoda Kryesore */
     public static void main(String[] args) {
         Scanner hyrje = new Scanner(System.in); // Krijoni një skaner
 
         // Kërkojini përdoruesit të japë një numër krediti si një numër të gjatë të plotë
         System.out.print("Jepni një numër krediti si një numër të gjatë të plotë: ");
         long numer = hyrje.nextLong();
 
         System.out.println(
             numer + " është " + (eshteVlefshme(numer) ? "i vlefshëm" : "e pavlefshme"));
     }
 
     /** Kthehet e vërtetë nëse numri i kartës është i vlefshëm */
     public static boolean eshteVlefshme(long numer) {
         boolean vlefshme =
             (merrMadhesine(numer) >= 13 && merrMadhesine(numer) <= 16) &&
             (krahasoPrefix(numer, 4) || krahasoPrefix(numer, 5) ||
             krahasoPrefix(numer, 37) || krahasoPrefix(numer, 6)) &&
             ((shumaeShifraveCift(numer) + shumaeShifraveTek(numer)) % 10 == 0);
 
         return vlefshme;
     }
 
     /** Merr rezultatin nga Hapi 2 */
     public static int shumaeShifraveCift(long numer) {
         int shuma = 0;
         String num = numer + "";
         for (int i = merrMadhesine(numer) - 2; i >= 0; i -= 2) {
             shuma += merrShifren(Integer.parseInt(num.charAt(i) + "") * 2);
         }
         return shuma;
     }
 
     /** Kthehet ky numër nëse është një shifër e vetme, në të kundërt,
      * kthehet shuma e dy shifrave */
     public static int merrShifren(int numer) {
         if (numer < 9)
             return numer;
         else
             return numer / 10 + numer % 10;
     }
 
     /** Kthehet shuma e shifrave në vende të çifta në numer */
     public static int shumaeShifraveTek(long numer) {
         int shuma = 0;
         String num = numer + "";
         for (int i = merrMadhesine(numer) - 1; i >= 0; i -= 2) {
             shuma += Integer.parseInt(num.charAt(i) + "");
         }
         return shuma;
     }
 
     /** Kthehet e vërtetë nëse shifra d është një prefix për numer */
     public static boolean krahasoPrefix(long numer, int d) {
         return merrPrefix(numer, merrMadhesine(d)) == d;
     }
 
     /** Kthehet numri i shifrave në d */
     public static int merrMadhesine(long d) {
         String num = d + "";
         return num.length();
     }
 
     /** Kthehet numri i parë i shifrave k nga numeri. Nëse
      * numri i shifrave në numer është më pak se k, kthehet numeri. */
     public static long merrPrefix(long numer, int k) {
         if (merrMadhesine(numer) > k)  {
             String num = numer + "";
             return  Long.parseLong(num.substring(0, k));
         }
         return numer;
     }
 }