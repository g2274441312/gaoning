package bilibili;

public class Practise020703 {
public static void main(String[] args) {
	double money= 100000;
	
	int b = 1000;
	int f = 0;
	while(true){
		if(money >50000) {
			money = money - money * 0.05;
	     
	     f++;
		
	}else if(money >= 1000) {
		
	
		
  	   money-=1000;
		f++;
	
	}else {
		break;
		
	
}
		
}
	System.out.println(money);
	System.out.println(f);
 }}