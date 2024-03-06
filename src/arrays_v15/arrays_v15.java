package arrays_v15;

public class arrays_v15 {

	public static void main(String[] args) {
		String ogrenci1 = "Volkan";
		String ogrenci2 = "Ahmet";
		String ogrenci3 = "Osman";
		String ogrenci4 = "Burcu";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ahmet"; 								// indexler 0'dan başlar.
		ogrenciler[1] = "Volkan";
		ogrenciler[2] = "Osman";
		ogrenciler[3] = "Burcu";

		for (int i = 0; i < ogrenciler.length; i++) {   		//sırasıyla bütün indexleri gez.
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------------------");
		
		for (String ogrenci:ogrenciler) 						//ogrenciler dizisindeki her bir elemanı gez. 
		{
			System.out.println(ogrenci);
		}
	}
}
