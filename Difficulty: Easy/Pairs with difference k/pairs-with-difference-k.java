class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> set =new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(set.containsKey(arr[i])){
               int freq=set.get(arr[i]);
               set.put(arr[i],freq+1);
           }
           else{
               set.put(arr[i],1);
               
           }
        }
        
        for(int ele: set.keySet()){
            int rem=ele-k;
            // int hi=ele+k;
            if(set.containsKey(rem)){
                count += set.get(ele) * set.get(rem);
            }
            // if(set.containsKey(hi)){
            //     count+=set.get(hi);
            // }
           
        }
        return count;
    }
}