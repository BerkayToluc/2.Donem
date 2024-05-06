package hafta9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import odev2.kitap;

public class kutuphane {
	static Scanner giris = new Scanner(System.in);
	static List<kıtap> kitapListesi = new ArrayList<kıtap>();

	private static void KitapEkle() {
		System.out.println("Kitap adı : ");
		String kAdi = giris.next();
		System.out.println("Yazar adı : ");
		String yAdi = giris.next();
		System.out.println("Yayın evi adı : ");
		String yyAdi = giris.next();
		System.out.println("Sayfa sayısı : ");
		int ss = giris.nextInt();
		System.out.println("Fiyatı : ");
		int fi = giris.nextInt();
		kıtap eklenecekkitap = new kıtap(kAdi, yAdi, ss, fi, yyAdi);
		kitapListesi.add(eklenecekkitap);
	}

public static void Listele() {
	if(kitapListesi.isEmpty());{
	System.out.println("Kütüphanede hiç kitap yok");
}  else {
	System.out.println("Kütüphanedeki kitaplar\n----------------------------");
	for(kıtap kitap : kitapListesi) {
		System.out.println(kitap.toString());
	}
}
}

	private static void KitapArama(String arananKitap) {
		boolean bulundu = false;
		for (kıtap kitap : kitapListesi) {
			if (kitap.getKitapAdi().equalsIgnoreCase(arananKitap)) {
				System.out.println("Bulunan kitap: " + kitap.toString());
				bulundu = true;
			}
		}
	}

	private static void Duzenle() {
		System.out.println("Düzenlenecek Kitap Adı giriniz: ");
		String duzenlenecekKitap = giris.next();
		boolean duzenlenen = false;
		for (kıtap kitap : kitapListesi) {
			if (kitap.getKitapAdi().equalsIgnoreCase(duzenlenecekKitap)) {
				System.out.println("Kitap bilgileri: " + kitap);
				System.out.println("Yeni kitap adı");
				String ykAdi = giris.next();
				if (ykAdi.isEmpty())
					ykAdi = kitap.getKitapAdi();
				System.out.println("Yeni yazar adı");
				String yyAdi = giris.next();
				if (ykAdi.isEmpty())
					ykAdi = kitap.getKitapAdi();
				System.out.println("Yeni yayın evi adı");
				String yyeAdi = giris.next();
				if (ykAdi.isEmpty())
					ykAdi = kitap.getKitapAdi();
				System.out.println("Yeni sayfa sayısı: ");
				String yssString = giris.next();
				int yss = kitap.getSayfaSayisi();
				if (!yssString.isEmpty())
					yss = Integer.parseInt(yssString);
				System.out.println("Yeni fiyat: ");
				String yfString = giris.next();
				int yfi = kitap.getFiyat();
				if (!yfString.isEmpty())
					yfi = Integer.parseInt(yfString);
				kitap.setFiyat(yfi);
				duzenlenen = true;
			}
		}

		if (!duzenlenen)
			System.out.println("Düzenlenicek kitap bulunamaadı");
	}

	private static void Silme() {
		System.out.println("Silinecek kitap adı giriniz: ");
		String silinecekkitap = giris.next();
		boolean silinecek = false;
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(silinecekkitap)) {
				System.out.println(i + "" + kitapListesi.get(i).toString());
				silinecek = true;
			}
		} // for sonu
		if (silinecek) {
		System.out.println("hangi indisteki kitap silinicek");
		int indis = giris.nextInt();
		kitapListesi.remove(indis);
	}else System.out.println("Silinecek kitap giriniz");
	}
	private static void EnKucuk() {
		int ekFiyat=kitapListesi.get(0).getFiyat();
		for(kıtap kitap : kitapListesi) {
			if(kitap.getFiyat() < ekFiyat) 
				ekFiyat=kitap.getFiyat();
		}
		for (kıtap kıtap : kitapListesi) {
			if(kıtap.getFiyat()==ekFiyat) 
				Solu).toString();
		}
		
	}
	private static void Ortalama() {
		if(kitapListesi.isEmpty()) {
			System.out.println("Kütüphanede kitap yok");
		}else {
			int ssToplam=0;
			for(kıtap kitap : kitapListesi) {
				ssToplam+=kitap.getSayfaSayisi();
			}
			System.out.println("Sayfa sayısı ortalaması : "+(ssToplam/kitapListesi.size()));
		}
	}
	public static void main(String[] args) {

		byte menu;
		while (true) {
			System.out.println(
					"1-Kayıt giriş\n2-Listele\n3-İsim ara\n4-Düzenle\n5-Sil\n6-Ortalama sayfa sayısı\n7-En küçük fiyat kime ait\n8-Çıkış");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				KitapEkle();

				break;
			case 2:
				Listele();

				break;
			case 3:
				System.out.println("Aranacak kitap adı giriniz:");
				String arananKitap = giris.next();
				KitapArama(arananKitap);
				break;
			case 4:
				Duzenle();

				break;
			case 5:
				Silme();

				break;
			case 6:Ortalama();

				break;
			case 7:EnKucuk();

				break;
			case 8:
				System.out.println("program bitti");
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	

	

}
