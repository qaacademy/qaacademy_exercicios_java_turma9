package easy;

import javax.swing.*;

public class Exercicio03_easy {// inicio classe
    public static void main(String[] args) { //metodo main
        String primeiroValor;
        primeiroValor = JOptionPane.showInputDialog("Digite um valor(Pode ser numerico ou texto"); // Receve o primeiro valor
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor(Pode ser numerico ou texto"); //Recebe o segundo valor

        System.out.println("Primeiro valor:" +segundoValor); // Exibe o primeiro
        System.out.println("Segundo valor:"+primeiroValor); // Exibe o segundo
    }// Fim main
}//Fim da classe
