package pbo.posttest6_013;

public abstract class Atlit {
    //property
    private String nama;
    private int umur;
    private double bB;
    private double tB;
    
    //constructor
    public Atlit(String nama, int umur,  double bB, double tB){
        this.nama = nama;
        this.umur = umur;
        this.bB = bB;
        this.tB = tB;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getbB() {
        return bB;
    }

    public void setbB(double bB) {
        this.bB = bB;
    }

    public double gettB() {
        return tB;
    }

    public void settB(double tB) {
        this.tB = tB;
    }
    
    //overrinding   
    public abstract void indikator();
    public abstract void display();

}
