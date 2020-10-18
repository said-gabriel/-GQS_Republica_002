package model;

public class ReceitaColetiva {

    private String fonte;
    private double valor;

    public ReceitaColetiva(String fonte, double valor) {
        this.fonte = fonte;
        this.valor = valor;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
