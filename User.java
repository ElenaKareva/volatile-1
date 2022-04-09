public class User extends Thread {
    private final Tumbler tumbler;

    public User(String name, Tumbler tumbler) {
        super(name);
        this.tumbler = tumbler;
    }

    @Override
    public void run() {
        tumbler.on();
    }
}
