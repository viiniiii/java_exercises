
public class Pika {
    private double x;
    private double y;

    // Konstruktor pa argumenta
    public Pika() {
        this(0, 0);
    }

    // Konstruktor me koordinata te percaktuara
    public Pika(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Llogarit distancan mes pikave
    public double distanca(Pika pikeTjeter) {
        double dx = this.x - pikeTjeter.getX();
        double dy = this.y - pikeTjeter.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Llogarit distancan mes pikes dhe nje pike te percaktuar
    public double distanca(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}