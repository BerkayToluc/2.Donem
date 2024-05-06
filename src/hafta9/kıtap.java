package hafta9;

public class kıtap {
   private String kitapAdi;
   private String yazarAdi;
   private int sayfaSayisi;
   private int fiyat;
   private String yayinEviAdi;
public kıtap(String kitapAdi, String yazarAdi, int sayfaSayisi, int fiyat, String yayinEviAdi) {
	super();
	this.kitapAdi = kitapAdi;
	this.yazarAdi = yazarAdi;
	this.sayfaSayisi = sayfaSayisi;
	this.fiyat = fiyat;
	this.yayinEviAdi = yayinEviAdi;
}
public String getKitapAdi() {
	return kitapAdi;
}
public void setKitapAdi(String kitapAdi) {
	this.kitapAdi = kitapAdi;
}
public String getYazarAdi() {
	return yazarAdi;
}
public void setYazarAdi(String yazarAdi) {
	this.yazarAdi = yazarAdi;
}
public int getSayfaSayisi() {
	return sayfaSayisi;
}
public void setSayfaSayisi(int sayfaSayisi) {
	this.sayfaSayisi = sayfaSayisi;
}
public int getFiyat() {
	return fiyat;
}
public void setFiyat(int fiyat) {
	this.fiyat = fiyat;
}
public String getYayinEviAdi() {
	return yayinEviAdi;
}
public void setYayinEviAdi(String yayinEviAdi) {
	this.yayinEviAdi = yayinEviAdi;
}
@Override
public String toString() {
	return "kıtap [kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", sayfaSayisi=" + sayfaSayisi + ", fiyat="
			+ fiyat + ", yayinEviAdi=" + yayinEviAdi + "]";
}
   
}
