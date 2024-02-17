package medium;

import javax.swing.*;
import java.util.Random;

public class Exercicio09_medium {

    public static void main(String[] args) {
        String[] nomeAlunos = new String[6];
        int[] numeroAlunos = new int[6];
        Random random = new Random();
        for (int i = 0; i < nomeAlunos.length; i++) {
            nomeAlunos[i] = JOptionPane.showInputDialog("Digite um nome para o " + (i + 1) + "º aluno: ");
            numeroAlunos[i] = random.nextInt(100);
            System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
        }
        if (nomeAlunos[0] == null || nomeAlunos[0].isEmpty()) {
            System.out.println("Não há alunos para serem mostrados");
        } else {
            for (int i = 0; i < nomeAlunos.length; i++) {
                System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
            }
        }

    }
}
