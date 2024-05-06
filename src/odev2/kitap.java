package odev2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kitap {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> ad = new ArrayList<String>();
		List<Byte> sayfas = new ArrayList<Byte>();
		List<Byte> tarih = new ArrayList<Byte>();
		List<Byte> fiyat = new ArrayList<Byte>();
		List<String> yazar = new ArrayList<String>();
		List<String> tur = new ArrayList<String>();
		byte menu;
		for(;;) {
			kitapfonks.Menu();
			menu = giris.nextByte();
			switch(menu) {
			case 1:
				kitapfonks.veriGiris(ad, sayfas, tarih, fiyat, yazar, tur);
			break;
			case 2:
				kitapfonks.Listeleme(ad, sayfas, tarih, fiyat, yazar, tur);
			break;
			case 3:
				System.out.println("Sayfa sayısı ortalaması: "+kitapfonks.Ortalama(sayfas));
				System.out.println("Çıkış tarihi ortalaması: "+kitapfonks.Ortalama(tarih));
				System.out.println("Fiyatlar ortalaması: "+kitapfonks.Ortalama(fiyat));
			break;
			case 4:
				System.out.println("En küçük sayfa sayısı: "+kitapfonks.enk(sayfas));
				System.out.println("En küçük çıkış tarihi: "+kitapfonks.enk(tarih));
				System.out.println("En küçük fiyat: "+kitapfonks.enk(fiyat));
			break;
			case 5:
				System.out.println("En büyük sayfa sayısı: "+kitapfonks.enb(sayfas));
				System.out.println("En büyük sayfa sayısı: "+kitapfonks.enb(tarih));
				System.out.println("En büyük sayfa sayısı: "+kitapfonks.enb(fiyat));
			break;
			case 6:
				System.out.println("Aranacak adı giriniz: ");
				String arananAd = giris.next();
				kitapfonks.arananAd(ad, sayfas, tarih, fiyat, yazar, tur, arananAd);
				break;
			case 7:
				System.out.println("Silinicek adı giriniz: ");
				String silinenAd = giris.next();
				kitapfonks.silAd(ad, sayfas, tarih, fiyat, yazar, tur, silinenAd);
				break;
			case 8:
				System.out.println("Düzeltilicek adı giriniz: ");
				String duzeltAd = giris.next();
				kitapfonks.duzelt(ad, sayfas, tarih, fiyat, yazar, tur, duzeltAd);
				break;
			case 9:
				System.out.println("Çıkış yapılıyor...");
				System.exit(0);
				break;
				default:
					System.out.println("Yanlış İşlem Seçimi!");
				}
		}

	}

}
