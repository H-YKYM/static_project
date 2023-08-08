package practice;

public class PracticeForEach {

	public static void main(String[] args) {
		String name[] = { "佐藤", "鈴木", "高橋", "田中", "伊藤", "渡辺", "山本", "中村", "小林", "加藤", "吉田", "山田", "佐々木" };

		for (String list : name) {
			// ブロック内の処理が繰り返される。
			System.out.println(list);
			 // 改行して結果を表示
		}
	}
} //社員名をまとめたリストである、変数名 list を出力。かつコンソールには最低 10 人を出力。