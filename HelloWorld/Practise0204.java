package bilibili;

public class Practise0204 {
  public static void main(String[] args) {
	
	  
	  int x = 5; 
	  int y = 10;
	  int xy = x + y;
	  if((x + y) % 3 == 0 && (x = y) % 5 == 0) {
		  System.out.println("x和y的和是："+ xy +",可以被3整除，也可以被5整除");
		  
	  }else {
		  System.out.println("x和y的和不能被3和5整除");
	  }
			  
}
}
