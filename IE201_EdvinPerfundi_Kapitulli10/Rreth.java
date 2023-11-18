public class Rreth {
    private double x;
    private double y;
    private double rrezja;

    public Rreth() {
        this(0, 0, 1);
    }

    public Rreth(double x, double y, double rrezja) {
        this.x = x;
        this.y = y;
        this.rrezja = rrezja;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRreze() {
        return rrezja;
    }

    public double getSip() {
        return Math.PI * rrezja * rrezja;
    }

    public double getPerimetri() {
        return 2 * Math.PI * rrezja;
    }

    public boolean permbahet(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < rrezja;
    }

    public boolean permbahet(Rreth circle) {
        double distanca = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return (distanca + circle.getRreze()) <= this.rrezja;
    }

    public boolean mbivendosen(Rreth circle) {
        double distanca = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return distanca < (this.rrezja + circle.getRreze()) && !permbahet(circle);
    }
}