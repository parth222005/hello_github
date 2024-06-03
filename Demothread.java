class abc extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            try {
                System.out.println("thread 1 " + i);
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread 1 was interrupted");
            }
        }
    }
}

class des extends Thread {
    public void run() {
        for (int i = 50; i >= 1; i--) {
            try {
                System.out.println("thread 2 " + i);
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread 2 was interrupted");
            }
        }
    }
}

class Demothread {
    public static void main(String[] args) {
        abc a = new abc();
        des d = new des();
        a.start();
        d.start();
    }
}