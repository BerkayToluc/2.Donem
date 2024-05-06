package Hafta11;

public class Kisi {
     private String tcNo;
     private String ad;
     private String soyad;
	public Kisi(String tcNo, String ad, String soyad) {
		super();
		this.tcNo = tcNo;
		this.ad = ad;
		this.soyad = soyad;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Override
	public String toString() {
		return "Kisi [tcNo=" + tcNo + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	public void Yazdır() {
		System.out.println("Tc kimlik No : "+this.tcNo);
		System.out.println("Adı : "+this.ad);
		System.out.println("Soyadı : "+this.soyad);
	}
}
