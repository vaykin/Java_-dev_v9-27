package loop_v12_v13_v14;

public class loop_v12_v13_v14 {
	public static void main(String[] args) {
//for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		System.out.println("Bitti.");

//while
		int i = 1; 					// burada ki i for içindekinden farklıdır.
		while (i < 10) { 			// şart sağlanmadığında döngüye girmez.
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti.");

//do-while						    Şart sağlanmasa bile bir kez çalışan bir döngüdür.
		int j = 1;
		do {
			System.out.println(j);
			j += 2;

		} while (j < 10); 			// şart sağlanana kadar devam eder.
		System.out.println("Do-While döngüsü bitti.");
	}
}