package sample;

public class Put implements Runnable {

    Controller p;

    Put(Controller put) {
        p = put;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            p.put(i);
        }
    }
}
