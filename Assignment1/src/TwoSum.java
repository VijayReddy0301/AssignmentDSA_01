import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
	
	
	int [] nums = {2,7,11,15};

	int target = 9;
	
	int [] result = twoSum(nums, target);
	
	for (int i : result) {
		
		System.out.println(i);
	}
	
	}
	
	
	public static int[] twoSum(int[] nums,Integer target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int [] result = new int[2];
		
		for(int i = 0;i<nums.length;i++) {
			
			int secondEle = target - nums[i];
			
			if(map.containsKey(secondEle)) {
				
				result[0] = i;
				
				result[1] = map.get(secondEle);
				
				return result;
			}else {
				
				
				map.put(nums[i],i);
			}
		}
		
		
		return result;
		
	}
	
	
	

}
