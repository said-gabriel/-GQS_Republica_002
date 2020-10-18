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

    private double reclamacoesIndice() {
        return this.totalReclamacoes / this.totalReclamacoesResolvidas;
    }

    private double tarefasConcluidasIndice() {
        return this.totalTarefasDadas / this.totalTarefasConcluidas;
    }

    private double compromissoPagamento() {
        double x = 10;
        return x / x + this.totalDiasAtrasoPagamento;
    }

}
