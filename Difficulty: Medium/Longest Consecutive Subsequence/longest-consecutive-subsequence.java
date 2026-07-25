class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            
        }
        int max=0;
        for(int ele : set ){
            if(set.contains(ele-1)==false){
                int x=ele;
                int count=1;
                while(set.contains(x+1)){
                    x=x+1;
                    count=count+1;
                    
                }
                 max=Math.max(max,count);
            }
           
        }
        return max;
    }
}