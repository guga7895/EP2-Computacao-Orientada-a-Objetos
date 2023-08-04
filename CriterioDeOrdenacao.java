import java.util.List;

public interface CriterioDeOrdenacao {
    public boolean comparar (List<ProdutoFormatado> produtos, int a, int b);

    public boolean segundaComparacaoComProduto (List<ProdutoFormatado> produtos, int a, ProdutoFormatado b);
}