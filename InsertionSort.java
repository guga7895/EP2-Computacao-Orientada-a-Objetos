import java.util.*;
public class InsertionSort implements MetodoDeOrdenacao{
    public void ordenar(int ini, int fim, List<ProdutoFormatado> produtos, String criterio){
        CriterioDeOrdenacao criterioEscolhido = EscolhendoCriterio.escolherCriterio(criterio);
        for(int i = ini; i <= fim; i++) {
            ProdutoFormatado x = produtos.get(i);
            int j = (i - 1);
            while (j >= ini) {
                if (criterioEscolhido.segundaComparacaoComProduto(produtos, j, x)) {
                    produtos.set(j + 1, produtos.get(j));
                    j--;
                } else break;
            }
            produtos.set(j + 1, x);
        }
    }
}