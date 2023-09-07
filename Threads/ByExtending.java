class ByExtending extends Thread {
    int a = 0;

    ByExtending(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("in run method " + a);
    }

    public static void main(String args[]) {
        ByExtending byExtending = new ByExtending(0);
        byExtending.start();

        ByExtending byExtending1 = new ByExtending(1);
        try {
            byExtending1.start();
            byExtending.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}