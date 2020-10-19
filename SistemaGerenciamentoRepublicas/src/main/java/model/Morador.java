package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Morador {

    private SemTeto pessoa;
    private HistoricoRepublica historico;
    private Reputacao reputacao;

    public Morador(SemTeto pessoa) {
        this.pessoa = pessoa;
        this.historico = new HistoricoRepublica();
    }

    public Reputacao getReputacao() {
        return reputacao;
    }

    public void setReputacao(Reputacao reputacao) {
        this.reputacao = reputacao;
    }
    
    public void addRepublicaHistorico(Republica rep){
        historico.getHistorico().add(rep);
    }
 
    public SemTeto getPessoa() {
        return pessoa;
    }

    public void setPessoa(SemTeto pessoa) {
        this.pessoa = pessoa;
    }

    public HistoricoRepublica getHistorico() {
        return historico;
    }

    public void setHistorico(HistoricoRepublica historico) {
        this.historico = historico;
    }

}
