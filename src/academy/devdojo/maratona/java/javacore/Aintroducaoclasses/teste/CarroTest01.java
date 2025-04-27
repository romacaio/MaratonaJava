package academy.devdojo.maratona.java.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.java.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca Bala";
        carro.modelo = "sport";
        carro.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano  = 1968;

        System.out.println("Carro1");
        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.modelo);
        System.out.println("\nCarro2");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.modelo);
    }
}
