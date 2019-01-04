package sample;

public class Controller implements Runnable {
    private int z = 0;
    private int a = 0;


    private void doThings() {
        System.out.println();
        System.out.println("Count up to 100 and back down to 0");
        for (int i = 0; i < 200; i++) {
            if (z == 1) {
                a = a + 1;
                System.out.println(a);
            }
            if (z == 2) {
                a = a - 1;
                System.out.println(a);
            }
            if (a == 100) {
                z = 2;
            }
            if (a == 0) {
                z = 1;
            }
        }
    }

    public void run() {
        doThings();
    }
}
