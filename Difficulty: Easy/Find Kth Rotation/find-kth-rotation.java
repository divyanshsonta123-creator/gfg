class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        return pivotIndex(arr);
        
    }
    int pivotIndex(int[] arr) {

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {

        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[end]) {
            // Pivot is on RIGHT
            start = mid + 1;
        }
        else {
            // Pivot is at mid or on LEFT
            end = mid;
        }
    }

    return start;
}
}