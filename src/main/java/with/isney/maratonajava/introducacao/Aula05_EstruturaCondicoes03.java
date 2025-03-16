package with.isney.maratonajava.introducacao;

public class Aula05_EstruturaCondicoes03 {
    public static void main(String[] args) {

        double salario = 6000;
        String msgEnviar = "Vou doar 500 pro Dojo";
        String msgNaoEnviar = "Não tenho condicao de enviar, mas vou ter!";

        //‘String’ result = (condicao) ? verdadeiro : falso;
        String result = salario > 50000 ? msgEnviar : msgNaoEnviar;

            System.out.println(result);


    }
}
