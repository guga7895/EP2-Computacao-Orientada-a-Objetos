import java.util.List;

public class CriterioDescricaoCrescente implements CriterioDeOrdenacao {
    @Override
    public boolean comparar(List<ProdutoFormatado> produtos, int a, int b) {
        return produtos.get(a).getDescricao().compareToIgnoreCase(produtos.get(b).getDescricao()) > 0;
    }

    public boolean segundaComparacaoComProduto (List<ProdutoFormatado> produtos, int a, ProdutoFormatado b){
        return produtos.get(a).getDescricao().compareToIgnoreCase(b.getDescricao()) > 0;
    }
}