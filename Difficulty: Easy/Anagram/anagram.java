class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            
        }
        
        // for(char ans: map.keySet()){
        //     if(map.get(ans)==false){
        //         return false;
        //     }
        //     else if(map.get(ch)==0){
        //         return false;
        //     }
        //     map.put(ch,map.get(ch)-1);
        // }
        
        for(int i=0;i<s2.length();i++){
            char ans= s2.charAt(i);
            if(map.containsKey(ans)==false){
                return false;
            }
            
            if(map.get(ans)<=0){
                return false;
            }
            
            map.put(ans,map.get(ans)-1);
            
        }
        return true;
        
    }
}