import java.util.Scanner; // Import Scanner Class Untuk Input 

public class logika {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Membuat Scanner Object
    System.out.println("Untuk Membeli Buku , Harap Lengkapi Data Terlebih Dahulu !");
    System.out.println("Masukan Umur Kamu");
    
    int umur = myObj.nextInt(); // Membaca Input Umur
    System.out.println("Umur Kamu = " + umur);
        
    System.out.println("Masukan Jumlah Uang Kamu");
    int uang = myObj.nextInt(); // Membaca Input Uang
    System.out.println("Uang Kamu = Rp." + uang + " Ribu");

    int HargaBuku = 25; // Harga Dari Suatu Buku Adalah 25 Ribu

    // Operasi Logika 
    boolean test = umur >= 18 && uang >= HargaBuku;
    System.out.println(test);

    // If Statement
    if ( umur < 18 ) {
        System.out.println("Kamu Belum cukup umur");
    } else if ( uang < HargaBuku ) {
        System.out.println("Uang Kamu Belum Cukup");
    } else if ( test = true ) {
        System.out.println("Kamu Berhasil Membeli Buku");
    }
}
}
