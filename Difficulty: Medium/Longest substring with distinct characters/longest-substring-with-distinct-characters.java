class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)==false){
                
                
                
                  map.put(ch,j);
                  
                  j++;
                  
                
            }
            else{
                
                
                int window=j-i;
                max=Math.max(window,max);
                
                  
                
                if(map.get(ch) >= i){
                   i=map.get(ch)+1;
                    
                }
                 map.put(ch,j);
                
              
                
                j++;
                
            }
            
              int window=j-i;
                max=Math.max(window,max);
            
        }
          
            
            
        return max;
    }
}