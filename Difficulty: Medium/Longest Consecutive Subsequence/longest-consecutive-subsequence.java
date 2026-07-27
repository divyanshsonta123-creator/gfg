class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int temp=1;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==0){
                continue;
            }
            if(arr[i]-arr[i-1]==1){
                temp++;
                
            }
            else{
                count=Math.max(count,temp);
                temp=1;
            }
        }
         count=Math.max(count,temp);
         return count;
    }
}