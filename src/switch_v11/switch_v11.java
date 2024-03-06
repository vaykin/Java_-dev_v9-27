package switch_v11;

public class switch_v11 {

	public static void main(String[] args) {
		char grade = 'H';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Başarısız : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");

		}
	}

}