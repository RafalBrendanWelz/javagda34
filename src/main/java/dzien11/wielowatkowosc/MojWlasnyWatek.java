package dzien11.wielowatkowosc;

public class MojWlasnyWatek extends Thread {

    @Override
    public synchronized void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Jestem osobnym watkiem!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
