package week1.day2;

public class ArrayIntersection {

public static void main(String[] args) {
		
		int Arr1 [] = {3,2,11,4,6,7};
		int Arr2 [] = {1,2,8,4,9,7};
		
		
		for (int i = 0; i < Arr1.length; i++) {
			
			
			for (int j = 0; j < Arr2.length; j++) {
				
				//Compare Both the arrays using a condition statement
				if(Arr1[i]==Arr2[j]) {
					
				System.out.println(Arr1[i]);
				}
			}
		}
}
}
