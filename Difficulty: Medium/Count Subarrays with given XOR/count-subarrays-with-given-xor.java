class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
     HashMap<Integer,Integer> map=new HashMap<>();
     map.put(0,1);
     int count=0;
     int xor=0;
     
      
     for(int i=0;i<arr.length;i++){
         xor=xor^arr[i];
        int need=xor^k;
        if(map.containsKey(need)){
            count+=map.get(need);
        }
       
    map.put(xor,map.getOrDefault(xor,0)+1);
        
     }
     return count;
     
    }
}