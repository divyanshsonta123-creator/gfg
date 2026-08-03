class Solution {
    public int inversionCount(int arr[]) {
        count=0;
        sort(arr);
        return count;
        
      
    }
    static int count =0;
      // recursive merge sort
    static int[] sort(int arr[]){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int left[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    // merge two sorted arrays
    static int[] merge(int left[], int right[]){

        int i = 0;
        int j = 0;
        int k = 0;

        int ans[] = new int[left.length + right.length];

        while(i < left.length && j < right.length){

            if(left[i] <= right[j]){
                ans[k++] = left[i++];
            }
            else{
                ans[k++] = right[j++];
                count+=left.length-i;
                 
            }
        }

        while(i < left.length){
            ans[k++] = left[i++];
        }

        while(j < right.length){
            ans[k++] = right[j++];
        }

        return ans;
    }
}