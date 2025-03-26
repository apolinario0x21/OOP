package Ex03banco;

public class Usuario {
    private String nome;
    private String cpf;

    public Usuario(String nome, String cpf) {
        this.cpf = nome;
        this.nome = cpf;
    }

    public void imprimirDetalhes(){
        System.out.println("Usuário: " + nome + " - CPF: " + cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
