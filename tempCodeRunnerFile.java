/* Simulim: problemi i grumbullimit te kuponave) Grumbulluesi i kuponave eshte nje problem klasik statistikor ge ka shume zbatime praktike. Problemi gendron ne grumbullimin e 
objekteve nga nje bashkesi me objekte ge perseriten per te gjetur se sa kapje jane te domosdodhme nga grumbulli i objekteve që një objekt te kapet te pakten nje here. Nje variant
 i problemit eshte terheqja e nje karte nga stiva me 52 karta te lojês me karta. Pas do terheqje, karta kthehet persëri ne stive dhe kartat shkartisen perseri. Problemi kerkon te
  gendet se sa karta jane te domosdoshme per te patur njè set nga tê gjitha simbolet (maç, karo, kup, spathi).
Te shkruhet nje program që simulon kapjeve e kartave të domosdodshme per te patur te pakten kater karta nga secili 
simbol (suit) dhe te afishohen kater kartat e kapura (eshte e mundshme ge nje karte te kapet dy herë)  */

import java.util.Random;

public class IE201_EdvinPerfundi_Ushtrimi7_24 {

    public static void main(String[] args) {
        int[] pakoja = new int[52];
        int[] simbolet = new int[4]; // Added declaration for simbolet array
        int numriZgjedhjeve = 0; // Inicializojme numrin e zgjedhjeve te nevojshme

        String[] figurat = { "Maç", "Karo", "Kup", "Spathi" };
        String[] letrat = { "As", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jan", "Qup", "Derr" };

        // Krijimi i pakos
        krijoPako(pakoja);

        // Perzierja e pakos
        përziePakon(pakoja);

        // Shfaqja e numrit të letrave të zgjidhura derisa të zgjidhen nga një për secilën figurë
        while (simbolet[0] != 1 || simbolet[1] != 1 || simbolet[2] != 1 || simbolet[3] != 1) {
            int letra = zgjidhLeter(pakoja);
            numriZgjedhjeve++;

            int figuraIndex = letra / 13;
            simbolet[figuraIndex] = 1;

            System.out.println(letrat[letra % 13] + " " + figurat[figuraIndex]);
        }
        System.out.println("Numri i zgjedhjeve: " + numriZgjedhjeve);
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

    static int zgjidhLeter(int[] pakoja) {
        return pakoja[(int) (Math.random() * 52)];
    }
}