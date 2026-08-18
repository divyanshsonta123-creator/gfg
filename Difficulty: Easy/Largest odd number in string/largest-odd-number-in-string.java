class Solution {
    public String maxOdd(String num) {
        // code here
        for(int i=num.length()-1;i>=0;i--){
            int z=(int)(num.charAt(i)-'0');
            if(z%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
        
    }
}