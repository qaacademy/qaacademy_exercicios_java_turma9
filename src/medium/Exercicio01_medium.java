package medium;

public class Exercicio01_medium {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            // Para um numero ser par, o resto da divisao por dois tem que ser = 0;

            if (i % 2 == 0) {
                System.out.println("O Numero: " + i + " - é Par");
            }else {
                System.out.println("O Numero: " + i + " - é ímpar");
            }
        }
    }
}
