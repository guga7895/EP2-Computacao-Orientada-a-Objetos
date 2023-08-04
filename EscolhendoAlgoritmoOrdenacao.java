public class EscolhendoAlgoritmoOrdenacao {
    public static MetodoDeOrdenacao escolherAlgoritmoOrdenacao (String algoritmo) {
        MetodoDeOrdenacao OrdenacaoEscolhida;
        if(algoritmo.equals(GeradorDeRelatorios.ALG_INSERTIONSORT)){
            OrdenacaoEscolhida = new InsertionSort();
        }
        else if(algoritmo.equals(GeradorDeRelatorios.ALG_QUICKSORT)){
            OrdenacaoEscolhida = new QuickSort();
        }
        else {
            throw new RuntimeException("Algoritmo invalido!");
        }
        return OrdenacaoEscolhida;
    }
}