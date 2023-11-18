package IE201_EdvinPerfundi_Kapitulli9;

public class IE201_EdvinPerfundi_U9_6 {
    public static class NdalKronometri {
        private long oreFillimi;
        private long oreMbarimi;

        // Konstruktori pa arg qe inicializon kohen e fillimit me kohen aktuale
        public NdalKronometri() {
            oreFillimi = System.currentTimeMillis();
            oreMbarimi = oreFillimi; 
        }

        // Metoda per te rivendosur kohen e fillimit ne oren aktuale
        public void start() {
            oreFillimi = System.currentTimeMillis();
        }

        // Metoda per te vendosur kohen e fundit ne oren aktuale
        public void stop() {
            oreMbarimi = System.currentTimeMillis();
        }

        // Metoda (get) per te marre kohen e kaluar ne milisekonda
        public long getKohaKaluar() {
            return oreMbarimi - oreFillimi;
        }

        // Koha e fillimit (get)
        public long getOreFillimi() {
            return oreFillimi;
        }

        // Koha e mbarimit (get)
        public long getOreMbarimi() {
            return oreMbarimi;
        }

        public static void main(String[] args) {
            // Krijoj nje kronometer te ri
            NdalKronometri kronometri = new NdalKronometri();

            // Gjenerimi i nje grupi prej 100,000 numrash te rastesishem
            int[] numrat = new int[100000];
            for (int i = 0; i < numrat.length; i++) {
                numrat[i] = (int) (Math.random() * 100000);
            }

            // Masim kohen e ekzekutimit te renditjes duke perdorur selection sort
            kronometri.start();
            selectionSort(numrat);
            kronometri.stop();

            // Nxjerrim rezultatet
            System.out.println("Koha e ekzekutimit: " + formatTime(kronometri.getKohaKaluar()) + " sekonda");
            System.out.println("Koha e fillimit: " + kronometri.getOreFillimi());
            System.out.println("Koha e mbarimit: " + kronometri.getOreMbarimi());
        }

        // Algoritmi i selection sort
        private static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i; // minimumi i indeksit
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        // Metoda per formatimin e kohes ne sekonda
        private static double formatTime(long timeInMillis) {
            return timeInMillis / 1000.0; // Konverto milisekondat ne sekonda
        }
    }
}