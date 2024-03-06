package recap_v10;

public class recap_v10 {

	public static void main(String[] args) {

		int sayi1 = 100;
		int sayi2 = 400;
		int sayi3 = 300;
		int enbuyukSayi = sayi1;

		if (enbuyukSayi < sayi2) { // eğer sayi1 sayı2 den küçük ise
			enbuyukSayi = sayi2;
		}
		if (enbuyukSayi < sayi3) { // eğer sayi1 , sayi3 ten küçük ise
			enbuyukSayi = sayi3;
		}
		System.out.println("En büyük sayı : " + enbuyukSayi);
	}

}
