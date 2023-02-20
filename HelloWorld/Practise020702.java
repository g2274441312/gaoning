package bilibili;

import java.util.Scanner;

public class Practise020702 {
public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	String  name = "";
    String passwd = "";
	 int chance = 3;
	for( int i = 2; i >= 0; i--) {
		System.out.println("请输入用户名：");
        name = myScanner.next();
        System.out.println("请输入密码：");
	      passwd = myScanner.next();
	    	
	 	if("丁真".equals(name)&& "666".equals(passwd)) {
			System.out.println("恭喜你,登陆成功~");
            break;
		}chance--;
	   System.out.println("请输入正确的密码，您还有第"+ chance+"次机会");
           
		}
}}