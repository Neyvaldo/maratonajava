package with.isney.maratonajava.introducacao;

public class Aula02_TiposPrimitivo {

    public static void main(String[] args) {

        //int ,  double, long, flaot, byte, short, boolean, char

        // Cast - pegar num tipo primitivo e forçar a ser outro tipo

        int age = (int)21L;
        long numeroGrande = (long) 100.23F; //Aqui estou a fazer um CAST
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 23222;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';

        // ‘String’ não é um tipo primitivo, é uma classe. Classes começam com letras maiúsculas.
        String nome = "Naruto";




        System.out.println(nome);
    }
}
