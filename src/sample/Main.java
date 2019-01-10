package sample;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Controller c = new Controller();

        for (int i = 0; i < 300; i++) {
            c.put(i);
        }
        for (int i = 0; i < 300; i++) {
            System.out.println(c.get());
        }
    }
}