package com.tan.programmingparadigm;
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one
// sorted array.
//
// The number of elements initialized in nums1 and nums2 are m and n respectivel
//y. You may assume that nums1 has a size equal to m + n such that it has enough s
//pace to hold additional elements from nums2.
//
//
// Example 1:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//
//
// Constraints:
//
//
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[i] <= 109
//
// Related Topics Array Two Pointers
// 👍 3252 👎 4903

public class Sort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int current2=n;
        int current1=m;
        int i=1;
        while (current2>0){
         if (nums1[current1]>nums2[current2]){
           nums1[m+n-i]=nums1[current1];
           --current1;
         }else if (nums1[current1]==nums2[current2]){
             nums1[m+n-i]=nums1[current1];
             nums1[m+n-i-1]=nums1[current2];
             --current1;
             --current2;
         }else {
             nums1[m+n-i]=nums1[current2];
             --current2;
         }
         ++i;
        }

    }
}
