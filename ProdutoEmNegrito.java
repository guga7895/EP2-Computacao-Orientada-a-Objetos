public class ProdutoEmNegrito implements Produto{
    private Produto base;

    private static final String SEPARADOR = ", ";
    private int id;
    private String descricao;
    private String categoria;
    private int qtdEstoque;
    private double preco;

    public ProdutoEmNegrito(Produto produto){
        this.base = produto;
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
        return ("<span style=\"font-weight:bold\">" + base.formataParaImpressao());
    }
}