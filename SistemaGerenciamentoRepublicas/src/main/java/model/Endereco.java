package model;

public class  Endereco {
    private String bairro;
    private String rua;
    private int num;
    private String pontoRef;
    private String localGeo;
    private String cidade;
    private String estado;
    
    public Endereco(){
        
    }

    public Endereco(String bairro, String rua, int num, String pontoRef, String localGeo, String cidade, String estado) {
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
        this.pontoRef = pontoRef;
        this.localGeo = localGeo;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public String getLocalGeo() {
        return localGeo;
    }

    public void setLocalGeo(String localGeo) {
        this.localGeo = localGeo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        
}
