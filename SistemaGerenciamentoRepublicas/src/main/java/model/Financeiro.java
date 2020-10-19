package model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Financeiro {

    private double saldo;
    private ArrayList<Receita> receita;
    private ArrayList<Despesa> despesa;
    private ArrayList<Morador> moradores;
    private ArrayList<ReceitaColetiva> receitaColetiva;

    public Financeiro() {
        this.receita = new ArrayList<>();
        this.despesa = new ArrayList<>();
        this.moradores = new ArrayList<>();
        this.receitaColetiva = new ArrayList<>();
    }

    public double todasReceitas() {
        if (this.receita != null) {
            double valor = 0;
            for (Receita r : this.receita) {
                valor = valor + r.getValor();
            }
            return valor;
        } else {
            try {
                throw new Exception("Sem dados para calculo!");
            } catch (Exception ex) {
                Logger.getLogger(Financeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;

    }

    public double todasReceitasColetivas() {
        if (this.receitaColetiva != null) {
            double valor = 0;
            for (ReceitaColetiva r : this.receitaColetiva) {
                valor = valor + r.getValor();
            }
            return valor;
        } else {
            try {
                throw new Exception("Sem dados para calculo!");
            } catch (Exception ex) {
                Logger.getLogger(Financeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;

    }

    public double todasDespesas() {
        if (this.despesa != null) {
            double valor = 0;
            for (int i = 0; i < despesa.size(); i++) {
                valor = valor + despesa.get(i).getValor();
            }
            return valor;
        } else {
            try {
                throw new Exception("Sem dados para calculo!");
            } catch (Exception ex) {
                Logger.getLogger(Financeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;

    }

    public double getSaldo() {
        double positivo = todasReceitas() + todasReceitasColetivas();
        double negativo = todasDespesas();
        return positivo - negativo;

    }

    public ArrayList<Receita> getReceita() {
        return receita;
    }

    public void setReceita(ArrayList<Receita> receita) {
        this.receita = receita;
    }

    public ArrayList<Despesa> getDespesa() {
        return despesa;
    }

    public void setDespesa(ArrayList<Despesa> despesa) {
        this.despesa = despesa;
    }

    public ArrayList<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(ArrayList<Morador> moradores) {
        this.moradores = moradores;
    }

    public ArrayList<ReceitaColetiva> getReceitaColetiva() {
        return receitaColetiva;
    }

    public void setReceitaColetiva(ArrayList<ReceitaColetiva> receitaColetiva) {
        this.receitaColetiva = receitaColetiva;
    }

}
