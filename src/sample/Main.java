package sample;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Controller c = new Controller();

        for (int i = 0; i < 300; i++) {
            c.put(i);
            System.out.println(c.get());
        }
        for (int i = 0; i < 100; i++) {
        }


        /*Put doPut = new Put(c);
        Get doGet = new Get(c);

        Thread putThread = new Thread(doPut);
        putThread.start();

        Thread getThread = new Thread(doGet);
        getThread.start();*/
    }
}