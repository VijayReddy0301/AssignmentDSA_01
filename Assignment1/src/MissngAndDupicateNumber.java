
public class MissngAndDupicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {1,2,2,4};
		
		
		int freq[] = new int[nums.length+1];
		
		for (int i : nums) {
			
			freq[i]++;
		}
		
		int dup=0,missing=0;
		
		for(int i=1;i<freq.length;i++) {
			
			
			if(freq[i] == 2) dup=i;
			
			if(freq[i]==0 ) missing=i;
			
			if(dup !=0 && missing != 0) break;
			
		}
		
		int [] result = {dup,missing};
		
		System.out.print("[");
		
		for (int i : result) {
			System.out.print(i +" ");
		}
		
		System.out.print("]");
	}
	

}
