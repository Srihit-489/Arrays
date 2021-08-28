class Solution {
    public int findNumbers(int[] nums) {
        int prev = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(num);
           // System.out.println(sb.toString());
            if((sb.length() - prev)%2 == 0)
                count++;
            prev = sb.length();
        }
        return count;
        
    }
}
