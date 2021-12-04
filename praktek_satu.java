public class praktek_satu {

    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        String nama="Budi Santoso";
        double kalkulus=80;
        double pti=90;
        double daspro=80;
        double nilai_rata=(kalkulus+pti+daspro)/3;
        int nilai_rata2=(int) ((kalkulus+pti+daspro) / 3);
        System.out.println("Nilai Double Rata Rata "+nama+" Adalah "+nilai_rata);
        System.out.println("Nilai Integer Rata Rata "+nama+" Adalah "+nilai_rata2);
        //Konfersi Integer Ke String
        String a=String.valueOf(nilai_rata2);
        String hasil="Nilai Rata Rata "+nama+" Adalah "+a;
        System.out.println("Hasil Konfersi String Ke Integer "+hasil);
        //Konfersi String Ke Double
        double b=Double.parseDouble(a);
        System.out.println("Hasil Konfersi String Ke Double "+b);
        //Konfersi String Ke Integer
        int c=Integer.parseInt(a);
        System.out.println("Hasil Konfersi String Ke Integer "+c);
        // Casting Integer Ke Double
        double d=(double)c;
        System.out.println("Hasil Casting Integer Ke Double "+d);
        int e=(int)d;
        System.out.println("Hasil Casting Double Ke Integer "+e);
    }
}