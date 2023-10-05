package aula_05;
import java.util.Scanner; 
public class CalculaPoligno {
   public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
       String mensagem;
       
       System.out.print("Entre com os lados do poligono:");
       int lados = scanner.nextInt();
       
       if (lados == 3) {
          System.out.print("a:" );
          double a = scanner.nextDouble();
          System.out.print("b:");
          double b = scanner.nextDouble();
          System.out.print("c:");
          double c = scanner.nextDouble();
          
          double p = (a + b + c)/2;
          
          double A = p*(p-a)*(p-b)*(p-c);
          
          System.out.print("Aproximadamente: " + Math.sqrt(A) + "TRIANGULO");
       }
       else if (lados == 4){
          System.out.print("comprimento: ");
          double a = scanner.nextDouble();
          
          double A = a*a;
          
          System.out.print("Aproximadamente: " + A + "QUADRADO");
       }
       else if (lados == 5) {
          System.out.print("comprimento: ");
          double a = scanner.nextDouble();
          System.out.print("distância do lado ate o centro: ");
          double b = scanner.nextDouble();
          
          double A = 5*a*b;
          
          System.out.print("Aproximadamente: " + A + "PENTAGONO");
       }
       else {
          if (lados < 3) {
              System.out.print("NÃO É UM POLÍGONO");
          }else {
              System.out.print("POLÍGONO NÃO IDENTIFICADO");
          }
       }
}
}