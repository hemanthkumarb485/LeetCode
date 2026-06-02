import java.util.*;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        List<Integer> al = new ArrayList<>(hs);
        al.sort(Collections.reverseOrder());
        int n = Math.min(k, al.size());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}