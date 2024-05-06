package HAFTA10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Hafta4.Fonksiyonlar;

public class OgrenciCalısan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ogrenci> ogrenciler = new ArrayList<ogrenci>();
		byte menu;
		for(;;) {
			System.out.println("0-Çıkış\n1-Kayıt ekle\n2-Listele\n3-İsim arama\n4-Ortalama");
			menu=scanner.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:Fonksiyonlarcal.KayitEkle(scanner,ogrenciler);
				break;
            case 2:
            	Fonksiyonlarcal.Listele(ogrenciler);
				break;
            case 3:
            	System.out.println("Aranan adı giriniz: ");
                String arananAd=scanner.next();
                Fonksiyonlarcal.AdArama(arananAd,ogrenciler);
	            break;
            case 4:
	            Fonksiyonlarcal.Ortalama(ogrenciler);
	            break;
            case 5:
            	System.out.println("Düzeltmek istediğiniz adı giriniz: ");
            	String düzeltilenAd=scanner.next();
            	Fonksiyonlarcal.kayıtDüzeltme(scanner,ogrenciler,düzeltilenAd);
            	break;
            case 6:
            	System.out.println("Silinecek ad giriniz: ");
            	String silinenAd = scanner.next();
            	Fonksiyonlarcal.kayıtSilme(scanner,ogrenciler,silinenAd);
            	break;
            case 7:
            	Fonksiyonlarcal.EnBüyük(ogrenciler);
            	break;
            case 8:
            	Fonksiyonlarcal.EnKüçük(ogrenciler);
            	break;
			default:
				System.out.println("Yanlış Menü değeri");
				break;
				
			}
				
			}
		}

	}
