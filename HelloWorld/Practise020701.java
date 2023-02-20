package bilibili;

public class Practise020701 {
public static void main(String[] args) {
	int sum = 0;
	int n = 0;
	for(int i = n; i <= 100 ; i++) {
	sum += i;
	if(sum > 20) {
		n = i;

			break;
		}
	}
	System.out.println("和>20的时候，当前数n=" + n);
	System.out.println("sum=" + sum );
	
}
}