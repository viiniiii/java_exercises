package IE201_EdvinPerfundi_Kapitulli7_8;

public class IE201_EdvinPerfundi_U8_4 {
    public static void main(String[] args) {

    //7 dite ne jave 6 punetore
    String[] emrat_e_punetoreve = {"Vini","Kosti","Jorida","Elio","Rexhina","Oksana"};
    int[][] oret_e_punes = {
        {45, 50, 55, 40, 35, 60},
        {55, 30, 45, 40, 60, 50},
        {50, 35, 40, 55, 30, 45},
        {40, 60, 50, 35, 45, 55},
        {35, 40, 60, 45, 50, 30},
        {45, 50, 30, 60, 35, 55},
        {55, 30, 40, 35, 50, 45}
    };
    int[] oret_totale = new int[6];
        for(int i=0; i < oret_e_punes[i].length; i++){
            int totali = 0;
            for(int j=0; j < oret_e_punes.length; j++){
                totali += oret_e_punes[j][i]; 
            }
            oret_totale[i] = totali;
        }
        for(int i=0; i < oret_totale.length-1; i++){
            int imin = i;
            for(int j=i; j< oret_totale.length; j++){
                if(oret_totale[j] < oret_totale[imin]){
                    imin = j;
                }
            }
            int temp = oret_totale[i];
            String temp2 = emrat_e_punetoreve[i];
            oret_totale[i] = oret_totale[imin];
            emrat_e_punetoreve[i] = emrat_e_punetoreve[imin];
            oret_totale[imin] = temp;
            emrat_e_punetoreve[imin] = temp2;
        }
        System.out.println("Renditja e punetoreve ne baze te oreve te punes: ");
    for (int i = 0; i < emrat_e_punetoreve.length; i++) {
        System.out.println(emrat_e_punetoreve[i] + " ka punuar " + oret_totale[i] + " ore");
    }
    }
}

