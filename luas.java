import javax.sound.sampled.SourceDataLine;

public class luas {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        // Luas Persegi Panjang 
        int panjang = 20;
        int lebar = 30;

        int luaspersegipanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang Nya adalah = " + luaspersegipanjang);

        // Luas Segitiga 
        int alas = 20;
        int tinggi = 10;

        int luassegitiga = alas * tinggi / 2;
        System.out.println("Luas Segitiga adalah = " + luassegitiga );

        // luas lingkaran 
        double phi = 3.14;
        double jari = 10;

        double luaslingkaran = phi * jari * jari;
        System.out.println("Luas Lingkaran adalah = " + luaslingkaran);

    }
}
