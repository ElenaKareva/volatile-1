public class Main {

    public static void main(String[] args) throws InterruptedException {
        Tumbler tumbler = new Tumbler();
        User user = new User("Лена", tumbler);
        Toy toy = new Toy("Тигренок из коробки", tumbler);

        user.start();
        toy.start();
        user.join();
    }
}

