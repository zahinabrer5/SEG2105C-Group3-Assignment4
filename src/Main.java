public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
//        Thread.sleep(1000);
        t2.start();
        
        /*
        do do sol sol la la sol fa fa mi mi re re do
        sol sol fa fa mi mi re sol sol fa fa mi mi re
        do do sol sol la la sol fa fa mi mi re re do
        */

//        FilePlayer.play("do");
//        t1.start();
//        Thread.sleep(1000);
//        t2.start();

//        Thread t1 = new Thread(() -> {
//            try {
//                print("do");
//                Thread.sleep(500);
//                print("mi");
//                Thread.sleep(500);
//                print("sol");
//                Thread.sleep(500);
//                print("si");
//                Thread.sleep(500);
//                print("do-octave");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            try {
//                print("re");
//                Thread.sleep(500);
//                print("fa");
//                Thread.sleep(500);
//                print("la");
//                Thread.sleep(500);
//                print("do-octave");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });

//        t1.start();
//        t2.start();

//        t1.join();
//        t2.join();
    }

    public static synchronized void print(String s) {
        System.out.println(s);
    }
}
