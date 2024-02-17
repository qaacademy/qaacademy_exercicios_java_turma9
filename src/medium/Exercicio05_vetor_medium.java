package medium;

import javax.swing.*;

public class Exercicio05_vetor_medium {
    public static void main(String[] args) {
        int i = 0;
        int numeroDigitado = 0;
        int menorNumero = 0;
        int [] vetorNumeros = new int[5];

        while (i <= 4) {
            vetorNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
            i++;
        }
       menorNumero = vetorNumeros[0];
        for (i = 0; i < vetorNumeros.length; i++) {//inico for
            if (vetorNumeros[i] < menorNumero) {
                menorNumero = vetorNumeros[i];
            }

        }// fim for
        System.out.println("O menor numero o vetor é: "+menorNumero);

    }
}
