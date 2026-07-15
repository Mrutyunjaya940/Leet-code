class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expected=n*(n+1)/2; //in this we calculate the total or maximum num

        int actualsum=0; // here we store the total arrays sum

        for(int num: nums){
            actualsum= actualsum+num; //here we calculate
        }

        return expected-actualsum;

    }
}