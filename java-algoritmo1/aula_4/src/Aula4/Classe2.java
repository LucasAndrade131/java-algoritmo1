
package Aula4;
import java.util.Scanner; 
public class Classe2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); //instanciando o leitor
        
        double media = 0, n1 = 0, n2 = 0; //criando as variaveis
        
        String status; // criando o objeto status texto
        
        System.out.print("Digite a nota 1: ");
        n1 = leitor.nextFloat();
        
        System.out.print("Digite a nota 2: ");
        n2 = leitor.nextFloat(); 

        // IF para tratamento de erros de notas entrada 
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
            String erro; // tratamento de erro   
            erro = "Erro! Nota 1 e 2 devem  estar entre 0 e 10!";
            System.out.println(erro);
            System.exit(0); // Finaliza  o programa 
        }
        media = (n1 + n2) / 2;
        if (media < 3) {
            status = "aluno reprovado";
        } else if (media < 5) {
            status = "aluno de recuperação";
        } else if (media < 6) {
            status = "aluno de exame";
        } else {
            status = "aluno aprovado";
        }
        String saida;
        saida = String.format("Média do aluno: %.2f {%s}", media, status);
        System.out.println(saida);
    }
}

