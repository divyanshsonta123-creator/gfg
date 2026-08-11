class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int z=lower(arr,x);
        int h=upper(arr,x);
        list.add(z);
        list.add(h);
        return list;
        
    }
    static int lower(int arr[],int target){
        int start=0;
        int ans=-1;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==target){
                 end=mid-1;
                 ans=mid;
             }
              else if(arr[mid]>target){
                       end=mid-1;
              }
             else{
                 start=mid+1;
             }
         }
         return ans;
    }
     static int upper(int arr[],int target){
        int start=0;
        int ans=-1;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==target){
                 start=mid+1;
                 ans=mid;
             }
             else if(arr[mid]<target){
                 start=mid+1;
                 
             }
             else{
                 end=mid-1;
             }
         }
         return ans;
    
}
}
