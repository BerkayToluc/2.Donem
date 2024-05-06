package Hafta6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import odev2.kitapfonks;


public class listedeneme {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
	    List<String> ad = new ArrayList<String>();
	    List<Integer> fiyat = new ArrayList <Integer>();
	    List<Float> miktar = new ArrayList<Float>();
	    List<String> uruncesidi = new ArrayList <String>();
	    byte menu;
	    for(;;) {
	    	urunfonksiyon.Menu();
	    	menu = giris.nextByte();
	    	switch(menu) {
	    	case 1:
	    		urunfonksiyon.kayıtgiris(ad, fiyat, fiyat, uruncesidi);
	    	case 2:
	    		urunfonksiyon.listeleme(ad, fiyat, fiyat, uruncesidi);
	    	case 3:
	    		System.out.println("Aranacak Çeşidi Giriniz: ");
	    		 String ArananCesit = giris.next();
	    		 urunfonksiyon.cesitilearama(ad, fiyat, fiyat, uruncesidi, ArananCesit);
	    	case 4:
	    	    float toplamFiyat=urunfonksiyon.toplamfiyat(miktar, fiyat);
	    	    break;
	    		
	    	case 5:
	    		System.out.println("Aranacak ürün adını giriniz: ");
	    		String ArananAd = giris.next();
	    		urunfonksiyon.ürünadsatışı(ad, fiyat, fiyat, uruncesidi, ArananAd);
	    	case 6:
	    		urunfonksiyon.EnDusuk(ad, uruncesidi, miktar, fiyat);
	    	case 7:
	    		System.out.println("Düzeltilicek adı giriniz: ");
				String duzeltAd = giris.next();
				urunfonksiyon.duzelt(ad, fiyat, fiyat, uruncesidi, duzeltAd);
	    	case 8:
	    		System.out.println("Silinicek adı giriniz: ");
				String silinenAd = giris.next();
				urunfonksiyon.silinenad(ad, fiyat, fiyat, uruncesidi, silinenAd);
	    	case 9:
	    		System.out.println("Program bitti");
				System.exit(0);
				break;
				default:
					System.out.println("Yanlış İşlem Seçimi!");
	    	}
	    		
	    	}
	    	
	    	}

	
		
	}
	    

	


