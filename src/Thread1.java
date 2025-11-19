public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(2001);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(2002);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(2003);
            System.out.println("t1: si");
            FilePlayer.play("si");
            Thread.sleep(2004);
            System.out.println("t1: do-octave");
            FilePlayer.play("do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
