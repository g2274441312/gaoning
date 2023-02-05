package bilibili;

import java.util.Scanner;

public class Practise020403 {

	
	public static void main(String[] agrs) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入马保国老师的芝麻信用分（1-100）");
		int fen = myScanner.nextInt();
		if (fen >= 1 && fen <= 100) {
		if(fen == 100) {
			System.out.println("信用极好");
		}else if(fen >= 80&&fen <= 99){
			System.out.println("信用优秀");
		}else if(fen >= 60&&fen < 80){
			System.out.println("信用一般");
		}else {
			System.out.println("不及格，奖励闪电五连鞭");
		}
	}else {
		System.out.println("请输入有效的芝麻信用分");
	}
	}
}
