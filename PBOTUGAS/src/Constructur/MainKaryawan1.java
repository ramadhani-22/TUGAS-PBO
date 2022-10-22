package Constructur;


public class MainKaryawan1 {
    public static void main(String args[]) {
        
        Penggajian1 gaji1 = new Penggajian1(111, 5000000);
        Penggajian1 gaji2 = new Penggajian1("Ahmad Ramadhani", "Manager");
        gaji1.cetakdata1();
        gaji2.cetakdata2();
    }
}