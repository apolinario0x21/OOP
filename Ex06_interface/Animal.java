package Ex06_interface;

public interface Animal {
    int MAX_USUARIOS = 100;
    void emitirSom();

    default void sleep() {
        System.out.println("zzzZZZzzzZZZzzz");
    }

    static void showMsg(String msg) {
        System.out.println(msg);
    }

    private void preparar() {
        System.out.println("Configurando a interface...");
    }


}
