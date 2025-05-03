package academy.devdojo.maratona.java.javacore.kenum.exercicio.view;

import academy.devdojo.maratona.java.javacore.kenum.exercicio.dominio.ContratoPorHora;
import academy.devdojo.maratona.java.javacore.kenum.exercicio.dominio.Departamento;
import academy.devdojo.maratona.java.javacore.kenum.exercicio.dominio.NivelTrabalhador;
import academy.devdojo.maratona.java.javacore.kenum.exercicio.dominio.Trabalhador;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        Departamento departamento = new Departamento(nomeDepartamento);

        System.out.println("Insira os dados do trabalhador: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nível: ");
        String nivel = sc.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.nivelPorNomeRelatorio(nivel), salarioBase, departamento);

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int numContratos = sc.nextInt();

        for (int i = 1; i <= numContratos; i++) {
            System.out.print("Insira o contrato #" + i + " data: ");

            System.out.println("Date (DD/MM/YYYY): ");
            LocalDate dateContrato = LocalDate.parse(sc.next(), fmt1);

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Horas trabalhadas: ");
            Integer horas = sc.nextInt();

            ContratoPorHora contrato = new ContratoPorHora(dateContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.print("Digite o mês e ano para calcular a renda total nesse periódo (MM/YYYY): ");

        YearMonth dateRenda = YearMonth.parse(sc.next(), fmt2);
        int ano = Year.from(dateRenda).getValue();
        int mes = Month.from(dateRenda).getValue();
        double renda = trabalhador.rendaAnoMes(ano, mes);

        System.out.println(trabalhador);
        System.out.println("Renda para " + dateRenda.format(fmt2) + ": " + String.format("%.2f", renda));

    }
}
