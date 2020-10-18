package model;

class Endereco {
    private String bairro;
    private String rua;
    private String num;
    private String pontoRef;
    private String localGeo;

    public Endereco(String bairro, String rua, String num, String pontoRef, String localGeo) {
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
        this.pontoRef = pontoRef;
        this.localGeo = localGeo;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
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
    
    
}
