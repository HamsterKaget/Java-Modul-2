import java.util.Scanner; // Import Scanner Class Untuk Input 

public class kondisi {
    
        // code by Radja Aulia Al Ramdani X RPL 2
        public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);  // Membuat Scanner Object
        
        System.out.println("Masukan Nama Siswa"); // input nama siswa dalam String
        String nama = myObj.nextLine();

        System.out.println("Masukan Nilai Total Siswa"); // input nilai siswa dalam int
        int nilai = myObj.nextInt();

        // jika nilai diatas 70 maka output lulus , jika tidak output tidak lulus
        String hasil = nilai > 70?"Lulus":"Tidak Lulus"; 
        System.out.println(nama + " Dinyatakan " + hasil );
    }
}
