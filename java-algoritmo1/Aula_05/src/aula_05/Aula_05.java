package aula_05;
import java.util.Scanner; 
public class Aula_05 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    double a, b, c;
    String tipo = "";
    
    System.out.print("Digite o lado A:"); a = leitor.nextDouble();
    System.out.print("Digite o lado B:"); b = leitor.nextDouble();
    System.out.print("Digite o lado C:"); c = leitor.nextDouble();
    
    if ( (a == b && a != c) || (a == c && a != b) || (b == c && c != a) ){
        tipo = "O tipo de triângulo é um Isósceles!"; 
    } else if ( a == b && a == c) {
        tipo = "O triângulo é equilátero!"; 
    } else if ( a != b && a != c) {
        tipo = "O triângulo é escalêno!";
    }

    String saida;
    saida = String.format("%s", tipo );
    System.out.println (saida);
    }
}
