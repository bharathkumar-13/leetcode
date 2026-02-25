class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // 🔥 very important

        int[] arr = new int[k];

        // store last k elements
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // copy back stored elements
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}