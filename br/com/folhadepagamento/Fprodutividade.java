package br.com.folhadepagamento;

public class Fprodutividade extends Funcionario {

    public Fprodutividade (double calcularProventos){
        super(calcularProventos);
    }
    private double valor;
    private int producao;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
}
