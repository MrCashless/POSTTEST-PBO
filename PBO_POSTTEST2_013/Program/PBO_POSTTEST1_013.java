/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// package  pbo_posttest1_013;

import java.util.*; 
import java.io.*;
/**
 *
 * @author Bramantyo
 */

class Athlete {
    private String nama;
    private int umur;
    private String tmptLahir;
    private String tglLahir;
    private String kurata;
    private double bB;
    private double tB;
    
    
    public Athlete(String nama,int umur, String tmptLahir,String tglLahir,String kurata, double bB, double tB){
        this.nama = nama;
        this.umur = umur;
        this.tmptLahir = tmptLahir;
        this.tglLahir = tglLahir;
        this.kurata = kurata;
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

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getKurata() {
        return kurata;
    }

    public void setKurata(String kurata) {
        this.kurata = kurata;
    }

    public double getBB() {
        return bB;
    }

    public void setBB(double bB) {
        this.bB = bB;
    }

    public double getTB() {
        return tB;
    }

    public void setTB(double tB) {
        this.tB = tB;
    }
    

    
    public void registrasi(){
        System.out.println(" " + this.nama);
        System.err.println(" " + this.umur);
        System.out.println(" " + this.tmptLahir);
        System.out.println(" " + this.tglLahir);
        System.out.println(" " + this.kurata);
        System.out.println(" " + this.bB);
        System.out.println(" " + this.tB);
        System.out.println("Data Atlit telah terdaftar");
    }

    public void terupdate(){
        System.out.println(" " + this.nama);
        System.err.println(" " + this.umur);
        System.out.println(" " + this.tmptLahir);
        System.out.println(" " + this.tglLahir);
        System.out.println(" " + this.kurata);
        System.out.println(" " + this.bB);
        System.out.println(" " + this.tB);
        System.out.println("Data Atlit Telah Terupdate");
    }
}


public class PBO_POSTTEST1_013 {
    
    /// ARRAY LIST MAHASISWA, MENAMPUNG SEMUA ISINYA
    static ArrayList<Athlete> athlete = new ArrayList<Athlete>();
    /// BUFFERED READER (INPUT)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello World!");
        while (true) {
            /// CLEARCREEN AWAL LOOPING       
            /// cls();
            System.out.println(" ");
            System.out.println("Program Indikator Keberhasilan Latihan");
            System.out.println("        Atlit Tarung Derajat          ");
            System.out.println("1. Create Data Mahasiswa");
            System.out.println("2. Read Data Mahasiswa");
            System.out.println("3. Update Data Mahasiswa");
            System.out.println("4. Delete Data Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                createAth();
            } else if (pilihan == 2){
                readAth();
            } else if (pilihan == 3){
                updateAth();
            } else if (pilihan == 4){
                deleteAth();
            } else if (pilihan == 5){
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }  
        
    }
        
    public static void createAth() throws IOException{
        System.out.print("Masukan Nama Atlit: ");
        String addnama = br.readLine();
        System.out.print("Masukan Umur: ");
        int addumur = Integer.parseInt(br.readLine());
        System.out.print("Masukan Kota Lahir: ");
        String addkota = br.readLine();
        System.out.print("Masukan Tanggal Lahir: ");
        String addtgl = br.readLine();
        System.out.print("Masukan Tingkat Kurata: ");
        String addkurata = br.readLine();
        System.out.print("Masukan Berat Badan: ");
        double addberat = Double.parseDouble(br.readLine());
        System.out.print("Masukan Tinggi Badan: ");
        double addtinggi = Double.parseDouble(br.readLine());
        
        Athlete athBaru = 
                new Athlete(addnama, addumur, addkota, 
                            addtgl, addkurata, addberat, addtinggi); 
        
        // add == menambahkan data ke array list
        athlete.add(athBaru);
        //pemanggilan method registrasi
        athBaru.registrasi();
    }
    
    public static void readAth() throws IOException{
        System.out.println(" +++ DATA ATLET +++");
        /// I itu permisalan untuk index karena array list = array
        /// size == ukuran / panjang array list
        for (int i = 0; i < athlete.size(); i++) {
            System.out.println("Athlete ke-" + (i+1));
            //karena index itu 0 maka ditambah 1
            // get == mengambil data dari array list
            System.out.println("Nama Atlit: " + athlete.get(i).getNama());
            System.out.println("Umur: " + athlete.get(i).getUmur());
            System.out.println("TTL: " + athlete.get(i).getTmptLahir());
            System.out.println("Kurata: " + athlete.get(i).getKurata());
            System.out.println("Berat Badan: " + athlete.get(i).getBB());
            System.out.println("Tinggi Badan: " + athlete.get(i).getBB());                    
            System.out.print("\n");
        }
    }
    public static void updateAth() throws IOException{

        readAth();

        System.out.println(" +++ UPDATE DATA ATLET +++");
        System.out.print("Masukan Data Mahasiswa ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nama Atlit: ");
        String setnama = br.readLine();
        System.out.print("Masukan Umur: ");
        int setumur = Integer.parseInt(br.readLine());
        System.out.print("Masukan Kota Lahir: ");
        String setkota = br.readLine();
        System.out.print("Masukan Tanggal Lahir: ");
        String settgl = br.readLine();
        System.out.print("Masukan Tingkat Kurata: ");
        String setkurata = br.readLine();
        System.out.print("Masukan Berat Badan: ");
        double setberat = Double.parseDouble(br.readLine());
        System.out.print("Masukan Tinggi Badan: ");
        double settinggi = Double.parseDouble(br.readLine());

        // memasukan data yang baru ke array list (menggantikannya)
        athlete.get(index-1).setNama(setnama);
        athlete.get(index-1).setUmur(setumur);
        athlete.get(index-1).setTmptLahir(setkota);
        athlete.get(index-1).setTglLahir(settgl);
        athlete.get(index-1).setKurata(setkurata);
        athlete.get(index-1).setBB(setberat);
        athlete.get(index-1).setTB(settinggi);
        

        ///pemanggilan method terupdate
        athlete.get(index-1).terupdate();
    }
    
    public static void deleteAth() throws IOException{
        readAth();
        System.out.println(" +++ DELETE DATA ATLET +++");
        System.out.print("Masukan Data Atlet ke-");
        int index = Integer.parseInt(br.readLine());
        // remove == menghapus data dari array list
        athlete.remove(index-1);
    }
    
    public static void cls() throws IOException, InterruptedException{
        /// FUNGSI CLS
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
