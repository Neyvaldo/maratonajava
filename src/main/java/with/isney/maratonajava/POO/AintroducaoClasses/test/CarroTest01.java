package with.isney.maratonajava.POO.AintroducaoClasses.test;

import with.isney.maratonajava.POO.AintroducaoClasses.dominio.Carro;

public class CarroTest01
{
    public static void main(String[] args)
    {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.modelo = "RagRover";
        carro.nome =  "Sport";
        carro.ano = 1999;

        // carro1 = cvarro2; Referencia de Objet. Só pode fazer isso quando tem objeto da  mesma Herança

        carro2.modelo = "Mustang";
        carro2.nome =  "GT 500";
        carro2.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
