package practice;

import java.util.Scanner;

public class Algorithm4_2_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] X = {8,15,29,32,55,59,68,88,95,102,113,125,130,153,160};
		int i =0;
		String R = "";


		Scanner scan = new Scanner(System.in);
		System.out.println("検索データを入力してください==>");
		int K = scan.nextInt();

		while(X[i]!=K && i < X.length) {
			i++;
		}
		if (X[i] == K) {
			R = "あたり";
		}else {
			R = "はずれ";
		}
		System.out.println("結果==" + R);

		scan.close();
	}

}
