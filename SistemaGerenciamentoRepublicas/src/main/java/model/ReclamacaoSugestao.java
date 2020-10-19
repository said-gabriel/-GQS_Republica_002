package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        this.excluida = false;
        this.data = LocalDate.now();
    }

    public void solucionar() {
        LocalDate agora = LocalDate.now();
        this.dataSolucao = agora;    
    }

    public double atraso() {
        if (this.dataSolucao.compareTo(data) < 0) {
            long difEmDias = ChronoUnit.DAYS.between(this.dataSolucao, data);
        }
        return 0;
    }

    public void excluir() {
        this.setExcluida(true);
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
