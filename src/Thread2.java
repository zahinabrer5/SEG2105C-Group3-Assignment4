public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1);
            System.out.println("t2: re");
            Thread.sleep(301);
            System.out.println("t2: fa");
            Thread.sleep(302);
            System.out.println("t2: la");
            Thread.sleep(206);
            System.out.println("t2: do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
