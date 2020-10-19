package model;

public class Reputacao {

    private int totalReclamacoes;
    private int totalReclamacoesResolvidas;
    private int totalTarefasDadas;
    private int totalTarefasConcluidas;
    private int totalDiasAtrasoPagamento;

    public Reputacao(int totalReclamacoes, int totalReclamacoesResolvidas, int totalTarefasDadas, int totalTarefasConcluidas, int totalDiasAtrasoPagamento) {
        this.totalReclamacoes = totalReclamacoes;
        this.totalReclamacoesResolvidas = totalReclamacoesResolvidas;
        this.totalTarefasDadas = totalTarefasDadas;
        this.totalTarefasConcluidas = totalTarefasConcluidas;
        this.totalDiasAtrasoPagamento = totalDiasAtrasoPagamento;
    }

    public double reclamacoesIndice() {
        return this.totalReclamacoes / this.totalReclamacoesResolvidas;
    }

    public double tarefasConcluidasIndice() {
        return this.totalTarefasDadas / this.totalTarefasConcluidas;
    }

    public double compromissoPagamento() {
        double x = 10;
        return x / x + this.totalDiasAtrasoPagamento;
    }

    public int getTotalReclamacoes() {
        return totalReclamacoes;
    }

    public void setTotalReclamacoes(int totalReclamacoes) {
        this.totalReclamacoes = totalReclamacoes;
    }

    public int getTotalReclamacoesResolvidas() {
        return totalReclamacoesResolvidas;
    }

    public void setTotalReclamacoesResolvidas(int totalReclamacoesResolvidas) {
        this.totalReclamacoesResolvidas = totalReclamacoesResolvidas;
    }

    public int getTotalTarefasDadas() {
        return totalTarefasDadas;
    }

    public void setTotalTarefasDadas(int totalTarefasDadas) {
        this.totalTarefasDadas = totalTarefasDadas;
    }

    public int getTotalTarefasConcluidas() {
        return totalTarefasConcluidas;
    }

    public void setTotalTarefasConcluidas(int totalTarefasConcluidas) {
        this.totalTarefasConcluidas = totalTarefasConcluidas;
    }

    public int getTotalDiasAtrasoPagamento() {
        return totalDiasAtrasoPagamento;
    }

    public void setTotalDiasAtrasoPagamento(int totalDiasAtrasoPagamento) {
        this.totalDiasAtrasoPagamento = totalDiasAtrasoPagamento;
    }

}
