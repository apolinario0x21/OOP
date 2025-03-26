package Ex02loja;

public class Teste {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto("Camiseta", 50.0, 3);
        Produto produto2 = new Produto("Calça", 100.0, 2);

        estoque.exibeEstoque();
        System.out.println("\n");

        estoque.adicionarProdutos(produto1);
        estoque.adicionarProdutos(produto2);
        estoque.exibeEstoque();
        System.out.println("Produtos add\n");

        produto1.removerEstoque(2);
        produto2.adicionarEstoque(1);
        estoque.exibeEstoque();
        System.out.println("Produtos removidos, mas também adicionados\n");

        Produto produtoConsultado = estoque.consultarProduto("Camisetas");
        if(produtoConsultado != null) {
            System.out.println("Quantidade de camisetas em estoque: " + produtoConsultado.getQuantidade());
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\n");

        estoque.exibeEstoque();
        System.out.println("\n");

        estoque.removerProduto("Camiseta");
        estoque.exibeEstoque();



    }
}
