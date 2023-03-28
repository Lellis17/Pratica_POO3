package br.com.carnaval;

public class Ingresso {
    private double valorIgresso;

    public Ingresso(double valorIgresso){
        this.valorIgresso = valorIgresso;
    }

    public double getValorIgresso() {
        return valorIgresso;
    }

    public void setValorIgresso(double valorIgresso) {
        this.valorIgresso = valorIgresso;
    }
    public String imprimeIngresso(){
        return "Ingresso:" +  getValorIgresso();

    }
}
