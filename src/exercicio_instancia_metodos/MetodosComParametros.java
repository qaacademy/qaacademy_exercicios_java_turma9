package exercicio_instancia_metodos;

public class MetodosComParametros {

    public static void metodoUmSemRetorno(String nome){
        System.out.println(nome);
    }

    public static String metodoUmComRetorno(String nome){
        return "O parametro enviado é: "+nome;
    }

    public static void main(String[] args) {
        metodoUmSemRetorno("Flavio");
        System.out.println(metodoUmComRetorno("Adriana"));
    }

}
