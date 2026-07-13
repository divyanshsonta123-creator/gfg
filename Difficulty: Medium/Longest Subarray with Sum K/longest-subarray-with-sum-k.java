class Solution {
    public int longestSubarray(int[] arr, int k) {

        // key   -> Prefix Sum
        // value -> First index where this prefix sum occurred
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum before array starts
        // Helps when subarray starts from index 0
        map.put(0, -1);

        int prefix = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){

            // ------------------------------------
            // Step 1 : Calculate Prefix Sum
            // ------------------------------------
            prefix += arr[i];

            // ------------------------------------
            // Step 2 : Find required prefix
            //
            // CurrentPrefix - PreviousPrefix = k
            //
            // PreviousPrefix = CurrentPrefix - k
            // ------------------------------------
            int need = prefix - k;

            // ------------------------------------
            // Step 3 : If required prefix exists,
            // subarray sum = k
            // ------------------------------------
            if(map.containsKey(need)){

                // Length of current valid subarray
                int len = i - map.get(need);

                max = Math.max(max, len);
            }

            // ------------------------------------
            // Step 4 : Store ONLY first occurrence
            //
            // Why?
            //
            // Longest Length =
            // CurrentIndex - PreviousIndex
            //
            // We want PreviousIndex as SMALL as possible.
            //
            // So never overwrite the first occurrence.
            // ------------------------------------
            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }
        }

        return max;
    }
}