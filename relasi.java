public class relasi {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        // Deklarasi Variabel / Input Data
        int umur1 = 17; // Data Pertama

        int minimalumur = 18;

        System.out.println("Umur Data 1 = " + umur1 + " Tahun");
        System.out.println("Data 1 Cukup Umur : " + (umur1 >= minimalumur));

        // If Statement 
        if ( umur1 >= minimalumur) {
            System.out.println("Kamu berhasil registrasi !");
        }
        else { System.out.println("Kamu Belum Cukup Umur");}
    }
}
