package Aula4;
import java.util.Scanner;
public class Classe1 {
     public static void main(String[] args) { 
          char sexo;     
          String msg;
          
          Scanner leitor = new Scanner(System.in);
           System.out.println ("Digite o sexo:");   
           sexo = leitor.next().charAt(0); // Leitura do tipo char com Scanner    
           
           if (sexo == 'M' || sexo == 'm' )    
           {       
               msg = "Pessoa do sexo masculino!";    
           }    
           else if (sexo == 'F' || sexo == 'f' )  
           {       
           msg = "Pessoa do sexo Feminino!";    
           }
           else {
               msg = "\nSexo não definido...!";
            }
           System.out.println(msg);  } 
     }

