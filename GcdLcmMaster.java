package file;

import java.io.File;
import java.util.Scanner;

public abstract class GcdLcmMaster {
	Scanner sc = new Scanner(System.in);
	final static int COUNT = 2; // 配列の個数用定数
	final static String FOLDERNAME = "answer"; // フォルダ名定数
	final static String FILENAME = FOLDERNAME + "/result.txt";

	// 整数入力用メソッド
	int inputValue(int i) {
		System.out.println((i + 1) + "つ目の整数を入力してください");
		return sc.nextInt();
	}

	// 最大公約数を求めるメソッド
	abstract int gcdSection(int value01, int value02);

	// 最小公倍数を求めるメソッド
	abstract int lcmSelection(int[] values, int gcd);

	// フォルダの有無確認(存在しなければフォルダ作成)
	abstract void existsFolder(File folderIns, File fileIns);

	// 最大公約数と最小公倍数をファイル(result.txt:FILENAME)に出力
	abstract void fileOutput(int[] values, int gcd, int lcm, File fileIns);

}
