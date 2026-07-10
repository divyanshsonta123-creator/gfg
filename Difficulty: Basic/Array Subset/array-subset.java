
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map= new HashMap<>();
        HashMap<Integer,Integer> set=new HashMap<>();
        
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
        for(int c : set.keySet()){
            
            if(map.containsKey(c)==false){
                
                return false;
            }
            int afreq=map.get(c);
            int bfreq=set.get(c);
            
            if(afreq<bfreq){
                return false;
            }
            
        }
        return true;
        
    }
}
