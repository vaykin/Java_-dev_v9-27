package mukemmelSayi_v22;

public class mukemmelSayi_v22 {

	public static void main(String[] args) {
		int number = 11;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				
			{
				total = total + i;

			}
		}
		if (total == number) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");

		}

	}
}
