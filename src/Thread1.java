public class Thread1 extends Thread {
    private String[] tones = { "do", "mi", "sol", "si", "do-octave" };
    private int idx = 0;

    @Override
    public void run() {
        System.out.print(tones[idx++]+" ");
        idx %= tones.length;
    }
}
