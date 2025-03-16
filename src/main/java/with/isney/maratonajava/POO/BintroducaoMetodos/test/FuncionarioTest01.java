package with.isney.maratonajava.POO.BintroducaoMetodos.test;

import with.isney.maratonajava.POO.BintroducaoMetodos.dominio.Funcionarios;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios();

//        funcionarios.nome = "Luffy";
//        funcionarios.idade = 21;
//        funcionarios.salario = new double[]{1200, 987.32, 2000};

        funcionarios.setNome("Neyvaldo");
        funcionarios.setIdade(21);
        funcionarios.setSalario(new double[]{1200, 987.32, 2000});

        funcionarios.imprimir();

        funcionarios.impremirMediaSalario();
    }
}
