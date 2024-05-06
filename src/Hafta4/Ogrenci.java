package Hafta4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci {

	

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> isim=new ArrayList<String>();
		List<Byte> vNot=new ArrayList<Byte>();
		List<Byte> fNot=new ArrayList<Byte>();
		List<Byte> bNot=new ArrayList<Byte>();
		byte menu;
		for(;;) {
			Fonksiyonlar.Menu();
			menu=giris.nextByte();
			switch(menu) {
			case 1:
				Fonksiyonlar.veriGiris(isim,vNot,fNot,bNot);
				break;
			case 2:
				Fonksiyonlar.Listele(isim, vNot, fNot, bNot); 
				break;
			case 3:
				System.out.println("Vize Not Ortalaması : " + Fonksiyonlar.Ortalama(vNot));
				System.out.println("Final Not Ortalaması : " + Fonksiyonlar.Ortalama(vNot));
				System.out.println("Başarı Not Ortalaması : " + Fonksiyonlar.Ortalama(vNot));
				break;
			case 4:
				System.out.println("Vize Not En Büyüğü : " + Fonksiyonlar.EnBuyuk(vNot));
				System.out.println("Final Not En Büyüğü : " + Fonksiyonlar.EnBuyuk(vNot));
				System.out.println("Başarı Not En Büyüğü : " + Fonksiyonlar.EnBuyuk(vNot));
				break;
			case 5:
				System.out.println("Vize Not En Küçüğü : " + Fonksiyonlar.EnKucuk(vNot));
				System.out.println("Vize Not En Küçüğü : " + Fonksiyonlar.EnKucuk(vNot));
				System.out.println("Vize Not En Küçüğü : " + Fonksiyonlar.EnKucuk(vNot));
				break;
			case 6:
				System.out.println("Aranacak ad giriniz");
				String arananAd=giris.next();
				Fonksiyonlar.IsimArama(isim, vNot, fNot, bNot, arananAd);
			case 7:
				System.out.println("Silinecek ad giriniz");
				String silinenAd=giris.next();
				Fonksiyonlar.IsimSilme(isim, vNot, fNot, bNot, silinenAd);
			case 8:
				System.out.println("Düzeltilicek  ad giriniz");
				String duzeltilenAd=giris.next();
				Fonksiyonlar.IsimDuzeltme(isim, vNot, fNot, bNot, duzeltilenAd);
			case 9:
				System.out.println("Program bitti");
				System.exit(0);
				break;
				default:
					System.out.println("Yanlış menü değeri");
			}
			}
	}

}
