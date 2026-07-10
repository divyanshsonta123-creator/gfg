class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
           if(map.containsKey(ch)){
               int freq= map.get(ch);
               
               map.put(ch,freq+1);
           }
           else{
               map.put(ch,1);
           }
        }
           
           int max=0;
           char ans=' ';
          for( char ch : map.keySet()){
              if(map.get(ch)>max){
                  max=map.get(ch);
                  ans=ch;
              }
              if(max==map.get(ch) && ch<=ans){
                  
                  ans=ch;
              }
              
              
          }
          return ans;
        
        
    }
}