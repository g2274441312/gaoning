package bilibili;
import java.util.Scanner;
public class Practise021401 {

	public static void main(String[] args) {
		 
		//double[] hens = {3,5,1,3.4,2,50};
		double scores[]  = new double[5];
		Scanner myScanner = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" +(i+1)+ "个元素的值");
			scores[i] = myScanner.nextDouble();
		} 
		System.out.println("数组的元素如下");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i+1) + "个元素第值=" + scores[i]);
		}
	}
}
