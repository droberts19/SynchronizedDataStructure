package sample;

public class Put implements Runnable {

    Controller p;
    private int id;
    private int puts;

    Put(Controller put, int Id, int howMany) {
        p = put;
        id = Id;
        puts = howMany;
    }

    @Override
    public void run() {
        for (int i = 0; i < puts; i++) {
            boolean didPut = p.put(id);
            while (!didPut) {
                Thread.currentThread().yield();
                didPut = p.put(id);
            }
        }
        System.out.println("Put was done");
    }
}
