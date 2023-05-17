package practice;

import java.util.Scanner;

public class Algorithm4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] A = new int[5];
		int K = 0;
		String R = "";
		int i= 0;



		Scanner scan = new Scanner(System.in);
		while(i < A.length) {

			System.out.println("A("+ i + ")を入力して下さい==>");
			A[i] = scan.nextInt();

			i++;
		}
		System.out.println("検索データを入力してください==>");
		K = scan.nextInt();


		while (A[i] != K && i < 5) {

			i++;
		}
		if (A[i] == K) {
			R = "OK";
		} else {
			R = "NG";
		}
		System.out.println(R);
		scan.close();


	}

}
