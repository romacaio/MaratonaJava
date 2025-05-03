package academy.devdojo.maratona.java.javacore.kenum.exercicio.dominio;

import java.time.LocalDate;

public class ContratoPorHora {
    private LocalDate date;
    private double valorPorHora;
    private Integer horas;


    public ContratoPorHora(LocalDate date, double valorPorHora, Integer horas) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public double valoTotal() {
        return valorPorHora * horas;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
}
