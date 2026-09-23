class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0;
        int left=0;
        int Minlength=nums.length+1;
        for(int right=0; right<nums.length; right++)
        {
            sum=sum+nums[right];
            while(sum >= target)
            {
                int lengthh = right - left +1;

                if(lengthh < Minlength)
                {
                    Minlength=lengthh;
                }
                sum= sum - nums[left];
                left++;
            }
        }
        if(Minlength == nums.length+1)
        {
            return 0;
        }
        return Minlength;
    }
}