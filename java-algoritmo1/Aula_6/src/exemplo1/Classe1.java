package exemplo1;

import javax.swing.JOptionPane;
        
public class Classe1 {

    public static void main(String[] args) {
        String msg = "***Este programa faz a comparação de Strings em Java***";
        String titulo = "Boas Vindas !";
        JOptionPane.showMessageDialog(null, msg, titulo, 
                JOptionPane.INFORMATION_MESSAGE);
        
        String palavra1 = JOptionPane.showInputDialog(null ,
                "Digite uma palavra:", "**Ler Palavras**", JOptionPane.QUESTION_MESSAGE);
        String palavra2 = JOptionPane.showInputDialog(null ,"Digite a palavra 2", "**Ler Palavras**", JOptionPane.QUESTION_MESSAGE );
    
    if ( palavra1.equals(palavra2)) {
        JOptionPane.showInputDialog(null, "Palavras Iguais !");
    } else {
        JOptionPane.showInputDialog(null, "Palavras Diferentes !");
    }
    }
    
}
