class Solution {
    int missingNum(int arr[]) {
        int hi[]=sort(arr);
        return missing(hi);
        // code here
        
    }
    public static int[] sort(int arr[]){
        int i=0;
      while(i<arr.length){
          int correct=arr[i]-1;
          if(arr[i]<arr.length  &&  arr[i]!=arr[correct]){
              swap(arr,correct,i);
             
          }
         else{
              i++;
         }
          
      }
        return arr;
    }
    public static int missing(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
            
        }
        return arr.length+1;
        
    }
    
    
    
    
    public static void swap(int arr[],int correct, int i){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
        
    }
    
}