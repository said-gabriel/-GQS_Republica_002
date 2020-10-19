package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Despesa {

    private String descricao;
    private LocalDate vencimento;
    private double valor;
    private String periodo;
    private double valorParcela;
    private ArrayList<Morador> participantes;

    public Despesa(String descricao, LocalDate vencimento, double valor, String periodo, double valorParcela, ArrayList<Morador> participantes) {
        this.descricao = descricao;
        this.vencimento = vencimento;
        this.valor = valor;
        this.periodo = periodo;
        this.valorParcela = valorParcela;
        this.participantes = participantes;
    }
    
    public void rachaPercentual(){
        
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public ArrayList<Morador> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Morador> participantes) {
        this.participantes = participantes;
    }

}
