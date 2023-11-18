package kap2;
/* perdoruesi jep emrin e punonjesit, oret e punes qe ka realizuar ne jave dhe sa e ka pagen per ore; afisho pagen javore duke patur parasysh nese punonjesi ka 40 
ore ose me pak mbahet totali i tatimeve 22% ; nese ka me shume vetem oret mbi 40 paguhen me 150% dhe tatohen 22% */
import javax.swing.*;
public class Sem2_1 {
    public static void main(String[] args) {
        String emri = JOptionPane.showInputDialog("Jepni emrin e punonjesit: ");
        String input = JOptionPane.showInputDialog("Jepni oret e punes se punonjesit: ");
        double oret = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Jepni pagen per ore: ");
        double paga_per_ore = Double.parseDouble(input);
        double paga;
        if (paga_per_ore > 40){
            paga = (paga_per_ore * 40 + paga_per_ore * 1.5 * (oret - 40))*0.78;
        }else{
            paga = paga_per_ore * oret * 0.78;
        }
        JOptionPane.showMessageDialog(null, "Punonjesi " + emri + " do paguhet " + paga,"Informacion", 0);
    }
}

