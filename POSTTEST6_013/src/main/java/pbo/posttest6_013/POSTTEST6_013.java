/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.posttest6_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

interface Level2{
    void create() throws IOException;
    void read() throws IOException;
    void update() throws IOException;
    void delete() throws IOException;    
}

abstract class User{
    String username;
    String password;
}

class Admin extends User implements Level2{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
     public void create() throws IOException{
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
                        addtglLahir, addalamatKota, addjenisKelamin, addstatusKerja, null);

                
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
                                                        addpushUp, addsitUp, addsecPlank, addminJogging, null);
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
        
    }
    
    @Override
     public void read() throws IOException{
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
                    System.out.println("Atlit ke " + (i+1));
                    System.out.println("\nNama Atlit      : " + Biodata.get(i).getNama());
                    System.out.println("Umur Atlit        : " + Biodata.get(i).getUmur());
                    System.out.println("Berat Badan       : " + Biodata.get(i).getbB());
                    System.out.println("Tinggi Badan      : " + Biodata.get(i).gettB());
                    System.out.println("Tanggal Lahir     : " + Biodata.get(i).getTglLahir());
                    System.out.println("Kota Asal         : " + Biodata.get(i).getAlamatKota());
                    System.out.println("Jenis Kelamin     : " + Biodata.get(i).getJenisKelamin());
                    System.out.println("Status Pekerjaan  : " + Biodata.get(i).getStatusKerja());
                    System.out.println("\n");
                }
                break; 
            }
            case 2 -> {
                System.out.println("Program Latihan Fisik");
                for(int i = 0; i < LatihanFisik.size(); i++){
                    System.out.println("Atlit ke " + (i+1));
                    System.out.println("\nNama Atlit      : " + LatihanFisik.get(i).getNama());
                    System.out.println("Umur Atlit        : " + LatihanFisik.get(i).getUmur());
                    System.out.println("Berat Badan       : " + LatihanFisik.get(i).getbB());
                    System.out.println("Tinggi Badan      : " + LatihanFisik.get(i).gettB());
                    System.out.println("Total Push Up     : " + LatihanFisik.get(i).getPushUp());
                    System.out.println("Total Sit Up      : " + LatihanFisik.get(i).getSitUp());
                    System.out.println("Total Plank       : " + LatihanFisik.get(i).getSecPlank() + " Detik");
                    System.out.println("Total Jogging     : " + LatihanFisik.get(i).getMinJogging() + " Menit");
                    System.out.println("\n");
                }
                break; 
            } 
        } 
    }
    
    @Override
     public void update() throws IOException{
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
    }
    
    @Override
         public void delete() throws IOException{
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
     
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Atlit> Atlit = new ArrayList<> ();
    static ArrayList<Biodata> Biodata = new ArrayList<> ();
    static ArrayList<LatihanFisik> LatihanFisik = new ArrayList<> ();
}



public class POSTTEST6_013 {
    //static InputStreamReader isr = new InputStreamReader(System.in);
    

    
    static Admin bram = new Admin();


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
        int pilihan = Integer.parseInt(bram.br.readLine());
        System.out.println("======================================");
    
        switch (pilihan){
            case 1 -> bram.create();
            case 2 -> bram.read();
            case 3 -> bram.update();
            case 4 -> bram.delete();
            case 5 -> System.exit(0);
            default -> System.out.println(" Pilihan Tidak Tersedia!!!");
        }
            
    }
       
    public static void main(String args[]) throws IOException{
        while(true){
             option();
        }
    }
            
}
       

