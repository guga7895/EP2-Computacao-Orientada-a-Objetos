import java.util.List;

public interface MetodoDeOrdenacao {
    void ordenar(int ini, int fim, List<ProdutoFormatado> produtos, String criterio);
}
