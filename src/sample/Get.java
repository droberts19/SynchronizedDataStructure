package sample;

public class Get implements Runnable {

    Controller g;
    private int limit;

    Get(Controller get, int Limit) {
        g = get;
        limit = Limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            Object didGet = g.get();
            while (didGet == null) {
                Thread.currentThread().yield();
                didGet = g.get();
            }
            System.out.println("Got " + didGet);
        }
        System.out.println("Get was done");
    }
}
