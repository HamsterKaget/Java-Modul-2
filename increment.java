public class increment {
    
    // code by Radja Aulia Al Ramdani X RPL 2
    public static void main(String[] args) {
        
        // Increment
        int coin = 5;
        coin++; // Coin di set menjadi 6
        System.out.println(coin);

        int a = 5;
        int b = 2 * ++a; // b di set menjadi 2 dikali 6 Karna value a sudah di tambah menjadi 6 
        System.out.println(b);
        
        
        // decrement    
        int token = 3;
        token--; // token di set menjadi 2
        System.out.println(token);

        int c = 5;
        int d = --c; // Kedua nya di set sama sama menjadi 4
        System.out.println(c);
        System.out.println(d);
    }
}
