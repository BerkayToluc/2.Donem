package Hafta11;

public class Ogrenci extends Kisi{
	private int vizeNotu;
	private int finalNotu;
public Ogrenci(String tcNo, String ad, String soyad, int vizeNotu, int finalNotu) {
		super(tcNo, ad, soyad);
		this.vizeNotu=vizeNotu;
		this.finalNotu=finalNotu;
	}
public int getVizeNotu() {
	return vizeNotu;
}
public void setVizeNotu(int vizeNotu) {
	this.vizeNotu = vizeNotu;
}

public int getFinalNotu() {
	return finalNotu;
}

public void setFinalNotu(int finalNotu) {
	this.finalNotu = finalNotu;
}
@Override
public String toString() {
	return super.toString()+", Ogrenci [vizeNotu=" + vizeNotu + ", finalNotu=" + finalNotu + "Başarı Notu="+basariNotu()+"]";
}
public int basariNotu() {
	return (int) (this.vizeNotu*.4+this.finalNotu*.6);
}
public void Yazdır() {
	super.Yazdır();//kişi classındaki yazdır fonksiyonu çalışır
	System.out.println("Vize notu : "+this.vizeNotu);
	System.out.println("Final notu: "+this.finalNotu);
	System.out.println("Başarı notu : "+basariNotu());
}
}
