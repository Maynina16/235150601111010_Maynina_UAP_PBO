public class Stroberi extends Tanaman  {
    private int masaHidup;
    private int berbuah;
    private double perkembangan; 

    public Stroberi(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
    }
    Stroberi stroberi = new Stroberi(60, 150, 35);

    @Override
    public void perkembangan(){
    }
    @Override
    public String toString() {
        return stroberi.toString();
    }
    @Override
    public void Status() {
    }   
}
