public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(600*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(800*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(1000*2);
            System.out.println("t1: si");
            FilePlayer.play("si");
            Thread.sleep(500*2);
            System.out.println("t1: do-octave");
            FilePlayer.play("do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
