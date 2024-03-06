package strings_v18_v19;

public class strings_v18_v19 {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı:" + mesaj.length());
		System.out.println("5. Eleman:" + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!")); // ekleme
		System.out.println(mesaj.startsWith("B")); // Başladığı harfin doğruluğuna göre true yada false verir.
		System.out.println(mesaj.endsWith(".")); // Hangi harf ile bittiğini doğrulamak için false veya true sonucunu
													// verir.
		char[] karakterler = new char[25];
		mesaj.getChars(6, 10, karakterler, 5); // istenilen aralığı almamıza yarar.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); // ilk gördüğü "a" kaçıncı index sıra numarsı kaç ise onu verir.
		System.out.println(mesaj.lastIndexOf("g")); // aramaya sondan başlar ve soldan başlar gibi sıra numarasını
													// verir.

		System.out.println("----------------------------");

		String yeniMesaj = mesaj.replace(' ', '-'); // değiştirme işlemi uygulanıyor.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(4)); // 4. indexten itibaren kesip göster.
		System.out.println(mesaj.substring(4, 10)); // 4-10 arasındaki indexleri göster sadece.
		System.out.println("----------------------------");

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println("----------------------------");
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());  //trim ile cümlenin başındaki ve sonundaki boşlukları atabiliyoruz.

	}

}
