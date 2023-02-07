package bilibili;

import java.util.Scanner;

public class Practise020601 {
public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
    int bf = 0;
	double sum3 = 0;
	for(int i = 1; i <= 3; i++){
	
	  double  sum = 0;
	for(int j= 1; j <= 5; j++) {
	
		System.out.println("请输入第" + i +  "个班第" + j +"个学生的成绩");
		
		double score = myScanner.nextDouble();
		if(score >= 60) {
			bf++;
		}
		sum = sum + score;
		System.out.println("成绩为"+ score);
	 
	}
	System.out.println("平均分="+ sum/5);
	 sum3 += sum;
	}
	
     System.out.println("总分=" + sum3/15);
     System.out.println();
}
	
}