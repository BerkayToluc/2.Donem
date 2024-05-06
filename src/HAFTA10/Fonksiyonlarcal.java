package HAFTA10;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlarcal {

	public static void KayitEkle(Scanner scanner, List<ogrenci> ogrenciler) {
		System.out.println("İsim giriniz : ");
		String isim=scanner.next();
		System.out.println("Vize notu giriniz");
		int vizeNot=scanner.nextInt();
		System.out.println("final notu giriniz");
		int finalNot=scanner.nextInt();
	    ogrenci ogr=new ogrenci(isim,vizeNot,finalNot);
	    ogrenciler.add(ogr);
	    System.out.println(isim+" Kaydını eklediniz");
		
	}

	public static void Listele(List<ogrenci> ogrenciler) {
		for (ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenci.toString());
		}
		
	}

	public static void AdArama(String arananAd, List<ogrenci> ogrenciler) {
		for( ogrenci ogrenci : ogrenciler) {
			if(ogrenci.getAd().equalsIgnoreCase(arananAd)) {
				ogrenci.Yazdir();
			}
		}
	}

	public static void Ortalama(List<ogrenci> ogrenciler) {
		int vnt=0, fnt=0,bnt=0;
		for(ogrenci ogrenci : ogrenciler) {
			vnt+=ogrenci.getVn();
			fnt+=ogrenci.getFn();
			bnt+=ogrenci.getBn();
		}
		System.out.println("Vize not ortalaması : "+vnt/ogrenciler.size());
		System.out.println("Vize not ortalaması : "+fnt/ogrenciler.size());
		System.out.println("Vize not ortalaması : "+bnt/ogrenciler.size());
		
	}

	public static void kayıtDüzeltme(Scanner scanner, List<ogrenci> ogrenciler, String düzeltilenAd) {
		 int index = ogrenciler.indexOf(düzeltilenAd);
		if(index>=0) {
			System.out.println("Yeni ad giriniz: ");
            isim.set(index,scanner.next());
            System.out.println("Yeni   giriniz: ");
            vn.set(index,scan.next());
            System.out.println("Yeni tür giriniz: ");
            fn.set(index,scan.next());
            System.out.println("Yeni fiyat giriniz: ");
            fiyat.set(index,scan.nextByte());
            System.out.println("Yeni sayfa sayısı giriniz: ");
            sayfa.set(index,scan.nextByte());
            System.out.println("Yeni basım tarihi giriniz: ");
            tarih.set(index,scan.nextByte());
		}
	}

	public static void kayıtSilme(Scanner scanner, List<ogrenci> ogrenciler, String silinenAd) {
		// TODO Auto-generated method stub
		
	}

	public static void EnBüyük(List<ogrenci> ogrenciler) {
		// TODO Auto-generated method stub
		
	}

	public static void EnKüçük(List<ogrenci> ogrenciler) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


