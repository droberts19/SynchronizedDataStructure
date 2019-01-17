package sample;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Controller c = new Controller();

        /*for (int i = 0; i < 200; i++) {
            c.put(i);
        }
        for (int i = 0; i < 200; i++) {
            System.out.println(c.get());
        }*/

        Put doPut = new Put(c, 300);
        Get doGet = new Get(c, 300);

        Thread putThread = new Thread(doPut);
        putThread.start();
        Thread getThread = new Thread(doGet);
        getThread.start();



    }
}