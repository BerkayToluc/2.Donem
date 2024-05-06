package hafta5;

import java.util.Arrays;

public class StringSinifi {

	public static void main(String[] args) {
		String ad1 ="Ali", ad2="ali",ad3="Zeynep";
		System.out.println(ad1+" .compareTo("+ad2+") : "+ad1.compareTo(ad2));
		System.out.println(ad1+" .compareTo("+ad3+") : "+ad1.compareTo(ad3));
		System.out.println(ad3+" .compareTo("+ad2+") : "+ad3.compareTo(ad2));
		System.out.println(ad3+" .compareTo("+ad1+") : "+ad3.compareTo(ad1));
		System.out.println(ad1+" .compareTo("+ad1+") : "+ad1.compareTo(ad1));

		System.out.println(ad1+" .compareTo("+ad2+") : "+ad1.compareToIgnoreCase(ad2));
		System.out.println(ad1+" .compareTo("+ad3+") : "+ad1.compareToIgnoreCase(ad3));
		System.out.println(ad3+" .compareTo("+ad2+") : "+ad3.compareToIgnoreCase(ad2));
		System.out.println(ad3+" .compareTo("+ad1+") : "+ad3.compareToIgnoreCase(ad1));
		System.out.println(ad1+" .compareTo("+ad1+") : "+ad1.compareToIgnoreCase(ad1));
		
		System.out.println(ad3.toLowerCase());//tümünü küçük harfe
		System.out.println(ad3.toUpperCase());//tümünü büyük harfe çevirir
		String veri= "        Deneme        ";
		System.out.println("|"+veri+"|");
		System.out.println("|"+veri.trim()+"|");
		System.out.println(ad3.charAt(0));
		System.out.println(ad3.charAt(2));
		System.out.println(ad3.codePointAt(0));
		System.out.println(ad3.codePointAt(2));
		System.out.println(ad3.codePointBefore(2));
		System.out.println(ad3.contains("Ze"));// contain içeriyor mu demek
		System.out.println(ad3.contains("eZ"));
		String birlesenIsim=ad1+" "+ad3;
		System.out.println(birlesenIsim);
		String birlesen=ad1.concat(" ");
		System.out.println(birlesen.concat(ad3));
		String isim="Nurşen";
		System.out.println(isim.startsWith("Nu"));//başlangıçta başlıyormu başlamıyor mu diye bakar
		System.out.println(isim.startsWith("ur"));
		System.out.println(isim.endsWith("en"));//bitişinin olduğubnu olmadığını gösterir
		System.out.println(isim.endsWith("ur"));
		System.out.println(isim.indexOf("e"));//belirtilen karakterin hangi indexde olduğunu gösterir
		String sehir="ankara";
		System.out.println(isim.indexOf("e"));
		System.out.println(isim.lastIndexOf("a"));//sondan kaçıncı indeks
		System.out.println(sehir.indexOf("a",1));
		System.out.println(sehir.replace("a", "A"));//yer değiştirme
		String iller = "edirne İstanbul İzmir Ankara Bursa";
		String illerDizi[]= iller.split(" ");
		System.out.println("---------------------------");
		for (String ilAdi : illerDizi) {
			System.out.println(ilAdi);
		}
		System.out.println(iller.length());
		Arrays.sort(illerDizi);
		System.out.println("---------------------------");
		for (String ilAdi : illerDizi) {
			System.out.println(ilAdi);
			}
		int sayilar[] = {3,6,12,0,-5,24};
		Arrays.sort(sayilar);
		System.out.println("---------------------------");
		for(int i:sayilar) {
			System.out.println(i);
		}
		System.out.println(isim.isEmpty());
		String ad5="";
		System.out.println(ad5.isEmpty());
	}
}
