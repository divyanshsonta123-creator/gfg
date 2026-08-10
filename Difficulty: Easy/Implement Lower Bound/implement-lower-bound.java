class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int start=0;
        int ans=arr.length;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
           
            if(arr[mid]>=target){
                 end=mid-1;
                ans=mid;
            }
            else{
                start=mid+1;
            }
          
           
            
        }
        return ans;
    }
}
