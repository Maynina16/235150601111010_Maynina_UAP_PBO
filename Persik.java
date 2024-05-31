public class Persik extends Tanaman   {
    private int masaHidup;
    private int berbuah;
    private double perkembangan; 

    public Persik (int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
    }
    Persik persik = new Persik(180, 250, 15);
    @Override
    public void berkembang(){
    }
    @Override
    public String toString() {
        return persik.toString();
    }
    @Override
    public void Status() {
    }
}