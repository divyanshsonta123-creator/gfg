class Solution {
    int maxProduct(int[] arr) {
        // code here
    
    // IDEA: Maximum product subarray
    // Keep product from LEFT (prefix) and RIGHT (suffix).
    // Why both? Negative numbers can make the maximum product
    // appear when multiplying from either direction.

    int product = Integer.MIN_VALUE;
    int pre = 1;   // Prefix product
    int suff = 1;  // Suffix product

    for (int i = 0; i < arr.length; i++) {

        // 0 breaks the subarray.
        // Start a NEW product after 0.
        if (pre == 0)
            pre = 1;

        if (suff == 0)
            suff = 1;

        // Product from LEFT
        pre = pre * arr[i];

        // Product from RIGHT
        suff = suff * arr[arr.length - i - 1];

        // Take the best product found so far
        product = Math.max(product, Math.max(pre, suff));
    }

    return product;
}
        
    
    
        
       
    
}