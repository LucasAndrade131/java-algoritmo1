package aula_05;
import java.util.Scanner;
public class CalculoNumInteiros {
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com tres numeros inteiros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
            System.out.print(a   + "É o maior entre os três");
        }
        else if (b > a && b > c ) {
            System.out.print(b  + "É o maior entre os três");
        }
        else {
            System.out.print(c   + "É o maior entre os três");
        }
}
}