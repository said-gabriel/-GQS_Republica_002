package model;

import java.time.LocalDate;

public class ReclamacaoSugestao {

    private LocalDate data;
    private String descricao;
    private Morador morador;
    private LocalDate dataSolucao;
    private int idade;
    private boolean excluida;

    public ReclamacaoSugestao(String descricao, Morador morador) {
        this.descricao = descricao;
        this.morador = morador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public LocalDate getDataSolucao() {
        return dataSolucao;
    }

    public void setDataSolucao(LocalDate dataSolucao) {
        this.dataSolucao = dataSolucao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isExcluida() {
        return excluida;
    }

    public void setExcluida(boolean excluida) {
        this.excluida = excluida;
    }

}
