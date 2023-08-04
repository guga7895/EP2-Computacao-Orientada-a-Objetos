import java.util.List;

public class CriterioPrecoCrescente implements CriterioDeOrdenacao {
    @Override
    public boolean comparar(List<ProdutoFormatado> produtos, int a, int b) {
        return produtos.get(a).getPreco() > produtos.get(b).getPreco();
    }

    public boolean segundaComparacaoComProduto (List<ProdutoFormatado> produtos, int a, ProdutoFormatado b){
        return produtos.get(a).getPreco() > b.getPreco();
    }
}