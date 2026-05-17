class Solution {
    public int findSpecialInteger(int[] arr) {
        int c = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                c++;
            }
            else {
                c = 1;
            }
            if(arr.length / 4 < c) {
                return arr[i];
            }
        }
        
        return arr[0];
    }
}