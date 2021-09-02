class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> myhash = new HashMap<Integer,Boolean>();
        for(int num : nums1){
            if(!myhash.containsKey(num)){
                myhash.put(num,false);
            }
        }
        int count = 0;
        for(int num : nums2){
            if(myhash.containsKey(num) && !myhash.get(num)){
                myhash.put(num,true);
                count++;
            }
        }
        int[] ret = new int[count];
        int runner = 0;
        for(int num : myhash.keySet()){
            if(myhash.get(num)){
                ret[runner] = num;
                runner++;
            }
        }
        
        return ret;
    }
}
