package easy;

import javax.swing.*;

public class Exercicio05_easy {//Inicio

    public static void main(String[] args) { // inicio main

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro")); // Leitura do primeiro numero
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));// Leitura do segundo numero
        int terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro"));// Leitura do terceiro numero

        int soma = primeiroValor + segundoValor + terceiroValor; // calculo da soma
        int subtracao = segundoValor - primeiroValor; // Calculo subtracao
        int multiplicacao = primeiroValor * segundoValor * terceiroValor;// Calculo multiplicação
        int media = multiplicacao / 3; // Calculo media

        System.out.println("A soma dos numeros digitados é: " + soma); // Exibição soma
        System.out.println("A subtração dos numeros digitados é: " + subtracao); // Exibição subtração
        System.out.println("A multiplicação dos numeros digitados é:" + multiplicacao);  // Exibição multiplicação
        System.out.println("A média dos numeros digitados é:" + media);  // Exibição media


    }// fim main

}//Fim
