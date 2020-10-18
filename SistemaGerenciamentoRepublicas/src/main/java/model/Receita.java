package model;

public class Receita {

    private String descricao;
    private double valor;
    private Morador morador;

    public Receita(String descricao, double valor, Morador morador) {
        this.descricao = descricao;
        this.valor = valor;
        this.morador = morador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

}
