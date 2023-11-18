/* Te shkruhet nje program që simulon kapjeve e kartave të domosdodshme per te patur te pakten kater karta nga secili 
simbol (suit) dhe te afishohen kater kartat e kapura (eshte e mundshme ge nje karte te kapet dy herë)  */

import java.util.Random;

public class IE201_JubianaKoçiu_Ushtrimi7_24 {

    public static void main(String[] args) {
        int[] pakoja = new int[52];
        int[] zgjedhje = new int[4];

        // Krijimi i pakos
        krijoPako(pakoja);

        // Perzierja e pakos
        përziePakon(pakoja);

        int count = bejZgjedhjet(pakoja, zgjedhje);

        // Shfaqja e katër letrave të zgjedhura
        printoZgjedhjen(zgjedhje);

        // Shfaqja e numrit të letrave të zgjidhura derisa të zgjidhen nga një për
        // secilën figurë
        System.out.println("Numri i zgjedhjeve: " + count);
    }

    public static void krijoPako(int[] pakoja) {
        // krijon pakon
        for (int i = 0; i < pakoja.length; i++)
            pakoja[i] = i;
    }

    public static void përziePakon(int[] pakoja) {
        // vlerave ne pako u nderrohen vendet rastesisht
        Random rand = new Random();
        for (int i = pakoja.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = pakoja[i];
            pakoja[i] = pakoja[j];
            pakoja[j] = temp;
        }
    }

    public static int bejZgjedhjet(int[] pakoja, int[] zgjedhje) {
        // numurohen sa letra zgjidhen derisa të mblidhen 4 figurat
        int count = 0;
        do {
            zgjidhLetrat(pakoja, zgjedhje);
            count++;
        } while (!kaNgaNjePerFigure(zgjedhje));

        return count;
    }

    public static void zgjidhLetrat(int[] pakoja, int[] zgjedhje) {
        // zgjedh rastësisht letra nga pakoja në mënyrë që do ta krahasojë me pakon dhe
        // të kontrollojë ku përkojnë
        for (int i = 0; i < zgjedhje.length; i++) {
            zgjedhje[i] = pakoja[zgjidhLetren(pakoja)];
        }
    }

    public static int zgjidhLetren(int[] pakoja) {
        // kthen një numër të rastësishëm
        return new Random().nextInt(pakoja.length);
    }

    public static boolean kaNgaNjePerFigure(int[] zgjedhje) {
        // kontrollon nëse janë zgjedhur nga të katërtat figurat
        for (int i = 0; i < zgjedhje.length; i++) {
            for (int j = 0; j < zgjedhje.length; j++) {
                if (i != j && (zgjedhje[i] / 13 == zgjedhje[j] / 13))
                    return false;
            }
        }
        return true;
    }

    public static void printoZgjedhjen(int[] zgjedhje) {
        // printohet 4 figurat e zgjedhura
        String[] figurat = { "Maç", "Karo", "Kup", "Spathi" };
        String[] letrat = { "As", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jan", "Qup", "Derr" };

        for (int zgjedhja : zgjedhje) {
            System.out.println(letrat[zgjedhja % 13] + " " + figurat[zgjedhja / 13]);
        }
    }
}