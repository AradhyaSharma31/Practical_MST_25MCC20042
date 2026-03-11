class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n < 3) {
            return 0;
        }

        int max = 0;
        for(int i = 1; i < n - 1; i++){
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int l = i;
                int r = i;

                while (l > 0 && arr[l - 1] < arr[l]) {
                    l--;
                }

                while (r < n - 1 && arr[r + 1] < arr[r]) {
                    r++;
                }

                max = Math.max(r - l + 1, max);
            }
        }

        return max >= 3 ? max : 0;
    }
}