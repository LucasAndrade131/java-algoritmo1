package aula_05;
import java.util.Scanner;
public class CalculaMediaGeometrica {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    String nome, msg;
    
    double mediaG, num1, num2;
            
    int faltas;    
    
    System.out.print("Digite seu nome: ");
    nome = leitor.next();
    
    System.out.print("Digite o primeiro numero: ");
    num1 = leitor.nextDouble();
    
    System.out.print("Digite o segundo numero: ");
    num2 = leitor.nextDouble();
    
    System.out.print("Digite o numero de faltas: ");
    faltas = leitor.nextInt();
    
    mediaG =  Math.sqrt(num1 * num2);
    
    if (faltas > 20) {
        msg = "Reprovado por faltas";
    } else if (mediaG < 3) {
        msg = "Reprovado por notas";   
    } else if (mediaG >= 3 && mediaG < 5) {
        msg = "Recuperação";
    } else if (mediaG > 3 && mediaG < 6){
        msg = "Exame";
    } else {
        msg = "Aprovado";
    }
    
    String saida=String.format("Média: %.2f \nStatus: %s", mediaG, msg);
    System.out.println(saida);
}
}