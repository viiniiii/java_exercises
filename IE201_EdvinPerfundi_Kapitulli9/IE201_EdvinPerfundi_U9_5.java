package IE201_EdvinPerfundi_Kapitulli9;

import java.util.GregorianCalendar;

public class IE201_EdvinPerfundi_U9_5 {
    public static void main(String[] args) {
        // 1. Shfaqja e vitit, muajit dhe dates aktuale
        GregorianCalendar kalendariAktual = new GregorianCalendar();
        System.out.println("Koha aktuale:");
        System.out.println("Viti : " + kalendariAktual.get(GregorianCalendar.YEAR));
        System.out.println("Muaji : " + kalendariAktual.get(GregorianCalendar.MONTH));
        System.out.println("Data : " + kalendariAktual.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        // 2. Vendosja e vleres 1234567898765L dhe afishimi i vitit, muajit dhe dates
        GregorianCalendar kalendariShkuar = new GregorianCalendar();
        kalendariShkuar.setTimeInMillis(1234567898765L);
        System.out.println("Data per kohen e shkuar  1234567898765L ne milisekonda:");
        System.out.println("Viti : " + kalendariShkuar.get(GregorianCalendar.YEAR));
        System.out.println("Muaji : " + kalendariShkuar.get(GregorianCalendar.MONTH));
        System.out.println("Data : " + kalendariShkuar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
