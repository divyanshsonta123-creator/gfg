class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        
    
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
          
            int need=sum-k;
            
            if(map.containsKey(need)){
               int window=i-map.get(need);
               max=Math.max(max,window);
               
            }
           
            
            if(map.containsKey(sum)==false){
                map.put(sum,i);
            }
            
           
          
            
            
        }
        
               
               return max;
        
    }
}
