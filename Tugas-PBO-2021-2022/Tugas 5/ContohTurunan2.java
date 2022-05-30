import java.util.Scanner;

class Persegi{
	public int panjang;
	public int lebar;
	
	public Persegi() {}
	
	// persegi (sama sisi)
	public Persegi (int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
	}
	
	//persegi panjang (tidak sama sisi)
	public Persegi (int panjanh, int lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	protected int luas(){
		return this.panjang * this.lebar;
	}
}

class Kotak extends Persegi{
	public int tinggi;
	
	// kubus (sama sisi)
	public Kotak(int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
		this.tinggi = sisi;
	}
	
	public Kotak(int panjang, int lebar, int tinggi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	public int volume() {
		return this.luas() * tinggi;
	}
}

class ContoTurunan2 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int jenis_bidang = 0;
		
	while(true) {
		System.out.println("1. persegi (Datar)\n2. (Ruang)\npilih jenis bidang: ");
		int input = scanner.nextInt();
		
		if(input == 1 || input == 2){
			jenis_bidang = input;
			break;
		}
	}
		
		boolean is_sama_sisi = false;
		
		while(true){
			System.out.println("1. Ya \n2. Tidak\nApakah sama sisi?");
			int  input = scanner.nextInt();
			
			if (input == 1 || input == 2){
				if (input == 1);
				is_sama_sisi = true;
				
				break;
			}
		}
		
		Persegi persegi;
		Kotak kotak;
		
		if(jenis_bidang == 1 && is_sama_sisi) {
			// hitung luas persegi (sama sisi)
			System.out.println("Masukan sisi: ");
			int sisi = scanner.nextInt();
			
			persegi = new Persegi (sisi);
			System.out.println("Luas persegi adalah " + persegi.luas());
		}
		else if(jenis_bidang == 1) {
			// hitung luas persegi panjang (tidak sama sisi)
			System.out.print("Masukan panjang: ");
			int panjang = scanner.nextInt();
			System.out.print("Masukan lebar: ");
			int lebar = scanner.nextInt();
			
			persegi = new Persegi (panjang, lebar);
			System.out.println("Luas persegi panjang adalah " + persegi.luas());
		}
		else if (jenis_bidang == 2 && is_sama_sisi){
			// hitung luas kubus (sama sisi)
			System.out.println ("Masukan panjang: ");
			int panjang = scanner.nextInt();
			System.out.print("Masukan lebar: ");
			int lebar = scanner.nextInt();
			System.out.print("Masukan tinggi: ");
			int tinggi = scanner.nextInt();
			
			kotak = new Kotak (panjang, lebar, tinggi);
			System.out.println("volume balok adalah " + kotak.volume());
		}
	}
	
}
