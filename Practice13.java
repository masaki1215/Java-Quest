//２つの入力された数値の、最大公約数と最小公倍数を外部ファイルに出力するプログラム
package file;

import java.io.File;
import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyGcdLcm cal = new MyGcdLcm();
		int[] values = new int[GcdLcmMaster.COUNT];
		int temp, gcdResult, lcmResult;
		System.out.println("1つ目の整数を入力してください");
		values[0] = sc.nextInt();
		System.out.println("2つ目の整数を入力してください");
		values[1] = sc.nextInt();
		if (values[0] > values[1]) {
			temp = values[0];
			values[0] = values[1];
			values[1] = temp;
		}
		gcdResult = cal.gcdSection(values[0], values[1]);
		lcmResult = cal.lcmSelection(values, cal.gcdSection(values[0], values[1]));
		File folderIns = new File(GcdLcmMaster.FOLDERNAME);
		File fileIns = new File(GcdLcmMaster.FILENAME);
		cal.existsFolder(folderIns, fileIns);
		cal.fileOutput(values, gcdResult, lcmResult, fileIns);
		System.out.println("フォルダ作成完了");
		System.out.println("出力完了");
		sc.close();
	}
}
