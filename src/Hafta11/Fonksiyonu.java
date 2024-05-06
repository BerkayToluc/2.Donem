package Hafta11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fonksiyonu {

	public static void KisiKayıtEkle(Scanner giris, ArrayList<Kisi> kisiListesi, ArrayList<Ogrenci> ogrenciListesi) {
		System.out.println("Tc No giriniz: ");
	    String tc=giris.next();
	    while(tc.trim().isEmpty()) {
	    	System.out.println("tc kimlik no boş olamaz tekrar giriniz : ");
	    	tc=giris.next();
	    }
	    System.out.println("Ad giriniz: ");
	    String ad= giris.next();
	    System.out.println("Soyad giriniz: ");
	    String soyad= giris.next();
	    Kisi kisi1= new Kisi(tc,ad,soyad);
	    kisiListesi.add(kisi1);
	    System.out.println(ad+" kaydı eklendi");
	}

	public static void OgrenciKayıtEkle(Scanner giris, ArrayList<Kisi> kisiListesi, ArrayList<Ogrenci> ogrenciListesi) {
		System.out.println("Tc No giriniz: ");
	    String tc=giris.next();
	    while(tc.trim().isEmpty()) {
	    	System.out.println("tc kimlik no boş olamaz tekrar giriniz : ");
	    	tc=giris.next();
	    }
	    System.out.println("Ad giriniz: ");
	    String ad= giris.next();
	    System.out.println("Soyad giriniz: ");
	    String soyad= giris.next();
	    System.out.println("Vize Notu Giriniz : ");
	    int vn=giris.nextInt();
	    System.out.println("Final Notu Giriniz : ");
	    int fn=giris.nextInt();
	    Ogrenci ogrenci1=new Ogrenci(tc, ad, soyad, vn, fn);
	    ogrenciListesi.add(ogrenci1);
	    System.out.println(ad+" Kaydı Eklendi");
	}

	public static void KisiListele(ArrayList<Kisi> kisiListesi) {
		System.out.println("Kişi listesi");
		if(kisiListesi.isEmpty()) {
			System.out.println("Gösterilicek veri listede yok");
			return;
		}
		for (Kisi kisi : kisiListesi) {
			System.out.println(kisi);
		}
	}

	public static void OgrenciListele(ArrayList<Ogrenci> ogrenciListesi) {
		System.out.println("Öğrenci Listesi");
		if(ogrenciListesi.isEmpty()) {
			System.out.println("Öğrenci Listesi boş");
			return;
		}
		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci);
		}
	}

	public static void KisiAra(Scanner giris, ArrayList<Kisi> kisiListesi) {
		System.out.println("Aranacak Tc No : ");
		String tcAra=giris.next();
		boolean bosmu=true;
		for (Kisi kisi : kisiListesi) {
			if(kisi.getTcNo().equalsIgnoreCase(tcAra)) {
				kisi.Yazdır();
				bosmu=false;
		}
		}	
		if(bosmu)System.out.println("Aranan kayıt bulunamadı");
	}

	public static void OgrenciAra(Scanner giris, ArrayList<Ogrenci> ogrenciListesi) {
		boolean bosmu=true;
		System.out.println("Aranacak Öğrenci Adı: ");
		String adAra=giris.next();
		for (Ogrenci ogrenci : ogrenciListesi) {
			if(ogrenci.getAd().equalsIgnoreCase(adAra)) {
				ogrenci.Yazdır();
			bosmu=false;
		}
	}
	if(bosmu) System.out.println("Yanlış menü değeri");
		

		}

	public static void Enb(ArrayList<Ogrenci> ogrenciListesi) {
		if(ogrenciListesi.isEmpty()) {
			System.out.println("Kayıtlı Öğrenci bulunamadı");
			return;
		}
		int enbVize=ogrenciListesi.get(0).getVizeNotu();
		Ogrenci enbOgrenci = null;
		for (Ogrenci ogrenci : ogrenciListesi) {
			if(ogrenci.getVizeNotu()>enbVize) {
				enbVize=ogrenci.getVizeNotu();
				enbOgrenci=ogrenci;
			}
		}
		System.out.println("En büyük öğrenci değerleri");
		enbOgrenci.Yazdır();
	}

	public static void CalısannEkle(Scanner scanner, ArrayList<Kisi> kisiListesi) {
		System.out.println("Tc No giriniz: ");
	    String tc= scanner.next();
	    while(tc.matches("\\d+")) {
	    	System.out.println("tc kimlik no sayı dışında olamaz  tekrar giriniz : ");
	    	tc=scanner.next();
	    }
	    
	}

	public static void CalısannListele(ArrayList<Kisi> kisiListesi) {
		// TODO Auto-generated method stub
		 System.out.println("Ad giriniz: ");
		    String ad=Scanner.next();
		    System.out.println("Soyad giriniz: ");
		    String soyad= giris.next();
		    System.out.println("Çalışanmısınız(E/H");
		    String calisanKontrol=giris.next();
			if(calisanKontrol.equalsIgnoreCase("E")) {
		    	System.out.println("medeni durum giriniz : ");
		    	String mDurum=giris.next();
		    	System.out.println("Çocuk sayısı giriniz : ");
		    	int cSayisi=giris.nextInt();
		    	System.out.println("Brüt maaş giriniz : ");
		    	double bMaas = giris.nextDouble();
		    	Calisann calisan= new Calisann(tc, ad, soyad, mDurum, cSayisi, bMaas);
		    	System.out.println(ad+" Çalışan kayıdnı giriniz");
		    	kisiListesi.add(calisan);		    	
		    }else if(calisanKontrol.equalsIgnoreCase("H")) {
		    	Kisi kisi=new Kisi(tc, ad, soyad, );
		    	System.out.println(" Kişi kayıdnı giriniz ");
		    }
	}

	public static void CalısannAra(Scanner scanner, ArrayList<Kisi> kisiListesi) {
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş arama yapılamaz");
			return;
		}
		System.out.println("Aranacak kişinin tcsini giriniz: ");
		String arananTcNo=scanner.next();
		while (!arananTcNo.matches("\\d+")) {
			System.out.println("tc kimlik no sayı dışında olamaz tekrar giriniz : ");
			arananTcNo = scanner.next();
		}
		for(Kisi kisi : kisiListesi) {
			if(kisi).getTcNo().equalsIgnoreCase(arananTcNo){
				kisi.Yazdır();
				return;
			}
		}
		
	
	}

	public static void Maas(ArrayList<Kisi> kisiListesi) {
		System.out.println("Kişi listesi");
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		for(Kisi kisi : kisiListesi) {
			if(kisi instanceof Calısann) {
				kisi.Yazdır();
			}
		}
	}

	public static void Kisi1Listele(ArrayList<Kisi> kisiListesi) {
		System.out.println("sadece Kişileri görüntüle");
		for(Kisi kisi : kisiListesi) {
			if(kisi instanceof Kisi) {
				kisi.Yazdır();
			}
		}
		
	}
		}
