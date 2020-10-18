package model;

import java.util.ArrayList;

class HistoricoRepublica {
    private ArrayList<Republica> historico;
    private String nomeRepublicas;
    private String representanteAtual;
    private String respresentanteAtualContato;
    private double mediaReputacao;
    
    public HistoricoRepublica(){
        
    }

    public ArrayList<Republica> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Republica> historico) {
        this.historico = historico;
    }

    public String getNomeRepublicas() {
        return nomeRepublicas;
    }

    public void setNomeRepublicas(String nomeRepublicas) {
        this.nomeRepublicas = nomeRepublicas;
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
