package bilibili;

import java.util.Scanner;

public class Practise020404 {

	public static void main(String[] agrs) {
		  
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入当前的月份（1-12）");
		int month = myScanner.nextInt();
		if(month <= 12 && month >= 1 ) {
		if(month >= 4 && month <= 10) {
			System.out.println("当前是旺季");
			System.out.println("请输入顾客年龄");
			Scanner ageScanner = new Scanner(System.in);
			int age = ageScanner.nextInt();
           if(age >= 18 && age <= 60) {
				System.out.println("您所需要支付的票价是60元");
			}else if(age < 18 && age > 0) {
				System.out.println("您所需要支付的票价是30元");
			}else if(age > 60 && age < 125) {
				System.out.println("您所需要支付的票价是20元");
			}else {
				System.out.println("捣乱的叉出去");
			}
		}else {
	        Scanner age1Scanner = new Scanner(System.in);
	        int age1 = age1Scanner.nextInt();
			System.out.println("当前是淡季");
			if(age1 >= 18 && age1 <= 60) {
				System.out.println("您所需要支付的票价是40元");
			}else if(age1 < 125 && age1 > 0) {
				System.out.println("您所需要支付的票价是20元");
		    }else {
			System.out.println("捣乱的叉出去");
		    }
		    }
		    }else
			System.out.println("请输入有效月份");
		     }
	  }

	 

