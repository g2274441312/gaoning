package bilibili;

import java.util.Scanner;

public class Practise020505 {
public static void main(String[] args) {
	
 Scanner myScanner = new Scanner(System.in);
	char answer = ' ';
	do {
		System.out.println("还钱吗？y/n");
		answer = myScanner.next().charAt(0);
		System.out.println("他的回答是：" + answer);
	}while(answer != 'y');
		
     
	}
			
}
	

