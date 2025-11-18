public class Thread2 extends Thread {
    private String[] tones = { "re", "fa", "la", "do-octave" };
    private int idx = 0;

    @Override
    public void run() {
        System.out.print(tones[idx++]+" ");
        idx %= tones.length;
    }
}
