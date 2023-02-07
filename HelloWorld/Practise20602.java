package bilibili;
//乘法口诀表
public class Practise20602 {
public static void main(String[] args) {
	int b = 1;
	for(int c = 1 ;c <=9; c++){
	for(int i = b;i <=9;i++) {
		int ii = b * i;
		System.out.println(b + "*"+ i + "=" + ii);
	}
	b++;
}
	
}
}
