public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
        
        /*
        do do sol sol la la sol fa fa mi mi re re do
        sol sol fa fa mi mi re sol sol fa fa mi mi re
        do do sol sol la la sol fa fa mi mi re re do
        */
    }
}
