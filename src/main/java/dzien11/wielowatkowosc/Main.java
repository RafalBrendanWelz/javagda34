package dzien11.wielowatkowosc;

import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {

        Runnable uruchamialna1 = new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread watek1 = new Thread(uruchamialna1);
        Thread watek2 = new Thread(new MyRun());

        watek1.start();
        watek2.start();


        Thread watek3 = new MojWlasnyWatek();
        watek3.start();
    }

}
