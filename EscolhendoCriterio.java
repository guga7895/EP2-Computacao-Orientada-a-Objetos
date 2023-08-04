public class EscolhendoCriterio {
    public static CriterioDeOrdenacao escolherCriterio(String criterio) {
        CriterioDeOrdenacao criterioEscolhido;
        if(criterio.equals(GeradorDeRelatorios.CRIT_DESC_CRESC)) criterioEscolhido = new CriterioDescricaoCrescente();
        else if (criterio.equals(GeradorDeRelatorios.CRIT_PRECO_CRESC)) criterioEscolhido = new CriterioPrecoCrescente();
        else if (criterio.equals(GeradorDeRelatorios.CRIT_ESTOQUE_CRESC)) criterioEscolhido = new CriterioEstoqueCrescente();
        else if(criterio.equals(GeradorDeRelatorios.CRIT_DESC_DECRESC)) criterioEscolhido = new CriterioDescricaoDecrescente();
        else if(criterio.equals(GeradorDeRelatorios.CRIT_PRECO_DECRESC)) criterioEscolhido = new CriterioPrecoDecrescente();
        else if(criterio.equals(GeradorDeRelatorios.CRIT_ESTOQUE_DECRESC)) criterioEscolhido = new CriterioEstoqueDecrescente();
        else throw new RuntimeException("Criterio invalido!");
        return criterioEscolhido;
    }
}