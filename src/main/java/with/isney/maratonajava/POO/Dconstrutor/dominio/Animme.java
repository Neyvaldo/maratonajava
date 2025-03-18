package with.isney.maratonajava.POO.Dconstrutor.dominio;

public class Animme
{
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String studio;


    public Animme(String nome, String tipo, int episodio, String genero)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;

    }

    //Sobrecagra de construtor
    public Animme(String nome, String tipo, int episodio, String genero, String studio)
    {
        this(nome,tipo,episodio,genero);
        this.studio = studio;
    }

    public void imprime()
    {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setEpisodio(int episodio)
    {
        this.episodio = episodio;
    }

    public int getEpisodio()
    {
        return this.episodio;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}