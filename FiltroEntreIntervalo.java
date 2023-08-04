public class FiltroEntreIntervalo implements MetodosDeFiltragem {
    @Override
    public boolean filtrar(Produto p, String argFiltro, String argFiltro2){
        return p.getPreco() <= Double.parseDouble(argFiltro2) && p.getPreco() >= Double.parseDouble(argFiltro);
    }
}
