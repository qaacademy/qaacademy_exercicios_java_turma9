package medium;

import javax.swing.*;

public class Exercicio06_repeticao_medium {

    public static void main(String[] args) {
        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro, para calcular o fatorial"));

        for (int i = numeroFatorialDigitado; i > 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);
        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O Fatorial do numero digitado é: 1");
        }else {
            System.out.println("O Fatorial do numero digitado é: " + numeroFatorialDigitado);
        }
    }
}
