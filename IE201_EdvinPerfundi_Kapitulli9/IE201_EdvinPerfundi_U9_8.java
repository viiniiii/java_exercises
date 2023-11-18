package IE201_EdvinPerfundi_Kapitulli9;

public class IE201_EdvinPerfundi_U9_8 {
    public static class Ventilator {
        public static final int NGADALE = 1;
        public static final int MESATARE = 2;
        public static final int SHPEJT = 3;
    
        private int shpejtesia;
        private boolean on;
        private double rrezja;
        private String ngjyra;
    
        // Konstruktori pa argumente
        public Ventilator() {
            this.shpejtesia = NGADALE;
            this.on = false;
            this.rrezja = 5.0;
            this.ngjyra = "blu";
        }
    
        // Metodat accessor dhe mutator
        public int getShpejtesia() {
            return shpejtesia;
        }
    
        public void setShpejtesia(int shpejtesia) {
            this.shpejtesia = shpejtesia;
        }
    
        public boolean isOn() {
            return on;
        }
    
        public void setOn(boolean on) {
            this.on = on;
        }
    
        public double getRrezja() {
            return rrezja;
        }
    
        public void setRrezja(double rrezja) {
            this.rrezja = rrezja;
        }
    
        public String getNgjyra() {
            return ngjyra;
        }
    
        public void setNgjyra(String ngjyra) {
            this.ngjyra = ngjyra;
        }
    
        // Metoda toString
        public String toString() {
            if (on) {
                return "Shpejtesia: " + shpejtesia + ",  Ngjyra: " + ngjyra + ", Rrezja: " + rrezja;
            } else {
                return "Ngjyra: " + ngjyra + ", Rrezja: " + rrezja + ", Ventilatori është i fikur";
            }
        }
    
        public static void main(String[] args) {
            // Krijimi i dy objekteve Ventilator
            Ventilator ventilatori1 = new Ventilator();
            ventilatori1.setShpejtesia(SHPEJT);
            ventilatori1.setRrezja(10);
            ventilatori1.setNgjyra("verdhë");
            ventilatori1.setOn(true);
    
            Ventilator ventilatori2 = new Ventilator();
            ventilatori2.setShpejtesia(MESATARE);
            ventilatori2.setRrezja(5);
            ventilatori2.setNgjyra("blu");
            ventilatori2.setOn(false);
    
            // Afishimi i objekteve duke thirrur metoden toString
            System.out.println("Ventilatori i pare : " + ventilatori1.toString());
            System.out.println("Ventilatori i dyte : " + ventilatori2.toString());
        }
    }
    
}
