public class praktek_dua {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        // Variabel / input
        int a=10; 
        int b= 12; 
        int c=9; 
        int e=2; 
        int f=9; 
        int n=90;

        //Proses Operator Aritmatika
        int tambah = a + b; // Pertambahan
        int kurang = a - b; // Pengurangan
        int bagi = a / b; // Pembagian
        int kali = a * b; // Perkalian
        int modulo = a % e; // Modulo atau Sisa Bagi

        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(bagi);
        System.out.println(kali);
        System.out.println(modulo);

        //Proses Operator Relasi

        boolean cek = b > c; 
        boolean cek2 = b >= c;
        boolean cek3 = b < c;
        boolean cek4 = b <= c;
        boolean cek5 = b == c;
        boolean cek6 = b != c;

        System.out.println(cek);
        System.out.println(cek2);
        System.out.println(cek3);
        System.out.println(cek4);
        System.out.println(cek5);
        System.out.println(cek6);

        //Proses Operator Increment Decrement

        int jumlah = ++a;
        int jumlah2 = a++;
        int jumlah3 = --a;
        int jumlah4 = a--;
        int jumlah5 = a;

        System.out.println(jumlah);
        System.out.println(jumlah2);
        System.out.println(jumlah3);
        System.out.println(jumlah4);
        System.out.println(jumlah5);

        //Proses Operator Logika

        boolean test = (a>b)||(c==f);
        boolean test2 = (a==b)&(b==++f);
        boolean test3 = (b>a)^(f==--a);

        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

        //Proses Operator Kondisi

        String lulus = (n>=60)?"lulus":"ngulang";
        System.out.println(lulus);

    }
}
