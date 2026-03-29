class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        if(arr[0] != arr1[0] || arr[2] != arr1[2]){
            char temp = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;
        }
        if(arr[1] != arr1[1] || arr[3] != arr1[3]){
            char temp = arr[1];
            arr[1] = arr[3];
            arr[3] = temp;
        }
        String r = new String(arr);
        if(r.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}