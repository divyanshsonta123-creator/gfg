class Solution {
    public void sort012(int[] arr) {
        // code here
        if(arr.length!=1){
            sort(arr);
        }
        else{
            return;
        }
    }
    public static void  sort(int arr[]){
        int mid=0;
        int i=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,i,mid);
                i++;
                mid++;
                
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,end,mid);
                end--;
            
            }
            
        }
    }
    public static void swap(int arr[],int inc,int correct){
        int temp=arr[inc];
        arr[inc]=arr[correct];
        arr[correct]=temp;
    }
}