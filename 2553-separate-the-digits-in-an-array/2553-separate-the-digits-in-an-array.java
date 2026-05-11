class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int x : nums) {
            List<Integer> temp = new ArrayList<>();
            while(x > 0) {
                temp.add(x % 10);
                x /= 10;
            }
            for(int i = temp.size() - 1; i >= 0; i--) {
                al.add(temp.get(i));
            }
        }
        int[] arr = new int[al.size()];
        for(int i = 0; i< al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}