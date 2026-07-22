class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        
        int max=Integer.MIN_VALUE;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
               max=arr[i];
                list.add(arr[i]);
                
            }
             
        }
        Collections.reverse(list);
        return list;
        
    }
}
