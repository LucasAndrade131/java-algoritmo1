package ADO;

import javax.swing.JOptionPane;

public class Exc1 {
    public static void main(String[] args) {
        float entrada, saida;
        
        JOptionPane.showMessageDialog(null, "*** Seja bem vindo!***");
        entrada = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto"));
        
        if (entrada <= 20) {
            entrada += (entrada * 45) / 100;
        }else{
            entrada += (entrada * 30) / 100;
        }
    JOptionPane.showMessageDialog(null, "Valor do produto: " + entrada);
    }
}
