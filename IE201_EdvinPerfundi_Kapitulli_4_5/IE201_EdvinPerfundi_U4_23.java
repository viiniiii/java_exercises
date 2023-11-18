package IE201_EdvinPerfundi_Kapitulli_4_5;
import javax.swing.*;
public class IE201_EdvinPerfundi_U4_23 {
    public static void main(String[] args) {
        String emri = JOptionPane.showInputDialog("Jepni emrin e punonjesit: ");
        String input = JOptionPane.showInputDialog("Jepni oret e punes se punonjesit: ");
        double oret = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Jepni pagen per ore: ");
        double paga_per_ore = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Vendosni % e tatimeve si numer dhjetor ");
        double tatimet = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Vendosni % e sigurimeve shoqerore si numer dhjetor ");
        double sigurimet_shoqerore = Double.parseDouble(input);
        double paga;
        paga = paga_per_ore * oret;
        tatimet = paga * tatimet;
        sigurimet_shoqerore = paga * sigurimet_shoqerore;
        paga = paga - tatimet - sigurimet_shoqerore;
        JOptionPane.showMessageDialog(null, "Punonjesi " + emri + " do paguhet " + paga,"Informacion", 0);
    }
}
