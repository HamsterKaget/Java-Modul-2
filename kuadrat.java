// Import Class yang dibutuhkan
import static java.lang.Math.sqrt; 
import static java.lang.Math.pow;
import java.util.Scanner;


public class kuadrat {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in); // Membuat Scanner Object
        
        System.out.println("Variabel a"); 
        double a = myobj.nextDouble(); // input variabel pertama

        System.out.println("Variabel b"); 
        double b = myobj.nextDouble(); // input variabel kedua 

        System.out.println("Variabel c"); 
        double c = myobj.nextDouble(); // input variabel ketiga

        // rumus abc 
        double x1 = ( -b + sqrt((pow(b, 2)-4*a*c)))/(2*a);
        double x2 = ( -b - sqrt((pow(b, 2)-4*a*c)))/(2*a);

        // print output
        System.out.println(x1);
        System.out.println(x2);
    }
}
