package lou.study.letcode;

// accepted. note: int -> double
public class Median {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length == 0 && nums2.length == 0) return 0;

            int totalNum = nums1.length + nums2.length;
            if (totalNum % 2 == 0) {
                return evenMedian(nums1, nums2);
            }
            return oddMedian(nums1, nums2);

        }

        private double oddMedian(int[] nums1, int[] nums2) {
            int totalNum = nums1.length + nums2.length;
            int mid = totalNum / 2;
            if (nums1.length == 0) {
                return nums2[mid];
            }
            if (nums2.length == 0) {
                return nums1[mid];
            }
            int i = 0;
            int j = 0;
            while (mid > 0) {
                if (i == nums1.length) {
                    return nums2[j + mid];
                }
                if (j == nums2.length) {
                    return nums1[i + mid];
                }
                if (nums1[i] > nums2[j]) {
                    ++j;
                } else {
                    ++i;
                }
                --mid;
            }
            if (i == nums1.length) return nums2[j];
            if (j == nums2.length) return nums1[i];
            return nums1[i] < nums2[j] ? nums1[i] : nums2[j];
        }

        private double evenMedian(int[] nums1, int[] nums2) {
            int totalNum = nums1.length + nums2.length;
            int mid = totalNum / 2;
            if (nums1.length == 0) {
                return (double) (nums2[mid - 1] + nums2[mid]) / 2;
            }
            if (nums2.length == 0) {
                return (double) (nums1[mid - 1] + nums1[mid]) / 2;
            }

            if (mid == 1) {
                return (double) (nums1[0] + nums2[0]) / 2;
            }
            int i = 0;
            int j = 0;
            while (mid > 1) {
                --mid;
                if (i == nums1.length) {
                    return (double) (nums2[j + mid] + nums2[j + mid + 1]) / 2;
                }
                if (j == nums2.length) {
                    return (double) (nums1[i + mid] + nums1[i + mid + 1]) / 2;
                }
                if (nums1[i] > nums2[j]) {
                    ++j;
                } else {
                    ++i;
                }
            }
            if (i == nums1.length) {
                return (double) (nums2[j] + nums2[j + 1]) / 2;
            }
            if (j == nums2.length) {
                return (double) (nums1[i] + nums1[i + 1]) / 2;
            }
            int smallOne, bigOne;
            if (nums1[i] < nums2[j]) {
                smallOne = nums1[i];
                ++i;
            } else {
                smallOne = nums2[j];
                ++j;
            }
            if (i == nums1.length) {
                return (double) (smallOne + nums2[j]) / 2;
            }
            if (j == nums2.length) {
                return (double) (smallOne + nums1[i]) / 2;
            }
            bigOne = nums1[i] < nums2[j] ? nums1[i] : nums2[j];
            return (double) (smallOne + bigOne) / 2;

        }
    }
}
