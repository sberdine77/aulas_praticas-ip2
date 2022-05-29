package br.ufrpe.academico.enums;

public enum DiasDaSemana {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    public final String label;

    private DiasDaSemana(String label) {
        this.label = label;
    }
}
