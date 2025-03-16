package with.isney.maratonajava.POO.Csobrecargametodo.test;

import javafx.scene.AmbientLight;
import with.isney.maratonajava.POO.Csobrecargametodo.dominio.Anime;

public class AnimeTest01
{
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Roda de Tempo","Prime Video",7,"Serie");
        anime.imprime();
    }


}
