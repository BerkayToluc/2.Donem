package Hafta4;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args) {

	}
	public static void Menu() {
	System.out.println("1-Kayıt\n2-Listeleme\n3-Ortalama\n4-Minimum\n5-Maksimum\n6-Ad arama");
	System.out.println("7-İsimden silme\n8-İsimden düzeltme\n9-Çıkış");
		
	}
		
	public static void veriGiris(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot) {
		Scanner giris = new Scanner(System.in);
		System.out.println("İsim giriniz : ");
		isim .add(giris.next());
		System.out.println("Vize not giriniz : ");
		byte vn=giris.nextByte();
		vNot.add(vn);
		byte fn=giris.nextByte();
		fNot.add(fn);
		bNot.add((byte) (vn*0.4+fn*0.6));
	}
	
	public static void Listele(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot) {
		for (int i = 0; i < isim.size(); i++) {
			System.out.println("İsim "+isim.get(i));
			System.out.println("Vize Notu : "+vNot.get(i));
			System.out.println("Final Notu : "+fNot.get(i));
			System.out.println("Başarı Notu : "+bNot.get(i));
			System.out.println("----------------------------");
			
		}
		
	}

	public static byte Ortalama(List<Byte> sinavNotu) {
		int toplam=0;
		for(Byte sn : sinavNotu) {
			toplam+=sn;
		}
		return (byte) (toplam/sinavNotu.size());
	}

	public static byte EnBuyuk(List<Byte> sinavNotu) {
		byte enb=sinavNotu.get(0);
		for (int i = 1; i < sinavNotu.size(); i++) {
			if(sinavNotu.get(i)>enb) enb=sinavNotu.get(i);	
		}
		return enb;
	}

	public static byte EnKucuk(List<Byte> sinavNotu) {
		byte enk=sinavNotu.get(0);
		for (int i = 1; i < sinavNotu.size(); i++) {
			if(sinavNotu.get(i)>enk) enk=sinavNotu.get(i);
		}
		return enk;
	}
	public static void IsimArama(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String arananAd) {
		int indis=isim.indexOf(arananAd);
		if(indis>=0) {
			System.out.println("İsim "+isim.get(indis));
			System.out.println("Vize Notu : "+vNot.get(indis));
			System.out.println("Final Notu : "+fNot.get(indis));
			System.out.println("Başarı Notu : "+bNot.get(indis));
			System.out.println("----------------------------");
		}else System.out.println("Aranan isim listede yok");
	}
	public static void IsimSilme(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String silinenAd) {
		int indis=isim.indexOf(silinenAd);
		if(indis>=0) {
			isim.remove(indis);
			vNot.remove(indis);
			fNot.remove(indis);
			bNot.remove(indis);
		}else System.out.println("Silinicek isim listede yok");
	}
	public static void IsimDuzeltme(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String duzeltilenAd) {
		int indis=isim.indexOf(duzeltilenAd);
		if(indis>=0) {
			Scanner giris = new Scanner(System.in);
			System.out.println("Yeni isim giriniz: ");
			isim.set(indis, giris.next());
			System.out.println("Yeni vize notu giriniz: ");
			byte vn=giris.nextByte();
			vNot.set(indis, vn);
			System.out.println("Yeni Final notu giriniz: ");
			byte fn=giris.nextByte();
			fNot.set(indis, fn);
			bNot.set(indis, (byte)(vn*0.4+fn*0.6));
		    }else System.out.println("Düzeltilicek isim listede yok");

		
	}

}
