package practice;

public class PracticeSwitch {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 3, 2, 1, 4, 4, 5, 1 }; //配列は10個のデータを使用

		String[] subject = { "勇者", "バトルマスター", "パラディン", "海賊", "魔法剣士" }; //ジョブは5個のデータを使用

		for (int i = 0; i < 10; i++) {
			// iが10より少ない場合、ブロック内の処理が繰り返される。
			switch (array[i]) {
			case 1:
				System.out.println(array[i] + ":" + subject[0]);
				break;
			case 2:
				System.out.println(array[i] + ":" + subject[1]);
				break;
			case 3:
				System.out.println(array[i] + ":" + subject[2]);
				break;
			case 4:
				System.out.println(array[i] + ":" + subject[3]);
				break;
			case 5:
				System.out.println(array[i] + ":" + subject[4]);
				break;
			default:
				System.out.println(i);
				break;
			}
		}
	}
}