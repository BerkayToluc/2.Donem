package Hafta11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		ArrayList<Kisi> kisiListesi=new ArrayList<Kisi>();
		ArrayList<Ogrenci> ogrenciListesi=new ArrayList<Ogrenci>();
		byte menu;
		while(true) {
			System.out.println("0-Çıkış");
			System.out.println("1-Kişi Kayıt Ekle");
			System.out.println("2-Ögrenci kayıt ekle");
			System.out.println("3-Kişi Listele");
			System.out.println("4-Öğrenci Listele");
			System.out.println("5-Kişi ara");
			System.out.println("6-Öğrenci ara");
			System.out.print("Seçiminiz : ");
			menu=giris.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
            case 1:Fonksiyonu.KisiKayıtEkle(giris,kisiListesi,ogrenciListesi);		
				break;
            case 2:Fonksiyonu.OgrenciKayıtEkle(giris,kisiListesi,ogrenciListesi);
	            break;
            case 3:Fonksiyonu.KisiListele(kisiListesi);
	            break;
            case 4:Fonksiyonu.OgrenciListele(ogrenciListesi);
	            break;
            case 5:Fonksiyonu.KisiAra(giris,kisiListesi);
	            break;
            case 6:Fonksiyonu.OgrenciAra(giris,ogrenciListesi);
            break;
            case 7:
            	Fonksiyonu.Enb(ogrenciListesi);
            	break;
			default:System.out.println("Yanlış menü değeri");
				break;
			}
			
		}
	}

}
