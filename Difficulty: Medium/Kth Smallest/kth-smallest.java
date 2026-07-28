class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
       Arrays.sort(arr);
       return binary(arr,k-1);
       
       
    }
    static int binary(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            
            if(arr[mid]>arr[k]){
                end=mid-1;
                
            }
            else if(arr[mid]<arr[k]){
                start=mid+1;
                
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
