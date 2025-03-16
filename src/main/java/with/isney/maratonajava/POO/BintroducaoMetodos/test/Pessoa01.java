package with.isney.maratonajava.POO.BintroducaoMetodos.test;

import with.isney.maratonajava.POO.BintroducaoMetodos.dominio.Pessoa;

public class Pessoa01
{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome  = "Naruto";  Quando o modificador for 'public'
        pessoa.setNome("Naruto");
        pessoa.setIdade(21);
        //pessoa.imprime();;

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }


}
