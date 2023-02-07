package bilibili;
public class Practise020701 {
public static void main(String[] args) {
	int line = 10;
	for(int i = 1; i <= line; i++) {		
		for(int k = 1; k <= line - i; k++) {
			System.out.print(" ");
		}	
		
		for(int j = 1; j <= 2 * i - 1; j++) {
			if(j == 1 || j == 2 * i - 1|| i == line) {
							
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		}
		System.out.print("\n");
	}	
}
}
