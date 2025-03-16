package with.isney.maratonajava.POO.BintroducaoMetodos.test;

import with.isney.maratonajava.POO.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02
{
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int numero1 = 5;
        int numero2 = 10;
        calculadora.multiplicacaoDeDoisNumero(numero1, numero2);
    }
}
