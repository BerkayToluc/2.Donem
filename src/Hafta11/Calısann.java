package Hafta11;

public class Calısann extends Kisi{
private String medeniDurum;
private int cocukSayisi;
private double brutMaas;
private double NetMaas;
	public Calısann(String tcNo, String ad, String soyad, String medeniDurum, int cocukSayisi, double maas) {
		super(tcNo, ad, soyad);
		this.medeniDurum = medeniDurum;
		this.cocukSayisi = cocukSayisi;
		this.brutMaas = brutMaas;
	}
	public String getMedeniDurum() {
		return medeniDurum;
	}
	public void setMedeniDurum(String medeniDurum) {
		this.medeniDurum = medeniDurum;
	}
	public int getCocukSayisi() {
		return cocukSayisi;
	}
	public void setCocukSayisi(int cocukSayisi) {
		this.cocukSayisi = cocukSayisi;
	}
	public double getBrutMaas() {
		return brutMaas;
	}
	public void setBrutMaas(double brutMaas) {
		this.brutMaas = brutMaas;
	}
    public double getNetMaas() {
		double netMaas = brutMaas;
		if(medeniDurum.equalsIgnoreCase("evli")) {
			netMaas += 1000;
		}
		netMaas += cocukSayisi * 500;
		if(netMaas < 10000)
			netMaas -= netMaas * 0.1;
		else if(netMaas <20000)
			netMaas -= netMaas*0.2;
		else
			netMaas -= netMaas*0.3;
		return netMaas;
    }
	@Override
	public String toString() {
		return "Calısann [medeniDurum=" + medeniDurum + ", cocukSayisi=" + cocukSayisi + ", brutMaas=" + brutMaas
				+ ", NetMaas=" + NetMaas + "]";
	}
    public void Yazdir() {
    	super.Yazdır();
    	System.out.println("medeni durum");
    	System.out.println("cocuk sayısı");
    	System.out.println("maas");
    }
}
