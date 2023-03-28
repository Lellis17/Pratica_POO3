package br.com.folhadepagamento;

public class Fpadrao extends Funcionario{
    private double calcularProventos;

    public Fpadrao(double calcularProventos) {
        super (calcularProventos);

    }

    public double getCalcularProventos() {
        return calcularProventos;
    }

    public void setCalcularProventos(double calcularProventos) {
        this.calcularProventos = calcularProventos;
    }
}
