import java.util.Collections;
import java.util.List;

public class QuickSort implements MetodoDeOrdenacao {
    public int particiona(int ini, int fim, List<ProdutoFormatado> produtos, String criterio){
        int i = (ini - 1);
        int j = (fim + 1);
        CriterioDeOrdenacao criterioEscolhido = EscolhendoCriterio.escolherCriterio(criterio);
        while(true){
            do{
                j--;
            } while(criterioEscolhido.comparar(produtos, j, ini));
            do{
                i++;
            } while(criterioEscolhido.comparar(produtos, ini, i));
            if(i < j){
                Collections.swap(produtos,i,j);
            }
            else return j;
        }
    }
    public void ordenar(int ini, int fim, List<ProdutoFormatado> produtos, String criterio){
        if(ini < fim) {
            int q = particiona(ini, fim, produtos, criterio);
            ordenar(ini, q,produtos,criterio);
            ordenar(q + 1, fim,produtos,criterio);
        }
    }
}
