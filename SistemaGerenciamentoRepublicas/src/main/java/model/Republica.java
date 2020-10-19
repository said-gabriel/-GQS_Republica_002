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
    private Vaga vagasTotal;
    private String codigoEtica;
    ArrayList<Morador> moradores;
    private Representante representante;
    private ArrayList<ReclamacaoSugestao> reclamacoes;
    private ArrayList<Tarefa> tarefas;
    private Financeiro financeiro;
    
    

    public Republica() {
    }

    public Republica(String nome,Endereco endereco, String cep, String vantagens, Vaga vagasTotal, Representante representante) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.vantagens = vantagens;
        this.vagasTotal = vagasTotal;
        this.moradores = new ArrayList<>();
        this.dataFundacao = dataFundacao.now();
        this.representante = representante;
        this.financeiro = new Financeiro();
        this.tarefas = new ArrayList<>();
        this.reclamacoes = new ArrayList<>();
    }

    public Vaga getVagasTotal() {
        return vagasTotal;
    }

    public void setVagasTotal(Vaga vagasTotal) {
        this.vagasTotal = vagasTotal;
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

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
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
