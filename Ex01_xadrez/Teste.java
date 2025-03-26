package Ex01_xadrez;

public class Teste {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.exibirTabulleiro();

        System.out.println("Movendo a Rainha");
        tabuleiro.moverPeca(0, 3, 3, 0);

        tabuleiro.exibirTabulleiro();

    }
}
