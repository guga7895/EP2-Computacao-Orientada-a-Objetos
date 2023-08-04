public class ProdutoColorido implements Produto {
    private Produto base;

    private static final String SEPARADOR = ", ";
    private int id;
    private String descricao;
    private String categoria;
    private int qtdEstoque;
    private double preco;
    private String cor;

    public ProdutoColorido(Produto produto, String cor){
        this.base = produto;
        this.cor = cor;
    }
    private void setId(int id){
        this.id = id;
    }
    private void setDescricao(String descricao){
        this.descricao = descricao;
    }
    private void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getId(){
        return this.id;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String getCategoria(){

        return this.categoria;
    }
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }
    public double getPreco(){
        return this.preco;
    }

    @Override
    public String formataParaImpressao(){
        return ("<span style=\"color:"+cor+"\">" + base.formataParaImpressao());
    }
}
