package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyGcdLcm extends GcdLcmMaster {

	@Override
	int gcdSection(int value01, int value02) {
		// TODO 自動生成されたメソッド・スタブ
		int gcd;
		gcd = value01 % value02;
		value01 = value02;
		value02 = gcd;
		while (gcd != 0) {
			gcd = value01 % value02;
			value01 = value02;
			value02 = gcd;
		}
		return value01;
	}

	@Override
	int lcmSelection(int[] values, int gcd) {
		// TODO 自動生成されたメソッド・スタブ
		return (values[0] * values[1] / gcd);
	}

	@Override
	void existsFolder(File folderIns, File fileIns) {
		// TODO 自動生成されたメソッド・スタブ
		if (!folderIns.exists()) {
			folderIns.mkdir();
		}
		if (!fileIns.exists()) {
			try {
				fileIns.createNewFile();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	@Override
	void fileOutput(int[] values, int gcd, int lcm, File fileIns) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fileWrite = new FileWriter(fileIns);
			BufferedWriter bufWrite = new BufferedWriter(fileWrite);
			bufWrite.write(values[0] + "と" + values[1] + "の\r");
			bufWrite.write("最大公約数：" + gcd + "\r");
			bufWrite.write("最小公倍数：" + lcm + "\r");
			bufWrite.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
