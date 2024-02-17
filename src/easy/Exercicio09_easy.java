package easy;

import javax.swing.*;

public class Exercicio09_easy {// incio classe

    public static void main(String[] args) {//incio main

        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 1 e 10, para calcular a tabuada"));

        if (numeroDigitado <= 0 || numeroDigitado > 10) {
            System.out.println("Numero invalido!!!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroDigitado + " X " + i + " = " + (numeroDigitado * i));
            }
        }
    }//fim main
}//fim classe
