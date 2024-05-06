package Hafta6;

import java.util.List;
import java.util.Scanner;

public class urunfonksiyon {

	public static void Menu() {
		System.out.println("1-Kayıt Giriş\n"
				+ "2-Listeleme\n"
				+ "3-Çeşit ile arama\n"
				+ "4-Toplam fiyat\n"
				+ "5-Ürün adı ile satış"
				+ "6-En düşük miktarlı ürün bilgisi\n"
				+ "7-Düzeltme\n"
				+ "8-Silme\n"
				+ "9-Çıkış");
		
	}

	public static void kayıtgiris(List<String> ad, List<Integer> fiyat, List<Integer> miktar, List<String> uruncesidi) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Ürün adı: ");
		ad.add(giris.next());
		System.out.println("Birim fiyatı: ");
		fiyat.add(giris.nextInt());
		System.out.println("Ürün Miktarı: ");
		miktar.add(giris.nextInt());
		System.out.println("Ürün çeşidi: ");
		uruncesidi.add(giris.next());
		
	}

	public static void listeleme(List<String> ad, List<Integer> fiyat, List<Integer> miktar, List<String> uruncesidi) {
		for(int i =0; i<ad.size(); i++) {
			System.out.println("ürün adı: "+ad.get(i) );
			System.out.println("Birim Fiyatı: "+fiyat.get(i));
			System.out.println("Ürün miktarı: "+miktar.get(i));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(i));
			System.out.println("-----------------------");
		}
		
	}

	public static void cesitilearama(List<String> ad, List<Integer> fiyat, List<Integer> miktar,
			List<String> uruncesidi, String arananCesit) {
		int indis = ad.indexOf(uruncesidi);
		if(indis>=0) {
			System.out.println("ürün adı: "+ad.get(indis));
			System.out.println("birim fiyat: "+fiyat.get(indis));
			System.out.println("Ürün miktarı: "+miktar.get(indis));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(indis));
			System.out.println("-------------------------");
		}
		
		
	}
	public static void ürünadsatışı(List<String> ad, List<Integer> fiyat, List<Integer> miktar, List<String> uruncesidi,
			String arananAd) {
		
		
	}

	
	

	public static void duzelt(List<String> ad, List<Integer> fiyat, List<Integer> miktar, List<String> uruncesidi,
			String duzeltAd) {
		int indis = ad.indexOf(duzeltAd);
		if(indis>=0) {
			Scanner giris = new Scanner(System.in);
			System.out.println("Yeni ad giriniz: ");
			ad.set(indis,giris.next());
			System.out.println("Yeni birim fiyatı giriniz: ");
			fiyat.set(indis,giris.nextInt());
			System.out.println("yeni miktar giriniz: ");
			miktar.set(indis,giris.nextInt());
			System.out.println("yeni ürün çeşidi giriniz: ");
			uruncesidi.set(indis, giris.next());	
			
		}
	}

	public static void silinenad(List<String> ad, List<Integer> fiyat, List<Integer> miktar, List<String> uruncesidi,
			String silinenAd) {
		int indis = ad.indexOf(silinenAd);
		if(indis>=0) {
			ad.remove(indis);
			fiyat.remove(indis);
			miktar.remove(indis);
			uruncesidi.remove(indis);
		}
		else
			System.out.println("Yanlış isim seçimi!");
		
	}

	public static float toplamfiyat(List<Float> miktar, List<Integer> fiyat) {
		float toplam = 0;
		for(int i=0; i<miktar.size(); i++) {
			toplam+=fiyat.get(i)*miktar.get(i);
		}
		return 0;
	}

	public static void EnDusuk(List<String> ad, List<String> uruncesidi, List<Float> miktar, List<Integer> fiyat) {
		float end = miktar.get(0);
		for(int i=1; i<ad.size(); i++) {	
			if(miktar.get(i)<end)
				end=miktar.get(i);
		}
		for(int i =0; i<ad.size(); i++) {
			if(miktar.get(i)==end) {
				
			System.out.println("ürün adı: "+ad.get(i) );
			System.out.println("Birim Fiyatı: "+fiyat.get(i));
			System.out.println("Ürün miktarı: "+miktar.get(i));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(i));
			System.out.println("-------------------------");
	
	}
}
	}

	
	}

	
		
	
	

	
