#include <stdlib.h>
#include <math.h>

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int threeSumClosest(int* nums, int numsSize, int target) {
    // Sort the array.
    qsort(nums, numsSize, sizeof(int), compare);

    // Assume the first three elements give the closest sum initially.
    int closestSum = nums[0] + nums[1] + nums[2];

    // Fix one element at a time.
    for (int i = 0; i < numsSize - 2; i++) {
        int left = i + 1;
        int right = numsSize - 1;

        // Find the best pair for nums[i].
        while (left < right) {
            int currentSum = nums[i] + nums[left] + nums[right];

            // Update closest sum if needed.
            if (abs(target - currentSum) < abs(target - closestSum)) {
                closestSum = currentSum;
            }

            // Exact answer found.
            if (currentSum == target) {
                return target;
            }
            // Need a larger sum.
            else if (currentSum < target) {
                left++;
            }
            // Need a smaller sum.
            else {
                right--;
            }
        }
    }

    return closestSum;
}