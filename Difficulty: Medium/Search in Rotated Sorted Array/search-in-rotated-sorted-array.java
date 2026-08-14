class Solution {
    int search(int[] arr, int key) {
        // code here
        return linear(arr,key);
        
    }
   static int linear(int arr[],int target){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               return i;
           }
       }
       return -1;
   }
}
