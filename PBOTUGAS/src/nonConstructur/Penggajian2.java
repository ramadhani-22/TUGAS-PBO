package nonConstructur;

import java.text.DecimalFormat;

public class Penggajian2 {
    int nik;
    String nama, bagian;
    double gajipokok;
    
    public int nomorKaryawan(int nik){
        return nik;
    }
    
    public String Nama(String nama){
        return nama;
    }
    
    public String Bagian(String bagian){
        return bagian;
    }
    
    public double GajiPokok(double gajipokok){
        return gajipokok;
    }
    
    double getGajiPokok(){
        if(null == bagian){
            gajipokok = 4000000;
        }
        else gajipokok = switch (bagian) {
            case "Keuangan" -> 5000000;
            case "Produksi" -> 4500000;
            default -> 4000000;
        };
        
        return gajipokok;
    }
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
//        System.out.println("----------Detil Karyawan----------");
        System.out.println("Nomer Karyawan : "+ this.nomorKaryawan(nik));
        System.out.println("Nama : "+ this.Nama(nama));
        System.out.println("Bagian : "+ this.Bagian(bagian));
        System.out.println("Gaji Pokok : "+ df.format(getGajiPokok()));
    }
}