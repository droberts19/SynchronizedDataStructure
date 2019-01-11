package sample;

public class Get implements Runnable {

    Controller g;

    Get(Controller get) {
        g = get;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(g.get());
        }
    }
}
