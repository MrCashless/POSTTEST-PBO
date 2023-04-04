package pbo.posttest5_013;

import static pbo.posttest5_013.POSTTEST5_013.Biodata;

public class Biodata extends Atlit{
    @Override
    public void indikator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //property
    private String tglLahir;
    private String alamatKota;
    private String jenisKelamin;
    private String statusKerja;
    public final String status ="biodata";
    
    //constructor
    public Biodata(String nama, int umur,  double bB, double tB, String tglLahir, String alamatKota, String jenisKelamin, String statusKerja, String biodata){
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
    
    public void display(){
    System.out.print("\nNama Atlit      : " + this.getNama());
    System.out.print("Umur Atlit        : " + this.getUmur());
    System.out.print("Berat Badan       : " + this.getbB());
    System.out.print("Tinggi Badan      : " + this.gettB());
    System.out.print("Tanggal Lahir     : " + this.getTglLahir());
    System.out.print("Kota Asal         : " + this.getAlamatKota());
    System.out.print("Jenis Kelamin     : " + this.getJenisKelamin());
    System.out.print("Status Pekerjaan  : " + this.getStatusKerja());
    System.out.print("\n");
   }
}