import java.util.Scanner;

class persegi{
     public int panjang;
     public int lebar;
     
     public int luas() {
         return this.panjang * this.lebar;
         
    }
      
class Kotak extends persegi {
     public int tinggi;
     
     public int voume() {
          return this.luas()*tinggi;
          
      }
      
}
}

class ContohTurunan{
     public static void main(String [] args) {
         Scanner scanner = new Scanner(System.in);
         
         Kotak kotak = new Kotak();
         System.out.println("masukan panjang: ");
         kotak.panjang = scanner.nextInt();
         System.out.print("masukan lebar: ");
         kotak.lebar = scanner.nextInt ();
         System.out.println("masukan tinggi: ");
         kotak.tinggi = scanner.nextInt();
         System.out.println("volume kotak adalah " + kotak.volume());
         
     }
     
}
