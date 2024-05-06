package Hafta11;

import java.util.ArrayList;
import java.util.Scanner;

public class Calısanİslem {

	public static void main(String[] args) {
		ArrayList<Kisi> kisiListesi=new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		byte menu;
		while (true) {
			System.out.println("0-Çıkış");
			System.out.println("1-Kayıt Girişi");
			System.out.println("2-Listelme\n3-arama\n4-Net Maas Hesaplama\n5-Kişi görüntüleme");
			menu=scanner.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
            case 1:
            	Fonksiyonu.CalısannEkle(scanner,kisiListesi);
				
				break;
            case 2:
            	Fonksiyonu.CalısannListele(kisiListesi);
	
	            break;
            case 3:
            	Fonksiyonu.CalısannAra(scanner,kisiListesi);
	            break;
            case 4:Fonksiyonu.Maas(kisiListesi);
				
				break;
            case 5:Fonksiyonu.Kisi1Listele(kisiListesi);
			
			break;

			default:System.out.println("Yanlış menü değeri");
				break;
			}
			
			
			
			
			
			
			
			
			
			
		}

	}

}
