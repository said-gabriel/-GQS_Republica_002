package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Republica {

    private String nome;
    private LocalDate dataFundacao;
    private LocalDate dataExtincao;
    private Endereco endereco;
    private String cep;
    private String vantagens;
    private int vagasTotal;
    private int vagasDisponiveis;
    private int vagasOcupadas;
    private String codigoEtica;
    ArrayList<Morador> moradores;
    private String representante;

    public Republica() {
    }

    public Republica(String nome, LocalDate dataExtincao, Endereco endereco, String cep, String vantagens, int vagasTotal, Morador morador, String representante) {
        this.nome = nome;
        this.dataExtincao = dataExtincao;
        this.endereco = endereco;
        this.cep = cep;
        this.vantagens = vantagens;
        this.vagasTotal = vagasTotal;
        this.moradores.add(morador);
        this.dataFundacao = dataFundacao.now();
        this.representante = morador.getNome();
    }
    
    public void terminarRepublica(){
        if(dataExtincao == null){
           this.setDataExtincao(dataExtincao.now());
        }else{
            try {
                throw new Exception("Republica ja extinta!");
            } catch (Exception ex) {
                Logger.getLogger(Republica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public LocalDate getDataExtincao() {
        return dataExtincao;
    }

    public void setDataExtincao(LocalDate dataExtincao) {
        this.dataExtincao = dataExtincao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

    public int getVagasTotal() {
        return vagasTotal;
    }

    public void setVagasTotal(int vagasTotal) {
        this.vagasTotal = vagasTotal;
    }

    public int getVagasDisponiveis() {
        int x = this.getVagasTotal() - this.getMoradores().size();
        setVagasDisponiveis(x);
        return this.vagasDisponiveis;
    }

    private void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public int getVagasOcupadas() {
        int x = this.getMoradores().size();
        setVagasOcupadas(x);
        return this.vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public String getCodigoEtica() {
        return codigoEtica;
    }

    public void setCodigoEtica(String codigoEtica) {
        this.codigoEtica = codigoEtica;
    }

    public ArrayList<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(ArrayList<Morador> moradores) {
        this.moradores = moradores;
    }

   }
