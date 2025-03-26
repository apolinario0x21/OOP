package Ex04_objetos;

class Pessoa {
    String nome;

/* bloco de inicialização
Pode ser util quando precisamos iniciar um recurso, validar, preparar o ambiente, etc...
*/

    {
        System.out.println("Bloco de inicialização executado antes do construtor");
    }

    Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Construtor executado");

    }
}

class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Zoro");
    }
}
