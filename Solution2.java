class Solution2 {
    public int minimumSize(int[] nums, int maxOperations) {
        int max = Arrays.stream(nums).max().getAsInt();
        int low = 1;
        int high = max;

        int result = Integer.MAX_VALUE;
        while (low < high) {
            int mid = low + (high - low) / 2;

            int totalOperations = 0;
            for (int num: nums) {
                totalOperations += ((num - 1) / mid);
            }

            if (totalOperations <= maxOperations) {
                result = Math.min(result, mid);
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return result < Integer.MAX_VALUE ? result : max;
    }
}