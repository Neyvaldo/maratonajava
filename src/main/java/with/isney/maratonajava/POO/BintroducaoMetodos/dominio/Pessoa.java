package with.isney.maratonajava.POO.BintroducaoMetodos.dominio;

// Getter e Setter
public class Pessoa {
    //O modificador 'private' significa que só pode ser acessado pelo objeto

    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // set para setar
    public void setNome(String name) {
        this.nome = name;
    }

    public void setIdade(int age) {
        if (age < 0) {
            System.out.println("Idade invalidad");
            return;
        }
        this.idade = age;
    }

    //'get' para pegar
    public String getNome()
    {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }
}
