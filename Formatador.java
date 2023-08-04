import java.io.PrintWriter;

public class Formatador {
    public static void formatar(ProdutoFormatado p, PrintWriter out) {
        Produto formatacao;
        out.print("<li>");
        if (p.getItalico() && p.getNegrito()) {
            formatacao = new ProdutoColorido(new ProdutoEmNegrito(new ProdutoEmItalico(p)), p.getCor());
        } else if (p.getItalico()) {
            formatacao = new ProdutoEmItalico(new ProdutoColorido(p, p.getCor()));
        } else if (p.getNegrito()) {
            formatacao = new ProdutoEmNegrito(new ProdutoColorido(p, p.getCor()));
        } else {
            formatacao = new ProdutoColorido(p, p.getCor());
        }

        out.print(formatacao.formataParaImpressao());

        out.print("</span>");
        out.println("</li>");
    }
}
