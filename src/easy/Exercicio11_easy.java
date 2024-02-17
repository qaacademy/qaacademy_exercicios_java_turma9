package easy;

import javax.swing.*;

public class Exercicio11_easy {

    public static void main(String[] args) {
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        for (int i = 0; i <= 99; i++) {
            numeroDigitado = numeroDigitado +2;
            System.out.println("Iteração: " + i +" - Valor: "+numeroDigitado);
        }
        System.out.println("Fim das iterações!!!");
    }
}
