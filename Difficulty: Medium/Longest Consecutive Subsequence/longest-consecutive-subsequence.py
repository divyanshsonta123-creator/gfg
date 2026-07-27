class Solution:
    def longestConsecutive(self, arr):
        arr.sort()
        count = 1
        temp = 1
        for i in range(0,len(arr)-1):
            if arr[i+1] == arr[i] :
                continue
            elif arr[i+1] - arr[i] == 1 :
                temp = temp + 1
            else :
                count = max(temp, count)
                temp = 1
        count = max(temp,count)
        return count
       
        
         
                
             