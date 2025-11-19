public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("t1: do");
            Thread.sleep(201);
            System.out.println("t1: mi");
            Thread.sleep(202);
            System.out.println("t1: sol");
            Thread.sleep(203);
            System.out.println("t1: si");
            Thread.sleep(204);
            System.out.println("t1: do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
