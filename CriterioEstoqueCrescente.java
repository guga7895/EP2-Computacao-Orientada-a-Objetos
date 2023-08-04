import java.util.List;

public class CriterioEstoqueCrescente implements CriterioDeOrdenacao {
    @Override
    public boolean comparar(List<ProdutoFormatado> produtos, int a, int b) {
        return produtos.get(a).getQtdEstoque() > produtos.get(b).getQtdEstoque();
    }

    public boolean segundaComparacaoComProduto (List<ProdutoFormatado> produtos, int a, ProdutoFormatado b){
        return produtos.get(a).getQtdEstoque() > b.getQtdEstoque();
    }
}