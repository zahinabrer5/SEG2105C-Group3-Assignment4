public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1);
            System.out.println("t2: re");
            FilePlayer.play("re");
            Thread.sleep(3001);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(3002);
            System.out.println("t2: la");
            FilePlayer.play("la");
            Thread.sleep(2006);
            System.out.println("t2: do-octave");
            FilePlayer.play("do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
