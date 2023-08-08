package practice;

public class PracticeFor {

	public static void main(String[] args) {
		int sum = 0; //初期値設定

		for (int i = 1; i <= 100; i++) {
			// iが100以下の場合、ブロック内の処理が繰り返される。
			sum += i; //整数を足していく。
		}
		System.out.println(sum); // 改行して結果を表示
	}
} //1 ～ 100 までの整数を足して、その総和を表示するプログラム。