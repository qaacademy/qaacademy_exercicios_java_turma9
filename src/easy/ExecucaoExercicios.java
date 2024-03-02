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

//        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
//        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
//        System.out.println("O dobro do numero que você digitou é: "+ exercicio04_easy.calcularDobro(numeroDigitado)); // Exibe o valor da variavel com o um texto concatenado.

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro")); // Leitura do primeiro numero
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));// Leitura do segundo numero
        int terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro"));// Leitura do terceiro numero

        Exercicio05_easy exercicio05Easy = new Exercicio05_easy();

        System.out.println("A soma dos numeros digitados é: " + exercicio05Easy.calcularSoma(primeiroValor, segundoValor, terceiroValor)); // Exibição soma
        System.out.println("A subtração dos numeros digitados é: " + exercicio05Easy.calcularSubtracao(primeiroValor, segundoValor, terceiroValor)); // Exibição subtração
        System.out.println("A multiplicação dos numeros digitados é:" + exercicio05Easy.calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor));  // Exibição multiplicação
        System.out.println("A média dos numeros digitados é:" + exercicio05Easy.calcularMedia(primeiroValor, segundoValor, terceiroValor));  // Exibição media
    }
}
