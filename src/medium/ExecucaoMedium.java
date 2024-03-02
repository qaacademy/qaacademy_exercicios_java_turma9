package medium;

import javax.swing.*;

public class ExecucaoMedium {
    public static void main(String[] args) {
//
//        Exercicio01_medium exercicio01Medium = new Exercicio01_medium();
//        int numero = 1;
//        System.out.println(exercicio01Medium.verificaParOuImpar(numero));

        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento"));
        Exercicio02_medium exercicio02Medium = new Exercicio02_medium();
        double valorTotal = exercicio02Medium.calcularInvstimentoJurosCompostos(valorInvestimento);

        System.out.println("O Valor investido foi de R$ " + valorInvestimento);
        System.out.println("O Valor total com juros foi de R$ " + valorTotal);
        System.out.println("O Valor de juros foi de R$ " + exercicio02Medium.calcularValorDosJuros(valorTotal, valorInvestimento));


    }
}
