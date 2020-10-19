package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Tarefa {

    private LocalDate dataAgendamento;
    private ArrayList<Morador> responsaveis;
    private String descricao;
    private LocalDate dataTermino;
    private boolean finalizada;

    public Tarefa(ArrayList<Morador> responsaveis, String descricao) {
        this.responsaveis = responsaveis;
        this.descricao = descricao;
        this.dataAgendamento = LocalDate.now();
        this.finalizada = false;
    }

    public void finalizar() {
        LocalDate agora = LocalDate.now();
        this.dataTermino = agora;
    }

    public double atraso() {
        if (this.dataTermino.compareTo(dataAgendamento) < 0) {
            long difEmDias = ChronoUnit.DAYS.between(this.dataTermino, this.dataAgendamento);
        }
        return 0;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public ArrayList<Morador> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(ArrayList<Morador> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

}
