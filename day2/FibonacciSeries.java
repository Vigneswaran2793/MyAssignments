package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		    int range = 8;
	        int firstNum = 0;
	        int secondNum = 1;
	        int sum;
	     
	        System.out.println(firstNum);
	          for (int i = 1; i <= range; i++) {
	        	  sum = firstNum+secondNum;
		            firstNum = secondNum;
		            sum=secondNum;
		            System.out.println(sum);
	        	}
	        
		}
}
