package sample;

public class Put implements Runnable {

    Controller p;
    private int limit;

    Put(Controller put, int Limit) {
        p = put;
        limit = Limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            boolean didPut = p.put(i);
            while (!didPut) {
                Thread.currentThread().yield();
                didPut = p.put(i);
            }
        }
        System.out.println("Put was done");
    }
}
