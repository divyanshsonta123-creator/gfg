import java.util.*;
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=1;j<arr.length;j++){
           if( arr[i]!=arr[j]){
              arr[i+1]=arr[j];
              
               i++;
           }
            
        }
        for(int j=0;j<i+1;j++){
             list.add(arr[j]);
            
        }
        return list;
    }
}
