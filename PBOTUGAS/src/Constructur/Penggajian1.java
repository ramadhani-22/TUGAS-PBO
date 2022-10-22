package Constructur;

public class Penggajian1 {
    int nik, gajipokok;
    String nama, jabatan;

    public Penggajian1(int nik, int gajipokok){
        this.nik = nik;
        this.gajipokok = gajipokok;
    }
    
    public Penggajian1(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }
    

//    double getGajiPokok(){
//        if(jabatan == "Manager"){
//            gajipokok = 5000000;
//        }
//        else if(jabatan == "Admin"){
//            gajipokok = 4500000;
//        }
//        else{
//            gajipokok = 4000000;
//        }
//        
//        return gajipokok;
//    }
    
    public void cetakdata1(){        
        System.out.println("Nomer Karyawan : "+ this.nik);
        System.out.println("Gaji Pokok : "+ this.gajipokok);
    }
    public void cetakdata2(){
        System.out.println("Nama : "+ this.nama);
        System.out.println("Jabatan : "+ this.jabatan);
    }
}
