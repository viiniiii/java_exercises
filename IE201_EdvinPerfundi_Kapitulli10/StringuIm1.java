public class StringuIm1 {
    private char[] karakteret;

    public StringuIm1(char[] karakteret) {
        this.karakteret = new char[karakteret.length];
        System.arraycopy(karakteret, 0, this.karakteret, 0, karakteret.length);
    }

    public char charAt(int index) {
        return karakteret[index];
    }

    public int length() {
        return karakteret.length;
    }

    public StringuIm1 substring(int begin, int end) {
        char[] rezultati = new char[end - begin];
        System.arraycopy(karakteret, begin, rezultati, 0, end - begin);
        return new StringuIm1(rezultati);
    }

    public StringuIm1 toLowerCase() {
        char[] rezultati = new char[karakteret.length];
        for (int i = 0; i < karakteret.length; i++) {
            rezultati[i] = Character.toLowerCase(karakteret[i]);
        }
        return new StringuIm1(rezultati);
    }

    public boolean equals(StringuIm1 s) {
        if (s == null || s.length() != this.length()) {
            return false;
        }

        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static StringuIm1 valueOf(int i) {
        char[] rezultati = Integer.toString(i).toCharArray();
        return new StringuIm1(rezultati);
    }
}