package model;

public class SemTeto {

    private String nome;
    private String apelido;
    private String telefone;
    private String linkSociais;
    private String telResp1;
    private String telResp2;

    public SemTeto(String nome, String apelido, String telefone, String linkSociais, String telResp1, String telResp2) {
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.linkSociais = linkSociais;
        this.telResp1 = telResp1;
        this.telResp2 = telResp2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLinkSociais() {
        return linkSociais;
    }

    public void setLinkSociais(String linkSociais) {
        this.linkSociais = linkSociais;
    }

    public String getTelResp1() {
        return telResp1;
    }

    public void setTelResp1(String telResp1) {
        this.telResp1 = telResp1;
    }

    public String getTelResp2() {
        return telResp2;
    }

    public void setTelResp2(String telResp2) {
        this.telResp2 = telResp2;
    }

}
