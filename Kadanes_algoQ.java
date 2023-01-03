public class Kadanes_algoQ {
    
    static int largestSumSubArray(int a[]) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i<a.length; i++) {
			curSum += a[i];
			if(maxSum<curSum) maxSum = curSum;
			if(curSum<0) curSum=0;		
		}
		return maxSum;
	}

	public static void main(String[] args) {

		//MAXIMUM SUM OF SUBARRAY , HERE SUBARRAY MEANS SUB PART OF AN ARRAY
		//int a[] = {-2,7,-6,4,1,-3,8};
		int a[] = {6,-7,4,-2,1,5,-4};
		int ans = largestSumSubArray(a);
		System.out.println(ans);
		

	}

}
