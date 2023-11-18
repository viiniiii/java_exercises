
public class IE201_EdvinPerfundi_U10_1 {
    public static void main(String[] args) {
        // Krijohet objekti koha
        Time kohaAktuale = new Time();
        Time kohaPercaktuar = new Time(555550000);

        // Shfaq kohen aktuale
        System.out.println("Koha aktuale: " +
                kohaAktuale.getOren() + ":" +
                kohaAktuale.getMinutat() + ":" +
                kohaAktuale.getsekondat());

        // Shfaq kohen e percaktuar
        System.out.println("Koha e percaktuar: " +
                kohaPercaktuar.getOren() + ":" +
                kohaPercaktuar.getMinutat() + ":" +
                kohaPercaktuar.getsekondat());
    }
}
