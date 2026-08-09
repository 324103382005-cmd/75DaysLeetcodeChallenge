import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m - 1;
        int first = 0;

        while (last >= 0 && first < n) {
            if (nums1[last] > nums2[first]) {
                int temp = nums1[last];
                nums1[last] = nums2[first];
                nums2[first] = temp;

                last--;
                first++;
            } else {
                break;
            }
        }

        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }
}