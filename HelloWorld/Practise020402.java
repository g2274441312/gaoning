package bilibili;

import java.util.Scanner;

public class Practise020402 {
	

public static void main(String[] agrs) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入年份");
     int year = myScanner.nextInt();
    		
     if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0 ) {
    	 System.out.println("是闰年");
     }else {
    	 System.out.println("不是闰年");
     }
    	 
}
    
}
