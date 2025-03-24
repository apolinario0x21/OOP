package banco;

public class Teste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Zoro", "000.000.001-00");
        ContaBancaria conta = new ContaBancaria("000-1", usuario);

        conta.imprimirDetalhes();
        System.out.println("\n");

        conta.depositar(123);
        System.out.println("\n");

        conta.consultarSaldo();
        System.out.println("\n");

        conta.imprimirDetalhes();
}}
