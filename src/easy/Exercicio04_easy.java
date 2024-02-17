package easy;

import javax.swing.*;

public class Exercicio04_easy {//Inicio classe

    public static void main(String[] args) {//Inicio main
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro")); //Recebe o valor da tela, Converte para inteiro, atribui para a variavel o valor.
        int dobro = numeroDigitado * 2; //Cria a variavel dobra, realiza o calculo do dobro e atribui o valor do calculo para a varavel
        System.out.println("O dobro do numero que você digitou é: " + dobro); // Exibe o valor da variavel com o um texto concatenado.
    }//Fim main
}//Fim da classe
