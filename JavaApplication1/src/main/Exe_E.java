package main;

import java.util.Scanner; //objeto leitura

public class Exe_E {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double prestacao, valor, taxa, tempo;
        
        System.out.print("valor: ");
        valor=leitor.nextDouble();
        
        System.out.print("taxa: ");
        taxa=leitor.nextDouble();
        
        System.out.print("tempo: ");
        tempo=leitor.nextDouble();
        
        prestacao = (valor + (valor*taxa/100)*tempo);
        System.out.print("O valor de prestação é: " + prestacao);
        
    }
    
}
