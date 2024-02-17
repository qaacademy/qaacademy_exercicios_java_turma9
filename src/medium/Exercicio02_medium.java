package medium;

import javax.swing.*;

public class Exercicio02_medium {
    public static void main(String[] args) {
        int tempoDeInvestimento = 30;
        double valorTotal = 0.0;
        double taxaDeJuros = 0.12;
        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento"));
        valorTotal = valorInvestimento;

        for (int i = 0; i < tempoDeInvestimento; i++) {
            valorTotal = (valorTotal * taxaDeJuros) + valorTotal;
        }
        System.out.println("O Valor investido foi de R$ "+valorInvestimento);
        System.out.println("O Valor de juros foi de R$ "+(valorTotal - valorInvestimento));
        System.out.println("O Valor total com juros foi de R$ "+valorTotal);
    }
}
