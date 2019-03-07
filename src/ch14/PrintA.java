package ch14;

public class PrintA implements Runnable {
    @Override
    public void run() {
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                System.out.printf("%-3s", "z");
        });
        t4.start();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                try {
                    t4.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("%-3s", "A");
        }


    }
}

