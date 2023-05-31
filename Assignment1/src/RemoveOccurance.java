
public class RemoveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3,2,2,3};
		
		int value = 3;
		
		removeOccurance(nums, value);

	}
	
	
	public static void removeOccurance(int[] nums,Integer value) {
		
		int j =0;
		for(int i:nums) {
			
			if(i != value) {
				
				nums[j] = i;
				j++;
			}
		}
		
		
		System.out.println("Number of elements in nums which are not equal to val :: " +j);
		
		System.out.println();

		for(int k:nums) {
			
			System.out.print(k);
		}
		
		
		
		
		
	}

}
