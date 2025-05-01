package academy.devdojo.maratona.java.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);

    }

    public void geraRelatorio(){
        System.out.println("Eu " + this.nome+ " Recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
