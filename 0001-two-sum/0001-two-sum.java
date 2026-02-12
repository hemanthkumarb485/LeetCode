// class Solution {
//     public int[] twoSum(int[] n, int t) {
//         int[] a = new int[2];
//         for(int i = 0;i < n.length;i++){
//             for(int j = i+1;j < n.length;j++){
//                 if(n[i]+n[j] == t){
//                     a[0] = i;
//                     a[1] = j;
//                     return a;
//                 }
//             }
//         }
//         return a;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 1;i < n;i++){
            for(int j = i;j < n;j++){
                if(nums[j - i] + nums[j] == target){
                    return new int[] {j-i,j};
                }
            }
        }
        return null;
    }
}























// class Solution {
//     public int[] twoSum(int[] n, int t) {
//         int arr[]={-1,-1};
//         for(int i = 0;i < n.length;i++){
//             for(int j = 0;j < n.length;j++){
//                 if (i != j){
//                 if(n[i] + n[j] == t){
//                     arr[0]=i;
//                     arr[1]=j;
//                     return arr;
//                 }}
//             }
//     }
//     return arr;
// }}