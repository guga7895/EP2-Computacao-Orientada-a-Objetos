public class FiltroEstoqueMenorOuIgualA implements MetodosDeFiltragem {
    public boolean filtrar(Produto p, String argFiltro, String argFiltro2) {
        if(p.getQtdEstoque() <= Integer.parseInt(argFiltro)) return true;
        else return false;
    }
}