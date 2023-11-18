public class Queue {
    private int[] elementet;
    private int permasa;

    public Queue() {
        this(8);
    }

    public Queue(int kapaciteti) {
        elementet = new int[kapaciteti];
    }

    public void enqueue(int v) {
        if (permasa >= elementet.length) {
            int[] temp = new int[elementet.length * 2];
            System.arraycopy(elementet, 0, temp, 0, elementet.length);
            elementet = temp;
        }

        elementet[permasa++] = v;
    }

    public int dequeue() {
        int elementiPare = elementet[0];
        permasa--;

        for (int i = 0; i < permasa; i++) {
            elementet[i] = elementet[i + 1];
        }

        return elementiPare;
    }

    public boolean empty() {
        return permasa == 0;
    }

    public int getpermasa() {
        return permasa;
    }
}
