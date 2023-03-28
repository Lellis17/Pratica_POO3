package br.com.folhadepagamento;

public class Funcionario {
    private int matricula;
    private  String nome;
    private double salario;
    private double calcularProventos;

    public Funcionario(int matricula, String nome, double salario, double calcularProventos) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.calcularProventos = calcularProventos;
    }

    public Funcionario(double calcularProventos) {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCalcularProventos() {
        return calcularProventos;
    }

    public void setCalcularProventos(double calcularProventos) {
        this.calcularProventos = calcularProventos;
    }
}


