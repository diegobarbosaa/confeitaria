package model;

public class ClientePJ extends Cliente {

    private String cnpj;

    private String nome_fantasia;

    private String razao_social;

    public ClientePJ(String cnpj, String nome_fantasia, String razao_social, String email, String rua, Integer numero, Integer complemento, String bairro, String cidade, String estado, String cep, String senha, Integer Telefone) {
        super(email, rua, numero, complemento, bairro, cidade, estado, cep, senha, Telefone);
        this.cnpj = cnpj;
        this.nome_fantasia = nome_fantasia;
        this.razao_social = razao_social;
    }  

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

  

        
}