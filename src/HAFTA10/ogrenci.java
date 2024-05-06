package HAFTA10;

public class ogrenci {
private String ad;
private int vn;
private int fn;
private int bn;
public ogrenci(String ad, int vn, int fn) {
	super();
	/*
	System.out.println("Verili kurucu fonksiyon");*/
	this.ad = ad;
	this.vn = vn;
	this.fn = fn;
	basarıhesap();
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}

public int getVn() {
	return vn;
}

public void setVn(int vn) {
	this.vn = vn;
}

public int getFn() {
	return fn;
}

public void setFn(int fn) {
	this.fn = fn;
}

public int getBn() {
	return bn;
}

public void setBn(int bn) {
	this.bn = bn;
}

private void basarıhesap() {
	this.bn=(int)(this.vn*0.4+this.fn*0.6);
}
public ogrenci() {
	System.out.println("Boş kurucu fonksiyon");
}
public void Yazdir() {
	System.out.println("Öğrenci adı :"+this.ad);
	System.out.println("Vize notu :"+this.vn);
	System.out.println("Final notu :"+this.fn);
	System.out.println("Başarı notu :"+this.bn);
	System.out.println("------------------------------");
}
@Override
public String toString() {
	String donen= "ad : " + ad + "\nvn : " + vn + "\nfn : " + fn + "\nbn : " +bn ;
			return donen;
	}

}
