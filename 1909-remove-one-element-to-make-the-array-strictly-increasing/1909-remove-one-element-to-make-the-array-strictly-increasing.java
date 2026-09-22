class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            List<Integer>al=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                al.add(nums[j]);
            }
            if(sorted(al)){
                return true;
            }
        }
        return false;
    }
    public boolean sorted(List<Integer>al){
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)) return false;
        }
        return true;
    }
}