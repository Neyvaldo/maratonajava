package with.isney.maratonajava.POO.AintroducaoClasses.test;

import with.isney.maratonajava.POO.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.idade = 21;
        estudante.nome = "Neyvaldo";
        estudante.sexo = 'M';

        System.out.println(estudante.idade );
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

    }
}
