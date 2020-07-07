package model;

public class Categoria {

    private Integer categoria_id;

    private String categoria_nome;

    private String descricao;

    public Categoria(String categoria_nome, String descricao) {
        this.categoria_nome = categoria_nome;
        this.descricao = descricao;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getCategoria_nome() {
        return categoria_nome;
    }

    public void setCategoria_nome(String categoria_nome) {
        this.categoria_nome = categoria_nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }       
        
    public void adicionarCategoria() {

    }

    public void excluirCategoria() {

    }

    public void alterarCategoria() {

    }

}