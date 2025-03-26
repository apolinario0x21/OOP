package Ex03_banco;

public class ContaBancaria {
    private String numeroConta;
    private Usuario usuario;
    private double saldo;

    public ContaBancaria(String numeroConta, Usuario usuario) {
        this.numeroConta = numeroConta;
        this.usuario = usuario;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + this.saldo);
    }

    public void imprimirDetalhes() {
        System.out.println("Número da conta: " + this.numeroConta);
        usuario.imprimirDetalhes();
        consultarSaldo();
    }
}

