package academy.devdojo.maratona.java.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicilalização não estático de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicilalização não estático de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do Contrutor de Funcionario");
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);
    }

    public void geraRelatorio() {
        System.out.println("Eu " + this.nome + " Recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
