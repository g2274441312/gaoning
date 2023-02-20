package bilibili;
import java.util.Scanner;

public class Practise020801 {
public static void main(String[] args) {
	/*
	 * 
	 *
	 * */
	System.out.println("输入一个整数：");
	Scanner myScanner = new Scanner(System.in);
	int i = myScanner.nextInt();
	int ge  = i%10;
	int shi = i%100/10;
	int bai = i/100;
	if(ge * ge * ge + shi * shi*shi + bai * bai* bai == i) {
		System.out.println("输入的整数是水仙花数");
	}else {
		System.out.println("输入的整数不是水仙花数");
	}
	System.out.println(ge + shi + bai);
}
}
