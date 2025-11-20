public class Thread2 extends Thread {

    @Override
    public void run() {
        task2();
    }

    // do re mi fa sol la si do-octave
    private void task1() {
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

    /*
    do do sol sol la la sol fa fa mi mi re re do
    sol sol fa fa mi mi re sol sol fa fa mi mi re
    do do sol sol la la sol fa fa mi mi re re do
    */
    private void task2() {
        line1();
        line2FirstHalf(); line2FirstHalf();
        line1();
    }

    // do do sol sol la la sol fa fa mi mi re re do
    private void line1() {
        try {
            Thread.sleep(1200*2 + 100); // add a small delay of 100 ms before starting t2...
            System.out.println("t2: la");
            FilePlayer.play("la");
            Thread.sleep(300*2);
            System.out.println("t2: la");
            FilePlayer.play("la");
            Thread.sleep(900*2);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(300*2);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(900*2);
            System.out.println("t2: re");
            FilePlayer.play("re");
            Thread.sleep(300*2);
            System.out.println("t2: re");
            FilePlayer.play("re");
            Thread.sleep(900*2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // sol sol fa fa mi mi re
    private void line2FirstHalf() {
        try {
            Thread.sleep(600*2);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(300*2);
            System.out.println("t2: fa");
            FilePlayer.play("fa");
            Thread.sleep(900*2);
            System.out.println("t2: re");
            FilePlayer.play("re");
            Thread.sleep(300*2 + 200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
