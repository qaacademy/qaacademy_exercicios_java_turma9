package easy;

import javax.swing.*;

public class Exercicio06_easy {//inicio classe

    public static void main(String[] args) {// incio main
        double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double media = (primeiraNota + segundaNota) / 2;

        if (media > 5) {// inicio if
            System.out.println("Você está aprovado!!!");
        }// fim if
        if (media == 5) { // incio segundo if
            System.out.println("Você está de exame!!!");
        }// fim segundo if
        else { // abertura do else
            System.out.println("Você está reprovado!!!");
        } // fim do else
    }// fim main
}// fim da classe
