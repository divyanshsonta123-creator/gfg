class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        List<Integer> hi=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++ ){
            
             
            int need=target-arr[i];
          
            
            if(map.containsKey(need)){
               hi.add(arr[i]);
               hi.add(need);
            }
            
              
             if(map.containsKey(need)==false){
                 map.put(arr[i],i);
            }
           
               
            
        }
        
        return hi;
        
    }
}