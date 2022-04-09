public class Toy extends Thread{
    private final Tumbler tumbler;

    public Toy(String name, Tumbler tumbler) {
        super(name);
        this.tumbler = tumbler;
    }

    @Override
    public void run() {
        tumbler.off();
    }
}
