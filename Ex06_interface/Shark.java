package Ex06_interface;

class Shark implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Shark sound");
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
    }

    public static void main(String[] args) {
        Animal shark = new Shark();
        shark.emitirSom();
        shark.sleep();

    }
}