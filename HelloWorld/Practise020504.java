package bilibili;

public class Practise020504 {
public static void main(String[] args) {
	
	int a = 1;
	
	while(a <= 100) {
		if(a % 3 == 0) {
			System.out.println("100以内能被3整除的数是：" + a);
		}
		a++;
	}
	int b = 40;
	while(b <= 200) {
		if(b % 2 == 0) {
			System.out.println("40-200以内能被2整除的数是：" + b);
		}
		b++;
	}
}
}
