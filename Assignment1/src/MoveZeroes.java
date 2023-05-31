
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] nums = {0,1,0,3,120,1,0,3,12};
		
		int [] result = moveZeroes(nums);
		
		for (int i : result) {
			
			System.out.print(i+",");
			
		}

	}
	
	
	public static int[] moveZeroes(int[] array) {
		
		
		if(array.length ==0 || array.length == 1) {
			
			return array;
		}
		
		
		int nz=0,z=0;
		
		while(nz < array.length) {
			
			if( array[nz] !=0) {
				
				int temp = array[nz];
				
				array[nz] = array[z];
				
				array[z] = temp;
				
				nz++;
				z++;
				
			}else {
				
				nz++;
			}
			
		}
		
		
		return array;
	}

}
