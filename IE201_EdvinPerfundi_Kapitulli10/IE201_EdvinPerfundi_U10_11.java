
public class IE201_EdvinPerfundi_U10_11 {
    public static void main(String[] args) {
        Rreth rreth1 = new Rreth(2, 2, 5.5);

        System.out.println("Siperfaqja: " + rreth1.getSip());
        System.out.println("Perimetri: " + rreth1.getPerimetri());
        System.out.println("rreth1.permbahet(3, 3): " + rreth1.permbahet(3, 3));
        System.out.println("rreth1.permbahet(new Rreth(4, 5, 10.5)): " + rreth1.permbahet(new Rreth(4, 5, 10.5)));
        System.out.println("rreth1.mbivendoset(new Rreth(3, 5, 2.3)): " + rreth1.mbivendosen(new Rreth(3, 5, 2.3)));
    }
}
