package Ex04_objetos;

class Produto {
    String nome;
    float preco;

    Produto() {
        nome = "retrovisor";
        preco = 0.0f;
    }

    // overload do construtor
    Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0f;
    }

    Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
}


class Carro {
public static void main(String[] args) {
    Produto produto = new Produto();
    Produto produto1 = new Produto("porta");
    Produto produto2 = new Produto("rodas", 1000.0f);

    System.out.println(produto.nome);
    System.out.println(produto1.nome);
    System.out.println(produto2.nome);
    }
}