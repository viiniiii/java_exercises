
public class IE201_EdvinPerfundi_U10_4 {
    public static void main(String[] args) {
        // Objektet
        Pika point1 = new Pika();
        Pika point2 = new Pika(10, 30.5);

        // Koordinatat
        System.out.println("Pika e pare: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Pika e dyte: (" + point2.getX() + ", " + point2.getY() + ")");

        //Distancat
        System.out.println("Distanca mes pikave: " + point1.distanca(point2));
    }
}
