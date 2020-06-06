package confeitaria.model;

public class Produto {

    private Integer produto_id;

    private String produto_nome;

    private String produto_descricao;

    private Byte Foto;

    private Float preco_unitario;

    private String tamanho;

    private Float desconto;

    public Categoria categoria;

    public Produto(String produto_nome, String produto_descricao, Float preco_unitario, String tamanho) {
        this.produto_nome = produto_nome;
        this.produto_descricao = produto_descricao;
        this.preco_unitario = preco_unitario;
        this.tamanho = tamanho;
    }

    public Integer getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Integer produto_id) {
        this.produto_id = produto_id;
    }

    public String getProduto_nome() {
        return produto_nome;
    }

    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }

    public String getProduto_descricao() {
        return produto_descricao;
    }

    public void setProduto_descricao(String produto_descricao) {
        this.produto_descricao = produto_descricao;
    }

    public Byte getFoto() {
        return Foto;
    }

    public void setFoto(Byte Foto) {
        this.Foto = Foto;
    }

    public Float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }       

    public void cadastrarProduto () {
    
    } 

}