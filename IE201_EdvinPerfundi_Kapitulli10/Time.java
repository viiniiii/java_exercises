
import java.util.Date;

public class Time {
    private int ora;
    private int minutat;
    private int sekondat;

    // Konstruktor pa agumenta me kohen aktuale
    public Time() {
        this(System.currentTimeMillis());
    }

    // Konstruktor me kohe te percaktuar
    public Time(long kohaPercaktuar) {
        setTime(kohaPercaktuar);
    }

    // Konstruktor ku specifikohen te gjitha
    public Time(int ora, int minutat, int sekondat) {
        this.ora = ora;
        this.minutat = minutat;
        this.sekondat = sekondat;
    }

    // Getter methods
    public int getOren() {
        return ora;
    }

    public int getMinutat() {
        return minutat;
    }

    public int getsekondat() {
        return sekondat;
    }

    // Method to set time based on elapsed time
    public void setTime(long kohaPercaktuar) {
        Date data = new Date(kohaPercaktuar);
        this.ora = data.getHours();
        this.minutat = data.getMinutes();
        this.sekondat = data.getSeconds();
    }
}