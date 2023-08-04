public class ProdutoFormatado extends ProdutoPadrao{
    private static final String SEPARADOR = ", ";
    private int id;
    private String descricao;
    private String categoria;
    private int qtdEstoque;
    private double preco;
    private boolean negrito;
    private boolean italico;
    private String cor;
    public ProdutoFormatado(int id, String descricao, String categoria, int qtdEstoque, double preco,boolean negrito, boolean italico, String cor){
        super(id,descricao,categoria,qtdEstoque,preco);
        this.italico = italico;
        this.negrito = negrito;
        this.cor = cor;
    }

    public boolean getItalico() {
        return this.italico;
    }

    public boolean getNegrito() {
        return this.negrito;
    }

    public String getCor() {
        return this.cor;
    }
}
