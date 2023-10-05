package Exerc1;

import javax.swing.JOptionPane;
        
public class Ado6 {
   

    public static void main(String[] args) {
        menu();
}
    public static void menu() {
    
        int a = 0, b = 0, c = 0, sp = 0;
        String tipo = "";
        char itemMenu = '0';
        
        while (true) {
            
            String menu = "1 - Ler, calcular e exibir...\n2 - Sair...";
            String strmenu = JOptionPane.showInputDialog(null, menu);
            itemMenu = strmenu.charAt(0);
            
            
        }
        
    
    }
}