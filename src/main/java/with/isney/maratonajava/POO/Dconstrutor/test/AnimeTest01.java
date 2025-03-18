package with.isney.maratonajava.POO.Dconstrutor.test;

import with.isney.maratonajava.POO.Csobrecargametodo.dominio.Anime;
import with.isney.maratonajava.POO.Dconstrutor.dominio.Animme;

public class AnimeTest01
{
    public static void main(String[] args) {
        Animme anime = new Animme("Roda de Tempo","Prime Video",7,"Serie");
        //anime.init("Roda de Tempo","Prime Video",7,"Serie");
        Animme anime2 = new Animme();
        anime2.imprime();
        anime.imprime();
    }


}
