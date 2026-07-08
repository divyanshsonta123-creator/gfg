
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        if(a.length<b.length){
            return false;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
         HashMap<Integer,Integer> set= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int freq=map.get(a[i]);
                map.put(a[i],freq+1);
            }
            else{
                map.put(a[i],1);
            }
        }
           for(int i=0;i<b.length;i++){
            if(set.containsKey(b[i])){
                int freq=set.get(b[i]);
                set.put(b[i],freq+1);
            }
            else{
                set.put(b[i],1);
            }
           }
           for(int hi:set.keySet()){
              
               int bfreq= set.get(hi);
               if(map.get(hi)==null){
                   return false;
               }
               
               int afreq=map.get(hi);
               
               if(afreq<bfreq){
                   return false;
               }
               
           }
           return true;
        
       
      
}
}
