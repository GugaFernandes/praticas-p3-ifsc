package ifsc;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
  
        ArrayList<Produto> produtos = new ArrayList<>();

   
        Produto produto1 = new Produto();
        produto1.setNome("Air frayer");
        produto1.setCodBarras(1234567890L);
        produto1.setPreco(79.99);
        produto1.setFornecedor("Polishop");

        Produto produto2 = new Produto();
        produto2.setNome("Mouse pad");
        produto2.setCodBarras(9876543210L);
        produto2.setPreco(19.99);
        produto2.setFornecedor("Kalunga");

        Produto produto3 = new Produto();
        produto3.setNome("geladeira");
        produto3.setCodBarras(5432109876L);
        produto3.setPreco(1295.78);
        produto3.setFornecedor("Brastemp");

     
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

      
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código de Barras: " + produto.getCodBarras());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Fornecedor: " + produto.getFornecedor());
            System.out.println();
        }
    }
}
