class Solution {
    int getSingle(int arr[]) {
        // code here
        int i=0;
        for(int j=1;j<arr.length;j++){
            arr[i]=arr[j]^arr[i];
            
        }
        return arr[i];
    }
}