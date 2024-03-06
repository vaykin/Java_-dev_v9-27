package methods2_v26;

public class methods2_v26 {
	public static void main(String[] args) {
	//	String mesaj = " Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
	
}
	public static void ekle () {
		System.out.println("Eklendi");
	}
	
	public static void sil () {
		System.out.println("silindi");
	}
	public static void guncelle () {
		System.out.println("güncellendi");
}
	public static int topla (int sayi1,int sayi2) {
		return sayi1+sayi2;
		//return 5;  						//bitir ama 5 döndür.
	}
	
	public static String sehirVer () {
		return "İstanbul" ;
	}

}
