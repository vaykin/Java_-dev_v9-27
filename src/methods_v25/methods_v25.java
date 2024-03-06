package methods_v25;

public class methods_v25 {
	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 6, 7, 8, 9 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) { // içerisindeki bütün sayıları gezeçek.
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer(aranacak);
		} else {
			System.out.println("sayi mevcut değildir.");
		}

	}

	public static void mesajVer(int aranacak) {
		System.out.println("Sayi mevcuttur :" + aranacak);
	}
}
