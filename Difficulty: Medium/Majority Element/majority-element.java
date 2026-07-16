class Solution {
    int majorityElement(int arr[]) {
        int ans=-1;
        if(arr.length==1){
            return arr[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
          }
          else{
            map.put(arr[i],1);
          }
        }
        int max=1;
        for(int ele: map.keySet()){
            if(max<map.get(ele)){
                max=map.get(ele);
                ans=ele;
            }
            
        }
         if(max > arr.length/2){
            return ans;
        }
        return -1;
        // code here
        
    } 

}