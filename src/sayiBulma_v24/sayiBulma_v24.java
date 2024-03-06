package sayiBulma_v24;

public class sayiBulma_v24 {
	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 6, 7, 8, 9 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) { // içerisindeki bütün sayıları gezeçek.
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("sayi mevcuttur.");
		} else {
			System.out.println("sayi mevcut değildir.");
		}
	}

}
