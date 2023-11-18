package IE201_EdvinPerfundi_Kapitulli9;

public class IE201_EdvinPerfundi_U9_1 {
    public static class Drejtkendesh {
        private double gjeresia;
        private double lartesia;

        // Konstruktori i parazgjedhur
        public Drejtkendesh() {
            this.gjeresia = 1.0;
            this.lartesia = 1.0;
        }

        public Drejtkendesh(double brinja) {
            this.gjeresia = brinja;
            this.lartesia = this.gjeresia;
        }

        // Konstruktori me gjeresine dhe lartesine e caktuar
        public Drejtkendesh(double gjeresia, double lartesia) {
            this.gjeresia = gjeresia;
            this.lartesia = lartesia;
        }

        // Metoda për llogaritjen e sipërfaqes së drejtkëndëshit
        public double getSiperfaqja() {
            return this.gjeresia * this.lartesia;
        }

        // Metoda për llogaritjen e perimetrit të drejtkëndëshit
        public double getPerimeteri() {
            return 2 * (this.gjeresia + this.lartesia);
        }
    }

    public static void main(String[] args) {
        // Krijo objektet e drejtkëndëshit
        Drejtkendesh drejtkendesh1 = new Drejtkendesh(4, 40);
        Drejtkendesh drejtkendesh2 = new Drejtkendesh(3.5, 35.9);

        // Përgjigjet për drejtkëndëshin e parë
        System.out.println("Drejtkëndëshi i parë ");
        System.out.println("Gjerësia e tij është: " + drejtkendesh1.gjeresia);
        System.out.println("Lartësia e tij është: " + drejtkendesh1.lartesia);
        System.out.println("Sipërfaqja e tij është: " + drejtkendesh1.getSiperfaqja());
        System.out.println("Perimetri i tij është: " + drejtkendesh1.getPerimeteri());
        System.out.println();

        // Përgjigjet për drejtkëndëshin e dytë
        System.out.println("Drejtkëndëshi i dytë");
        System.out.println("Gjerësia e tij është: " + drejtkendesh2.gjeresia);
        System.out.println("Lartësia e tij është: " + drejtkendesh2.lartesia);
        System.out.println("Sipërfaqja e tij është: " + drejtkendesh2.getSiperfaqja());
        System.out.println("Perimetri i tij është: " + drejtkendesh2.getPerimeteri());
    }
}