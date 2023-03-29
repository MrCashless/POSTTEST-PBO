package pbo.posttest4_013;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class POSTTEST4_013 {
    //static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Atlit> Atlit = new ArrayList<> ();
    static ArrayList<Biodata> Biodata = new ArrayList<> ();
    static ArrayList<LatihanFisik> LatihanFisik = new ArrayList<> ();


    static void option() throws IOException {
        System.out.println("======================================");
        System.out.println("Program Indikator Keberhasilan Latihan");
        System.out.println("          Atlit Tarung Derajat        ");
        System.out.println("======================================");
        System.out.println("1. Create Data Atlit");
        System.out.println("2. Read Data Atlit");
        System.out.println("3. Update Data Atlit");
        System.out.println("4. Delete Data Atlit");
        System.out.println("5. Exit");
        System.out.print("Masukkan Pilihan Yang Ingin Anda Lakukan: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");
    
        switch (pilihan){
            case 1 -> create();
            case 2 -> read();
            case 3 -> update();
            case 4 -> delete();
            case 5 -> System.exit(0);
            default -> System.out.println(" Pilihan Tidak Tersedia!!!");
        }
            
    }
        
    static void create() throws IOException{
        System.out.println("======================================");
        System.out.println("=========    Create Menu   ===========");
        System.out.println("1. Data Atlit");
        System.out.println("2. Data Program Latihan");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");
        switch (pilihan) {
            case 1 -> {
                System.out.println("Biodata Atlit");
                System.out.print("\nMasukkan Nama Atlit: ");
                String addnama = br.readLine();
                System.out.print("Masukkan Umur: ");
                int addumur = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Berat Badan: ");
                double addberat = Double.parseDouble(br.readLine());
                System.out.print("Masukkan Tinggi Badan: ");
                double addtinggi = Double.parseDouble(br.readLine());
                System.out.print("Masukkan Tanggal Lahir[DD/MM/YY]: ");
                String addtglLahir = br.readLine();
                System.out.print("Masukkan Kota Asal: ");
                String addalamatKota = br.readLine();
                System.out.print("Masukkan Jenis Kelamin: ");
                String addjenisKelamin = br.readLine();
                System.out.print("Masukkan Status Pekerjaan: ");
                String addstatusKerja = br.readLine();
                
                Biodata biodat = new Biodata(addnama, addumur, addberat, addtinggi,
                        addtglLahir, addalamatKota, addjenisKelamin, addstatusKerja);
                
                Biodata.add(biodat);
                                
                System.out.println("======================================");
                System.out.println(" Data Atlit Berhasil DiBuat");
                System.out.println("======================================");
                break;
            }
            
            case 2 -> {
                System.out.println("Program Latihan Fisik");
                System.out.print("\nMasukkan Nama Atlit: ");
                String addnama = br.readLine();
                System.out.print("Masukkan Umur: ");
                int addumur = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Berat Badan: ");
                double addberat = Double.parseDouble(br.readLine());
                System.out.print("Masukkan Tinggi Badan: ");
                double addtinggi = Double.parseDouble(br.readLine());
                System.out.print("Masukkan Jumlah Push Up: ");
                int addpushUp = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Junlah Sit Up: ");
                int addsitUp = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Total Detik Plank: ");
                double addsecPlank = Double.parseDouble(br.readLine());
                System.out.print("Masukkan Total Menit Jogging: ");
                double addminJogging = Double.parseDouble(br.readLine());
                
                LatihanFisik latfis = new LatihanFisik(addnama, addumur, addberat, addtinggi,
                                                        addpushUp, addsitUp, addsecPlank, addminJogging);
                LatihanFisik.add(latfis);
                
                System.out.println("======================================");
                System.out.println(" Data Atlit Berhasil DiBuat");
                System.out.println("======================================");
                //overloading
                latfis.hitung(addsecPlank);
                latfis.hitung(addminJogging, addsitUp);
                latfis.hitung(addpushUp, addsitUp);
                
                //overriding
                latfis.indikator();
                break;
            }
            
        }
        
    }static void read() throws IOException{
        System.out.println("======================================");
        System.out.println("============   Read Menu   ===========");
        System.out.println("1. Biodata Atlit");
        System.out.println("2. Program Latih Fisik");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.println("Biodata Atlit");
                for(int i = 0; i < Biodata.size(); i++){
                    System.out.print("Atlit ke " + (i+1));
                    System.out.print("\nNama Atlit      : " + Biodata.get(i).getNama());
                    System.out.print("Umur Atlit        : " + Biodata.get(i).getUmur());
                    System.out.print("Berat Badan       : " + Biodata.get(i).getbB());
                    System.out.print("Tinggi Badan      : " + Biodata.get(i).gettB());
                    System.out.print("Tanggal Lahir     : " + Biodata.get(i).getTglLahir());
                    System.out.print("Kota Asal         : " + Biodata.get(i).getAlamatKota());
                    System.out.print("Jenis Kelamin     : " + Biodata.get(i).getJenisKelamin());
                    System.out.print("Status Pekerjaan  : " + Biodata.get(i).getStatusKerja());
                    System.out.print("\n");
                }
                break; 
            }
            case 2 -> {
                System.out.println("Program Latihan Fisik");
                for(int i = 0; i < LatihanFisik.size(); i++){
                    System.out.print("Atlit ke " + (i+1));
                    System.out.print("\nNama Atlit      : " + LatihanFisik.get(i).getNama());
                    System.out.print("Umur Atlit        : " + LatihanFisik.get(i).getUmur());
                    System.out.print("Berat Badan       : " + LatihanFisik.get(i).getbB());
                    System.out.print("Tinggi Badan      : " + LatihanFisik.get(i).gettB());
                    System.out.print("Total Push Up     : " + LatihanFisik.get(i).getPushUp());
                    System.out.print("Total Sit Up      : " + LatihanFisik.get(i).getSitUp());
                    System.out.print("Total Plank       : " + LatihanFisik.get(i).getSecPlank() + " Detik");
                    System.out.print("Total Jogging     : " + LatihanFisik.get(i).getMinJogging() + " Menit");
                    System.out.print("\n");
                }
                break; 
            } 
        } 
    }static void update() throws IOException{
        read();
        System.out.println("======================================");
        System.out.println("===========   Update Menu   ==========");
        System.out.println("1. Biodata Atlit");
        System.out.println("2. Program Latih Fisik");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.println("Biodata Atlit");
                System.out.println("Masukkan Data Atlit Ke: ");
                int indexBD = Integer.parseInt(br.readLine());
                indexBD--;   
                
                if(indexBD <= Biodata.size() || indexBD > 0){
                    System.out.print("\nMasukkan Nama Atlit: ");
                    Biodata.get(indexBD).setNama(br.readLine());
                    System.out.print("Masukkan Umur: ");
                    Biodata.get(indexBD).setUmur(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Berat Badan: ");
                    Biodata.get(indexBD).setbB(Double.parseDouble(br.readLine()));
                    System.out.print("Masukkan Tinggi Badan: ");
                    Biodata.get(indexBD).settB(Double.parseDouble(br.readLine()));
                    System.out.print("Masukkan Tanggal Lahir[DD/MM/YY]: ");
                    Biodata.get(indexBD).setTglLahir(br.readLine());
                    System.out.print("Masukkan Kota Asal: ");
                    Biodata.get(indexBD).setAlamatKota(br.readLine());
                    System.out.print("Masukkan Jenis Kelamin: ");
                    Biodata.get(indexBD).setJenisKelamin(br.readLine());
                    System.out.print("Masukkan Status Pekerjaan: ");
                    Biodata.get(indexBD).setStatusKerja(br.readLine());
                System.out.println("======================================");
                System.out.println(" Data Atlit Berhasil DiUbah");
                System.out.println("======================================"); 
                }else{
                    System.out.println("Data Tidak ada");
                }
            }
            case 2 -> {
                System.out.println("Program Latihan Fisik");
                System.out.println("Masukkan Data Atlit Ke: ");
                int indexLTF = Integer.parseInt(br.readLine());
                indexLTF--;   
                
                if(indexLTF <= LatihanFisik.size() || indexLTF > 0){
                    System.out.print("\nMasukkan Nama Atlit: ");
                    LatihanFisik.get(indexLTF).setNama(br.readLine());
                    System.out.print("Masukkan Umur: ");
                    LatihanFisik.get(indexLTF).setUmur(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Berat Badan: ");
                    LatihanFisik.get(indexLTF).setbB(Double.parseDouble(br.readLine()));
                    System.out.print("Masukkan Tinggi Badan: ");
                    LatihanFisik.get(indexLTF).settB(Double.parseDouble(br.readLine()));
                    System.out.print("Masukkan Jumlah Push Up: ");
                    LatihanFisik.get(indexLTF).setPushUp(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Jumlah Sit Up: ");
                    LatihanFisik.get(indexLTF).setSitUp(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Total Detik Plank: ");
                    LatihanFisik.get(indexLTF).setSecPlank(Double.parseDouble(br.readLine()));
                    System.out.print("Masukkan Total Menit Jogging: ");
                    LatihanFisik.get(indexLTF).setMinJogging(Double.parseDouble(br.readLine()));
                System.out.println("======================================");
                System.out.println(" Data Atlit Berhasil DiUbah");
                System.out.println("======================================"); 
                }else{
                    System.out.println("Data Tidak ada");
                }
            }
        }
    }static void delete() throws IOException{
        System.out.println("======================================");
        System.out.println("===========   Delete Menu   ==========");
        System.out.println("1. Biodata Atlit");
        System.out.println("2. Program Latih Fisik");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.print("Input nomor data yang ingin dihapus » ");
                int indexDel = Integer.parseInt(br.readLine());
                Biodata.remove(indexDel-1);
                System.out.println("Data berhasil dihapus!");               
                break;
            }
            case 2 -> {
                System.out.print("Input nomor data yang ingin dihapus » ");
                int indexDel1 = Integer.parseInt(br.readLine());
                LatihanFisik.remove(indexDel1-1);
                System.out.println("Data berhasil dihapus!"); 
                break;
            }
        }
    }

    public static void main(String args[]) throws IOException{
        while(true){
             option();
        }
    }
            
}
       
