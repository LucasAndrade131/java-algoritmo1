package ADO;

import javax.swing.JOptionPane;

public class Exc2 {
      public static void main(String[] args) {
          
          int idade;
          float preco;
          String nome;
          // posicoes, null = posição centro, msg = mensagem
          
          JOptionPane.showMessageDialog(null, "Bem vindo");
          nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", JOptionPane.QUESTION_MESSAGE );
          idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", JOptionPane.QUESTION_MESSAGE));
          
          if (idade <= 10) {
          preco = 30;
          JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco); // \n = nova linha) //
          } else if (idade > 10 && idade <= 29) {
            preco = 60;
            JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco);
          } else if (idade > 29 && idade <= 45) {
            preco = 120;
            JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco);
          } else if (idade > 45 && idade <= 59) {
            preco = 150;
            JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco);
          } else if (idade > 59 && idade <= 65) {
            preco = 250;
            JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco);
          } else {
            preco = 450;
            JOptionPane.showMessageDialog(null, "Preco do seguro: \n" + nome + "\nR$ " + preco);
          }
} 
}