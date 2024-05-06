package sınavahazırlık;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dakika {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> ad = new ArrayList<String>();
		List<Integer> dakika = new ArrayList<Integer>();
		List<Integer> sms = new ArrayList<Integer>();                                
		List<Integer> internet = new ArrayList<Integer>();
		List<Double> fatura = new ArrayList<Double>();
		byte menu;
		/*("1.Kayıt girişi\n"
		+ "2.Harcanan dakikaya göre arama\n"
		+ "3.Toplam fatura tutarı\n"
		+ "4.Kişi ismi ile arama\n"
		+ "5.en az fatura\n"
		+ "6.en yüksek fatura\n"
		+ "7.fatura ortalaması\n"
		+ "8.Kişi bilgisi düzeltme\n"
		+ "9.Kişi bilgisi silme\n"
		+ "10.Çıkış");*/
		for(;;) {
			dakikafonksiyon.Menu();
			menu=giris.nextByte();
			switch(menu) {
			case 1:
				dakikafonksiyon.verigirisi(ad, dakika, sms, internet);
				break;
			case 2:
				System.out.println("Kullanılan dakika: ");
				Integer hrcDakika = giris.nextInt();
				dakikafonksiyon.Harcanandakika(ad, dakika, sms, internet, hrcDakika);
				break;
			case 3:
				double toplamfatura = dakikafonksiyon.faturatutarı(ad, dakika, sms, internet, fatura);
				System.out.println("Toplam fatura: "+ toplamfatura);
				break;
			case 4:
				System.out.println("Aranacak isim giriniz: ");
				String arananAd = giris.next();
				dakikafonksiyon.arananAd(ad, dakika, sms, internet, arananAd);
				break;
			case 5:
				dakikafonksiyon.enazfatura(ad, fatura);
				break;
			case 6:
				dakikafonksiyon.enfazlafatura(ad, fatura);
				break;
			case 7:
				dakikafonksiyon.Ortalama(ad, fatura);
				break;
			case 8:
				
				
				
			}
		}

	}

}
