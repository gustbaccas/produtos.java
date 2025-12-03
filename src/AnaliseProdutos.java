import java.util.ArrayList;
import java.util.List;

public class AnaliseProdutos {
    private final List<Produto> produtos;

    public AnaliseProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto maisCaro() {
        Produto maisCaro = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    public Produto maisBarato() {
        Produto maisBarato = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() < maisBarato.getPreco()) {
                maisBarato = p;
            }
        }
        return maisBarato;
    }

    public double calcularMedia() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total / produtos.size();
    }

    public List<Produto> produtosAcimaDaMedia() {
        double media = calcularMedia();
        List<Produto> acimaDaMedia = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getPreco() > media) {
                acimaDaMedia.add(p);
            }
        }
        return acimaDaMedia;
    }
}
