package model;

import java.util.ArrayList;

public class HistoricoRepublica {
    private ArrayList<Republica> historico;
    private String representanteAtual;
    private String respresentanteAtualContato;
    private double mediaReputacao;
    
    public HistoricoRepublica(){
       this.historico = new ArrayList<>();
    }

    public ArrayList<Republica> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Republica> historico) {
        this.historico = historico;
    }

    public String getRepresentanteAtual() {
        return representanteAtual;
    }

    public void setRepresentanteAtual(String representanteAtual) {
        this.representanteAtual = representanteAtual;
    }

    public String getRespresentanteAtualContato() {
        return respresentanteAtualContato;
    }

    public void setRespresentanteAtualContato(String respresentanteAtualContato) {
        this.respresentanteAtualContato = respresentanteAtualContato;
    }

    public double getMediaReputacao() {
        return mediaReputacao;
    }

    public void setMediaReputacao(double mediaReputacao) {
        this.mediaReputacao = mediaReputacao;
    }
    
    
    
    
}
