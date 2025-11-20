public class Thread1 extends Thread {

    @Override
    public void run() {
        task1();
    }

    // do re mi fa sol la si do-octave
    private void task1() {
        try {
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(900*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(900*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(900*2);
            System.out.println("t1: si");
            FilePlayer.play("si");
            Thread.sleep(600*2);
            System.out.println("t1: do-octave");
            FilePlayer.play("do-octave");
            Thread.sleep(600*2);
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
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(300*2);
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(300*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(300*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(900*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(1200*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(300*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(900*2);
            System.out.println("t1: do");
            FilePlayer.play("do");
            Thread.sleep(600*2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // sol sol fa fa mi mi re
    private void line2FirstHalf() {
        try {
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(300*2);
            System.out.println("t1: sol");
            FilePlayer.play("sol");
            Thread.sleep(900*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(300*2);
            System.out.println("t1: mi");
            FilePlayer.play("mi");
            Thread.sleep(600*2 + 200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
