package Exerc1;
import javax.swing.*;
public class Exp1 {
    
    public static void menu(){
        double F, n1, n2, MG;
        char TECLA = '0';
        
        String menu = "***menu de controle ***\n1 Ler, calcular e exibir...\n2 sair...\nEscolha a opção:";
        
        while ( true )  {
            
        String strmenu = JOptionPane.showInputDialog(null,menu);
        TECLA = strmenu.charAt(0);
        
        switch (TECLA) {
            case '1' : F = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite as faltas:"));
            
            n1 = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite Nota1:"));
            
            n2 = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite Nota2:"));
            
            MG = Math.sqrt( n1 * n2);// CALCULAR MÉDIA GEOMETRICA
            String saida = "";
            if (MG < 6 || F > 20)
            { 
                saida = String.format("Aluno reprovado! média = %.2f faltas= %.0f", MG, F); 
            }
            else {
                saida = String.format("Aluno aprovado! média = %.2f faltas= %.0f", MG, F);
            }
            JOptionPane.showMessageDialog(null, saida);
            break;
            
        case '2': 
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
            System.exit(0);// quebrar o laço e finalizar o programa
            break;
        }
        }// fim do while 
        }
     public static void main(String[] args) {   menu();  
     
     }}
        
   

