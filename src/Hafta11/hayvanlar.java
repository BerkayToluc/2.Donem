package Hafta11;

import Hafta11.Hayvan;
import Hafta11.Kedi;
import Hafta11.Kopek;

class Hayvan{
	private String tur;
	public Hayvan(String tur) {
		super();
		this.tur = tur;
	}
	public void SesCikar() {
		System.out.println(tur+" Bilinmeyen ses");
	}
	public String getTur() {
		
		return tur;
	}
}
class Kedi extends Hayvan{
	private String renk;
	
	public Kedi(String tur, String renk) {
		super(tur);
		this.renk = renk;
	}
	public void SesCikar() {
		System.out.println(super.getTur()+ " Miyav");
	}
	public void renkGoster() {
		
	}
}
class Kopek extends Hayvan{
	private String cins;
	
   public Kopek(String tur, String cins) {
	   super(tur);
	   this.cins = cins;
   }
   public void SesCıkar() {
	   System.out.println(getTur() + "hav hav");
   }
   public void CinsGoruntule() {
	   System.out.println("Köpeğin cinsi : " + cins);
   }

public class Hayvanlar {
public static void main(String[] args) {
	Hayvan hayvan1 = new Hayvan("Bilinmeyen tür");
	hayvan1.SesCikar();
	Hayvan hayvan2 = new Kedi("ev Kedisi" , "siyah");
	hayvan2.SesCikar();
	((Kedi)hayvan2).renkGoster();
	Hayvan hayvan3=new Kopek("Köpek" , "Golden");
	hayvan3.SesCikar();
	((Kopek)hayvan3).CinsGoruntule();
}
{
}
}
}

