package model;

public class Vaga {

    private int total;
    private int vagasOcupadas;
    private int vagasDisponiveis;

    public Vaga(int total) {
        this.total = total;
        this.vagasDisponiveis = total;
        this.vagasOcupadas = 0;
    }

    public boolean verificaVaga() {
        if (this.vagasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getVagasDisponiveis() {
        return this.total - this.vagasOcupadas;
    }

    public void add() {
        this.vagasOcupadas++;
        this.vagasDisponiveis--;
    }

    public void remove() {
        this.vagasOcupadas--;
        this.vagasDisponiveis++;
    }
}
