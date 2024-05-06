package sınavahazırlık;

import java.util.List;
import java.util.Scanner;

public class  dakikafonksiyon {

	public static void Menu() {
		System.out.println("1.Kayıt girişi\n"
				+ "2.Harcanan dakikaya göre arama\n"
				+ "3.Toplam fatura tutarı\n"
				+ "4.Kişi ismi ile arama\n"
				+ "6.en az fatura\n"
				+ "7.en yüksek fatura\n"
				+ "8.fatura ortalaması\n"
				+ "9.Kişi bilgisi düzeltme\n"
				+ "10.Kişi bilgisi silme\n"
				+ "11.Çıkış");
		
	}

	public static void verigirisi(List<String> ad, List<Integer> dakika, List<Integer> sms, List<Integer> internet) {
	Scanner giris = new Scanner(System.in);
	System.out.println("Adınız: ");
	ad.add(giris.next());
	System.out.println("Kullandığınız dakikayı giriniz: ");
	dakika.add(giris.nextInt());
	System.out.println("Kullanılan sms'i giriniz: ");
	sms.add(giris.nextInt());
	System.out.println("Kullanılan interneti giriniz: ");
	internet.add(giris.nextInt());
		
	}

	public static void Harcanandakika(List<String> ad, List<Integer> dakika, List<Integer> sms, List<Integer> internet,
			Integer hrcDakika) {
		for(int i=0; i<dakika.size(); i++) {
			yazdir(i, ad, dakika, sms, internet);
		}
			
		}

	private static void yazdir(int i, List<String> ad, List<Integer> dakika, List<Integer> sms,
			List<Integer> internet) {
		System.out.println(+i+".kişi");
		System.out.println("Kişi ismi: "+ad);
		System.out.println("Dakika: "+dakika);
		System.out.println("Sms: "+sms);
		System.out.println("İnternet: "+internet);
		
	}

	public static double faturatutarı(List<String> ad, List<Integer> dakika, List<Integer> sms, List<Integer> internet,
			List<Double> fatura) {
		double toplam = 0;
		for(int i=0; i<ad.size(); i++) {
			double dakikafiyati = dakika.get(i) * 0.5;
			double smsfiyati = sms.get(i) * 0.45;
			double internetfiyati = internet.get(i) * 10;
			double toplamfatura = dakikafiyati + smsfiyati + internetfiyati;
			fatura.set(i, toplamfatura);
			toplam += toplamfatura;
		}
		return toplam;
	}

	public static void arananAd(List<String> ad, List<Integer> dakika, List<Integer> sms, List<Integer> internet,
			String arananAd) {
		for(int i=0; i<ad.size(); i++) {
			if(ad.get(i).equalsIgnoreCase(arananAd));
			yazdir(i, ad, dakika, sms, internet);
		}
		
	}

	public static double enazfatura(List<String> ad, List<Double> fatura) {
		double min = Double.MAX_VALUE;
		for(int i=0; i<fatura.size(); i++) {
			if(fatura.get(i)<min) {
				min = fatura.get(i);
			}
		}
		return min;
		
	}

	public static double enfazlafatura(List<String> ad, List<Double> fatura) {
		double max = Double.MIN_VALUE;
		for(int i=0; i<fatura.size(); i++) {
			if(fatura.get(i)>max) {
				max = fatura.get(i);
			}
		}
		return max;
		
	}

	public static double Ortalama(List<String> ad, List<Double> fatura) {
		double toplam = 0;
		for(int i=0; i<fatura.size(); i++) {
			toplam+=fatura.get(i);
		}
		return toplam/fatura.size();
	}

	
		
	}
     
		
	
		
	

		
	


