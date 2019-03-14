import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class SequentialSearch {
	public static void main (String[] args) throws IOException {
			
			System.out.println("\t====Sequential Search====");
			
			//objek BufferedReader
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader dataIn = new BufferedReader (isr);
			
			//input  jumlah data
			System.out.print("\nMasukan jumlah Data : ");
			int jumlah = Integer.parseInt(dataIn.readLine());
			
			//penampungan data
			int[] data = new int [jumlah];
			
			//data disi oleh program
			for (int a=0; a<jumlah; a++) {
				data[a] = a+1;
				System.out.print(data[a] + "	");
				}
			
			
			//data yang dicari
			System.out.print("\n\nData yang dicari : ");
			int cari = Integer.parseInt(dataIn.readLine());
			
			//proses Sequential Search
			long startTime = System.currentTimeMillis();
			boolean temu = false;
			int urutan = 0;
			
			//mengetahui urutan nilai yang dicari
			System.out.print("\nNilai yang dicari : " + cari);
			for (int a=0; a<jumlah; a++) {
				if (data[a] == cari) {
					System.out.print("\nNilai " + cari + " ditemukan pada index ke- ");
					urutan = a+1;
					System.out.print(urutan);
					temu = true;
				}
			}
			
			//data tidak ditemukan
			if (temu != true) {
				System.out.print("\nNilai " + cari + " tidak ditemukan");
			}
			
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("\n\nUkuran waktu " + elapsedTime + " mili detik");
	}
}