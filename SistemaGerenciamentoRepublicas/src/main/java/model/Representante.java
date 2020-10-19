package model;

import java.time.LocalDate;

public class Representante {

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Morador representante;

    public Representante(Morador representante) {
        this.dataInicio = LocalDate.now();
        this.representante = representante;
    }
    
    
    
    public Morador getRepresentante() {
        return representante;
    }

    public void setRepresentante(Morador representante) {
        this.representante = representante;
    }
    
    
    
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
