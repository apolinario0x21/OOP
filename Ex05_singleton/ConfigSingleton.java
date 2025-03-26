package Ex05_singleton;

class ConfigSingleton {
    private static ConfigSingleton instance;

    private ConfigSingleton() {
    }

    public static ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }

        return instance;
    }
}

class Testes {

    public static void main(String[] args) {
        ConfigSingleton config = ConfigSingleton.getInstance();
        ConfigSingleton config1 = ConfigSingleton.getInstance();

        System.out.println(config == config1);
    }
}
