import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mesa", 700));
        produtos.add(new Produto("Tv", 1500));
        produtos.add(new Produto("Computador", 4000));
        produtos.add(new Produto("Mouse", 200));
        produtos.add(new Produto("Teclado",150));

        AnaliseProdutos analise = new AnaliseProdutos(produtos);

        System.out.println("o mais caro é: " + analise.maisCaro().getNome() + " - " + analise.maisCaro().getPreco());
        System.out.println("o mais barato é: " + analise.maisBarato().getNome() + " - " + analise.maisBarato().getPreco());
        System.out.println("a média é: " + analise.calcularMedia());

        System.out.println("\nProdutos acima da média: ");
        for(Produto p : analise.produtosAcimaDaMedia()){
            System.out.println(p.getNome() + " - " + p.getPreco());
        }
    }
}

