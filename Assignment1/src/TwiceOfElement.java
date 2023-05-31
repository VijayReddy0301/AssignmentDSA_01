import java.util.Arrays;

//QUESTION_06

public class TwiceOfElement {

	public static void main(String[] args) {
		
		
		int[] array = {1,2,3,4};
		
		boolean result = twiceElement(array);
		
		System.out.println(result);

	}
	
	public static boolean twiceElement(int[] array) {
		
		
		Arrays.sort(array);
		
		for(int i =0;i<array.length-1;i++) {
			
			if(array[i] == array[i+1]) {
				
				return true;
			}
			
		}
		
		return false;
	}

}
