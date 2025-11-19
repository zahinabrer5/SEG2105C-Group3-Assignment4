public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(300*2);
            System.out.println("t2: re");
            FilePlayer.play("re");
            Thread.sleep(700*2);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(900*2);
            System.out.println("t2: la");
            FilePlayer.play("la");
            Thread.sleep(1000*2);
            System.out.println("t2: do-octave");
            FilePlayer.play("do-octave");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
