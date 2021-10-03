class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        if(m == 0){
            for(int i = 0;i<n;i++)
                nums1[i] = nums2[i];
            return;
        }
        int runner1 = m-1;
        int runner2 = n-1;
        int runner = n+m-1;
        while(runner1 >= 0 && runner2 >= 0){
            if(nums1[runner1] > nums2[runner2]){
                nums1[runner] = nums1[runner1];
                runner1--;
                runner--;
            }else{
                nums1[runner] = nums2[runner2];
                runner2--;
                runner--;
            }
        }
        
        while(runner1 >= 0){
            nums1[runner] = nums1[runner1];
            runner--;
            runner1--;
        }
        
        while(runner2 >= 0){
            nums1[runner] = nums2[runner2];
            runner--;
            runner2--;
        }
    }
}
