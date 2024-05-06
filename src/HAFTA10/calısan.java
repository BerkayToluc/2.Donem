package HAFTA10;

public class calısan {

	public static void main(String[] args) {
		ogrenci ogr1=new ogrenci();//sınıftan nesne üretti
		ogr1.setAd("Ali");
		System.out.println(ogr1.getAd());
		ogr1.setVn(45);
		ogr1.setFn(65);
		ogr1.setBn((byte) (ogr1.getVn()*0.4+ogr1.getFn()*0.6));
		/*System.out.println("Vize notu : "+ogr1.vn);
		System.out.println("Final notu : "+ogr1.fn);
		System.out.println("Başarı notu : "+ogr1.bn);*/
		ogr1.Yazdir();
		System.out.println("----------------------------");
		ogrenci ogr2= new ogrenci("Ayşe",50,60);
		/*System.out.println("Öğrenci adı :"+ogr2.ad);
		System.out.println("Vize notu :"+ogr2.vn);
		System.out.println("Final notu :"+ogr2.fn);
		System.out.println("Başarı notu :"+ogr2.bn);*/
		ogr2.Yazdir();
		System.out.println("---------------------------------");
		System.out.println(ogr2.toString());
	}

}
