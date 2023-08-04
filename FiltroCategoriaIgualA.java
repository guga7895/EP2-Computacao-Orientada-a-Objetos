import java.util.*;
public class FiltroCategoriaIgualA implements MetodosDeFiltragem {
    public boolean filtrar(Produto p, String argFiltro, String argFiltro2) {
        if(p.getCategoria().equalsIgnoreCase(argFiltro)) return true;
        else return false;
    }
}