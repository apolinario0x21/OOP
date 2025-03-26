class Veiculos {
    String marca;

    void buzinar() {
        System.out.println("Buzinando");
    }
}

class Carro extends Veiculos {
    int numeroDePortas;

    void showPort() {
        System.out.println("Marca: " + marca);
        System.out.println("Numbero de portas: " + numeroDePortas);
    }

    @Override
    void buzinar() {
        System.out.println("Carro buzinando");
    }
}

class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.numeroDePortas = 4;
        carro.buzinar();
        carro.showPort();
    }
}