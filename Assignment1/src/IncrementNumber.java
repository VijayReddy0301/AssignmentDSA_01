

// QUESTION_04
public class IncrementNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {9,9,9};
		
		int [] result =incrementNumberInArray(nums);
		
		for (int i : result) {
			
			System.out.print(i);
		}

	}
	
	public static int[] incrementNumberInArray(int[] nums) {
		
		for(int i = nums.length-1;i>=0;i--) {
			
			if(nums[i] < 9) {
				
				 nums[i]++;
				 
				 return nums;
			}else {
				
				nums[i] =0;
			}
			
		}
		
		
		
		nums = new int[nums.length+1];
		
		nums[0] = 1;
		
		return nums;
	}

}
