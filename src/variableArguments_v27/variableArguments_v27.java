package variableArguments_v27;

public class variableArguments_v27 {
	public static void main(String[] args) {

		int toplam=topla2 (2,4,5,7,8,9,1,6,7);
	System.out.println(toplam);
	}
	
	public static int topla2 (int... sayilar) {
		int toplam= 0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}
