package br.com.folhadepagamento;

public class Fcomissionado extends Funcionario{

    public Fcomissionado (double calcularProventos){
        super(calcularProventos);
    }
    private double percentual;
    private double vendas;

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}
