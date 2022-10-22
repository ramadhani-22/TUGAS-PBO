package nonConstructur;

import java.util.Scanner;

public class MainKaryawan2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Penggajian2 gaji = new Penggajian2();
        
        System.out.printf("Nomer Karyawan : ");
        gaji.nik = sc.nextInt();
        
        System.out.printf("Nama : ");
        gaji.nama = sc.nextLine();
        
        System.out.printf("Bagian : ");
        gaji.bagian = sc.nextLine();
        
        gaji.cetak();
    }
}
