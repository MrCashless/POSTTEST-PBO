package pbo.posttest3_013;

public class Biodata extends Atlit{
    //property
    private String tglLahir;
    private String alamatKota;
    private String jenisKelamin;
    private String statusKerja;
    
    //constructor
    public Biodata(String nama, int umur,  double bB, double tB, String tglLahir, String alamatKota, String jenisKelamin, String statusKerja){
        super(nama, umur, bB, tB);
        this.tglLahir = tglLahir;
        this.alamatKota = alamatKota;
        this.jenisKelamin = jenisKelamin;
        this.statusKerja = statusKerja;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamatKota() {
        return alamatKota;
    }

    public void setAlamatKota(String alamatKota) {
        this.alamatKota = alamatKota;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatusKerja() {
        return statusKerja;
    }

    public void setStatusKerja(String statusKerja) {
        this.statusKerja = statusKerja;
    }
    
    
}
