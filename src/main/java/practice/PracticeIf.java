package practice;

public class PracticeIf {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			// iが100以下の場合、ブロック内の処理が繰り返される。

			if ((i % 3 == 0) && (i % 5 == 0)) { // 整数が3と5両方の倍数の場合、このブロック内の処理に進む
				System.out.println("FizzBuzz"); // FizzBuzzを表示	
			} else if (i % 3 == 0) { // 整数が3の倍数の場合、このブロック内の処理に進む
				System.out.println("Fizz"); // Fizzを表示
			} else if (i % 5 == 0) { // 整数が5の倍数の場合、このブロック内の処理に進む
				System.out.println("Buzz");// Buzzを表示	
			} else {
				System.out.println(i); // 上記の条件以外の時、整数を表示
			}
		}
	}
}