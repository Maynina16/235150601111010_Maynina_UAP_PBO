public class Tomat extends Tanaman{
    private int masaHidup;
    private int berbuah;
    private double berkembang; 

    public Tomat(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.berkembang = berkembang;
    }
    Tomat tomat = new Tomat(100, 100, 25);
    
    @Override
    public void berkembang(){
    }
    @Override
    public String toString() {
        return tomat.toString();
    }
    @Override
    public void Status() {
        
    }
}
