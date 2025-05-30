package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio01.dominio;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivelTrabalhador;
    private double baseSalarial;
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador(String name, NivelTrabalhador nivelTrabalhador, double baseSalarial, Departamento departamento) {
        this.nome = name;
        this.nivelTrabalhador = nivelTrabalhador;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public void adicionarContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contratoRemove) {
        contratos.remove(contratoRemove);
    }

    public double rendaAnoMes(int ano, int mes) {
        double soma = baseSalarial;
        YearMonth filtro = YearMonth.of(ano, mes);
        for (ContratoPorHora contrato : contratos) {
            YearMonth dataContrato = YearMonth.from(contrato.getDate());
            if (dataContrato.equals(filtro)) {
                soma += contrato.valoTotal();
            }
        }
        return soma;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nNível: " + this.nivelTrabalhador.getNomeRelatorio() +
                "\nDepartamento : " + this.departamento.getNome();
    }
}
