package easy;

import javax.swing.*;

public class ExecucaoExercicios {
    public static void main(String[] args) {
//        Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
//        System.out.println(exercicio02Easy.exibirPalavra("Estudar faz bem"));

//        Exercicio03_easy execicio03_ease = new Exercicio03_easy(); // Instancia da classe.
//        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
//        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
//        String texto = execicio03_ease.trocaValoresDigitados(primeiroValor, segundoValor);
//        System.out.println(texto);

        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        System.out.println("O dobro do numero que você digitou é: "+ exercicio04_easy.calcularDobro(numeroDigitado)); // Exibe o valor da variavel com o um texto concatenado.
    }
}
