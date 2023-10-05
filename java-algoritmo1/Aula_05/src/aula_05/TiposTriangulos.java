package aula_05;
import java.util.Scanner;
public class TiposTriangulos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com os lados do triangulo");
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        System.out.print("c:");
        double c = scanner.nextDouble();
        
        if (a >= (b+c) || b >= (a+c) || c >= (a+b) ) {
            System.out.print("não é um triangulo");
        }
        else {
            if (a == b && a == c) {
                System.out.print("equilatero");
            }
            else if ( (a == b && a != c) || (a == c && a!= b) || (b == c && b != a)) {
                System.out.print("escaleno");
            }
            else  {
                System.out.print("isoceles");
            }
        }
}   
}
