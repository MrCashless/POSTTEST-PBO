package pbo.posttest4_013;

public class LatihanFisik extends Atlit{
    //property
    private int total; //property overloading
    private int pushUp;
    private int sitUp;
    private double secPlank;
    private double minJogging;

    //constructor
    public LatihanFisik(String nama, int umur,  double bB, double tB, int pushUp, int sitUp, double secPlank, double minJogging){
        super(nama, umur, bB, tB);
        this.pushUp = pushUp;
        this.sitUp = sitUp;
        this.secPlank = secPlank;
        this.minJogging = minJogging;
    }

    public int getPushUp() {
        return pushUp;
    }

    public void setPushUp(int pushUp) {
        this.pushUp = pushUp;
    }

    public int getSitUp() {
        return sitUp;
    }

    public void setSitUp(int sitUp) {
        this.sitUp = sitUp;
    }

    public double getSecPlank() {
        return secPlank;
    }

    public void setSecPlank(double secPlank) {
        this.secPlank = secPlank;
    }

    public double getMinJogging() {
        return minJogging;
    }

    public void setMinJogging(double minJogging) {
        this.minJogging = minJogging;
    } 
    
    //overloading
    public void hitung(double secplank){
        System.out.println("Program Latihan Anda");
        System.out.println("Plank: " + this.secPlank);
    }public void hitung(double minJogging, int sitUp){
        System.out.println("Plank: " + this.minJogging);
    }public void hitung(int pushUp, int sitUp){
        total = pushUp + sitUp;
        System.out.println("Push Up: " + this.pushUp);
        System.out.println("Sit Up: " + this.sitUp);
        System.out.println("Total Strenght Workout: " +total+ " Repetisi");
    }
    
    @Override
    public void indikator(){
        System.out.println("Total Lari Perhari Anda = " + this.minJogging);
    }
}