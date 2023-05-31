
public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,2,3,0,0,0};
		
		int[] nums2 = {2,5,6};
		
		int m=3,n=3;
		
		int [] result =mergeArrays(nums1, nums2, m, n);
		
		for (int i : result) {
			
			System.out.println(i);
			
		}

	}
	
	public static int[] mergeArrays(int[] nums1,int [] nums2 ,int m,int n) {
	
		int [] copy = new int[m+n];
		
		int j=0;
		for (int i : nums1) {
			
			copy[j] = i;
			j++;
		}
		
		int p1=0,p2=0;
		
		for(int i =0;i<m+n;i++) {
			
			if(copy[p1]<nums2[p2]&& p1<m) {
				
				nums1[i] = copy[p1];
				
				p1++;
			}else {
				
				nums1[i]=nums2[p2];
				
				p2++;
			}
			
			
		}
		
		
		
		return nums1;
	}

}
