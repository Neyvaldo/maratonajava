package with.isney.maratonajava.POO.BintroducaoMetodos.dominio;

public class Funcionarios
{

    private String nome;
    private int idade;
    private double [] salario;
    private double soma;

    public void imprimir()
    {
        System.out.println(this.nome);
        System.out.println(this.idade);
        //System.out.println(this.salario);


        if (salario == null)
        {
            return;
        }
        for (double s : salario)
        {
            System.out.println(s);
        }
    }

    public void impremirMediaSalario()
    {

        if (salario == null)
        {
            return;
        }
        for (double m : salario)
        {
            soma +=  m;
        }

        double media =  soma / salario.length;

        System.out.println("Media salarial do Funcionario " +this.nome+  " ë de " +media);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getSoma() {
        return soma;
    }

}
