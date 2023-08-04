public class Filtrador {
    public static boolean escolherFiltracao(String filtro, ProdutoFormatado p, String argFiltro, String argFiltro2) {
        MetodosDeFiltragem FiltradoEscolhido;
        if(filtro.equals(GeradorDeRelatorios.FILTRO_TODOS)){
            FiltradoEscolhido = new FiltroTodos();
        }
        else if(filtro.equals(GeradorDeRelatorios.FILTRO_ESTOQUE_MENOR_OU_IQUAL_A)){
            FiltradoEscolhido = new FiltroEstoqueMenorOuIgualA();
        }
        else if(filtro.equals(GeradorDeRelatorios.FILTRO_CATEGORIA_IGUAL_A)) {
            FiltradoEscolhido = new FiltroCategoriaIgualA();
        }
        else if(filtro.equals(GeradorDeRelatorios.FILTRO_PRECO_INTERVALO)){
            FiltradoEscolhido = new FiltroEntreIntervalo();
        }
        else if(filtro.equals(GeradorDeRelatorios.FILTRO_CONTEM_SUBSTRING)){
            FiltradoEscolhido = new FiltroContemSubstring();
        }
        else {
            throw new RuntimeException("Filtro invalido!");
        }
        return FiltradoEscolhido.filtrar(p, argFiltro, argFiltro2);
    }
}
