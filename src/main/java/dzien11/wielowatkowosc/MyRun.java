package dzien11.wielowatkowosc;

public class MyRun implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 100; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
