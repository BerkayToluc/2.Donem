package hafta5;

public class matematikıslemleri {

	public static void main(String[] args) {
		System.out.println(Math.PI); //pi değeri
		System.out.println("Math.sqrt(25) : "+Math.sqrt(25)); //karekök
		System.out.println("Math.ceil(2.3)" +Math.ceil(2.3));//ondalıklı sayılar yukarı çeker
		System.out.println("Math.floor(2.7)" +Math.floor(2.7));//ondalıklı sayılar aşşağıya çeker
		System.out.println("Math.round(2.3)" +Math.round(2.3));//yuvarlama
		System.out.println("Math.round(2.6)" +Math.round(2.6));//yuvarlmaa
		System.out.println("Math.min(5, 7)" +Math.min(5, 7) );//minimum bulma
		System.out.println("Math.max(5, 7)" +Math.max(5, 7));//maximum bulma

		System.out.println("Math.ceil(2.3)" +benimceil(2.3));//ondalıklı sayılar yukarı çeker
		System.out.println("Math.floor(2.7)" +benimfloor(2.7));//ondalıklı sayılar aşşağıya çeker
		System.out.println("Math.round(2.3)" +benimround(2.3));//yuvarlama
		System.out.println("Math.round(2.6)" +benimround(2.6));//yuvarlmaa
		System.out.println("Math.min(5, 7)" +benimMin(5, 7) );//minimum bulma
		System.out.println("Math.max(5, 7)" +benimMax(5, 7));//maximum bulma
	}

	private static int benimMax(int i, int j) {
		int max;
		if(i>j) max=i;
		else max=j;
		return max;
	}

	private static int benimMin(int i, int j) {
		int min;
		if(i<j) min=i;
		else min=j;
		return min;
	}

	private static double benimround(double d) {
		//double ondalık = d-(int)d;
		double ondalik=d%1;
		int yuvarlanmis;
		if(ondalik>=0.5) 
			yuvarlanmis=(int)++d;
		else
			yuvarlanmis = (int)d;
		return yuvarlanmis;
				
	}

	private static double benimfloor(double d) {
		return (int)d;
	}

	private static double benimceil(double d) {
		return (int)++d;
	}

}
