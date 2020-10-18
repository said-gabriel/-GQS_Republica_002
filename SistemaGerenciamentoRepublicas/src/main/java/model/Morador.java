package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Morador {

    private SemTeto pessoa;
    private HistoricoRepublica historico;
    private Republica republica;

    public Morador(SemTeto pessoa, HistoricoRepublica historico, Republica republica) {
        this.pessoa = pessoa;
        this.historico = historico;
        this.republica = republica;
    }

    public void criarRepublica(Republica republica) {
        this.republica = republica;
        historico.getHistorico().add(republica);
    }

    public HistoricoRepublica getHistorico() {
        return historico;
    }

    public void setHistorico(HistoricoRepublica historico) {
        this.historico = historico;
    }

}
