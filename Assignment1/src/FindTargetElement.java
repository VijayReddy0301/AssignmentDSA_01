
public class FindTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,3,5,6};
		
		int element = 4;
		
		findElement(nums, element);

	}
	
	public static void findElement(int[] nums,Integer element) {
		
		int low = 0, high=nums.length-1,mid=0;
		
		boolean flag = true;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			
			
			
			if(nums[mid]== element) {
				
				System.out.println("Element found At Index :: " +mid);
				flag = false;
				break;
				
			}else if(nums[mid]<element) {
				
				low = mid+1;
			}else {
				
				high= mid-1;
			}
			
			
		}
		
		if(flag) {
			
			System.out.println("Element Not Found but if it wouuld be at Index :: " +mid);
		}
		
		
		
	}

}
