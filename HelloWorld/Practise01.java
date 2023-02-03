package bilibili;

import java.util.Scanner;

public class Practise01 {
	public static void main(String[] args) {
 /*演示接受用户的输入
 * 步骤
 * Scanner类 表示 简单文本扫描器，在java.util包
 * 1.引入/导入 Scanner类所在的包
 * 2.创建Scanner对象，new创建一个对象，体会myScanner就是Scanner类的对象 
 * */
     Scanner myScanner = new Scanner(System.in);
// 3.接收用户输入了，使用相关的方法
       System.out.println("请输入名字");
       //当程序执行到 next 方法时，会等待用户输入
       String name = myScanner.next(); //接收用户输入字符串
       System.out.println("请输入年龄");
       int age = myScanner.nextInt(); //接收用户输入int
       System.out.println("请输入薪水");
       double sal = myScanner.nextInt(); //接收用户输入double
       System.out.println("人的信息如下");
       System.out.println("name=" + name + "age=" + age + "sal=" + sal);
	}
}
  