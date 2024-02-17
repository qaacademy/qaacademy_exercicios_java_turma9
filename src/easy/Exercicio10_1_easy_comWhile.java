package easy;

import javax.swing.*;

public class Exercicio10_1_easy_comWhile {// incio classe

    public static void main(String[] args) {// inico main

        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        double taxaJurosTotal = 0.0;

        for (int i = 1; i <= tempoInvestido; i++) {
            taxaJurosTotal = taxaJurosTotal + taxaJuros;
        }
        double valorTotal = (valorInvestimento * taxaJurosTotal) + valorInvestimento;

        System.out.println("Valor Investido: " + valorInvestimento);
        System.out.println("Taxa de juros acumulada: " + (taxaJuros * 100) + "%");
        System.out.println("Valor Total: " + valorTotal);

    }// fim main

}// fim da classe
