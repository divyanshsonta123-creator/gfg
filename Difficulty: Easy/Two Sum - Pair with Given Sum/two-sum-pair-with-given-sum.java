class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem= target-arr[i];
            if(set.contains(rem)){
                return true;
                
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}