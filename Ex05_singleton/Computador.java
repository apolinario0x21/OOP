package Ex05_singleton;

class Singleton {
    private static Singleton instance;
    private String versao = "1.0";

    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Computador {
    public static void main(String[] args) {
        Singleton singleton =  Singleton.getInstance();
        Singleton singleton1 =  Singleton.getInstance();

        System.out.println(singleton == singleton1);

    }
}

// exemplo de uso de construtor privado