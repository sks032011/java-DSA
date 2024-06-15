//PASCAL TRIANGLE 
//OPTIMAL

// import java.util.*;

// public class tUf {
//     public static List<Integer> generateRow(int row) {
//         long ans = 1;
//         List<Integer> ansRow = new ArrayList<>();
//         ansRow.add(1); //inserting the 1st element

//         //calculate the rest of the elements:
//         for (int col = 1; col < row; col++) {
//             ans = ans * (row - col);
//             ans = ans / col;
//             ansRow.add((int)ans);
//         }
//         return ansRow;
//     }

//     public static List<List<Integer>> pascalTriangle(int n) {
//         List<List<Integer>> ans = new ArrayList<>();

//         //store the entire pascal's triangle:
//         for (int row = 1; row <= n; row++) {
//             ans.add(generateRow(row));
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         List<List<Integer>> ans = pascalTriangle(n);
//         for (List<Integer> it : ans) {
//             for (int ele : it) {
//                 System.out.print(ele + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// ---------------------------------------------------------------------

// MAJORITY ELEMT >N/3
// OPTIMAL 

// import java.util.*;

// public class tUf {
//     public static List<Integer> majorityElement(int []v) {
//         int n = v.length; //size of the array

//         int cnt1 = 0, cnt2 = 0; // counts
//         int el1 = Integer.MIN_VALUE; // element 1
//         int el2 = Integer.MIN_VALUE; // element 2

//         // applying the Extended Boyer Moore's Voting Algorithm:
//         for (int i = 0; i < n; i++) {
//             if (cnt1 == 0 && el2 != v[i]) {
//                 cnt1 = 1;
//                 el1 = v[i];
//             } else if (cnt2 == 0 && el1 != v[i]) {
//                 cnt2 = 1;
//                 el2 = v[i];
//             } else if (v[i] == el1) cnt1++;
//             else if (v[i] == el2) cnt2++;
//             else {
//                 cnt1--; cnt2--;
//             }
//         }

//         List<Integer> ls = new ArrayList<>(); // list of answers

//         // Manually check if the stored elements in
//         // el1 and el2 are the majority elements:
//         cnt1 = 0; cnt2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (v[i] == el1) cnt1++;
//             if (v[i] == el2) cnt2++;
//         }

//         int mini = (int)(n / 3) + 1;
//         if (cnt1 >= mini) ls.add(el1);
//         if (cnt2 >= mini) ls.add(el2);

//         // Uncomment the following line
//         // if it is told to sort the answer array:
//         //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

//         return ls;
//     }

//     public static void main(String args[]) {
//         int[] arr = {11, 33, 33, 11, 33, 11};
//         List<Integer> ans = majorityElement(arr);
//         System.out.print("The majority elements are: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

// --------------------------------------------------------------

// 3SUM PROBLEM

// BETTER

// import java.util.*;

// public class tUf {
//     public static List<List<Integer>> triplet(int n, int[] arr) {
//         Set<List<Integer>> st = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             Set<Integer> hashset = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
//                 //Calculate the 3rd element:
//                 int third = -(arr[i] + arr[j]);

//                 //Find the element in the set:
//                 if (hashset.contains(third)) {
//                     List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                     temp.sort(null);
//                     st.add(temp);
//                 }
//                 hashset.add(arr[j]);
//             }
//         }

//         // store the set elements in the answer:
//         List<List<Integer>> ans = new ArrayList<>(st);
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         List<List<Integer>> ans = triplet(n, arr);
//         for (List<Integer> it : ans) {
//             System.out.print("[");
//             for (Integer i : it) {
//                 System.out.print(i + " ");
//             }
//             System.out.print("] ");
//         }
//         System.out.println();
//     }
// }
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++

//OPTIMAL

// import java.util.*;

// public class tUf {
//     public static List<List<Integer>> triplet(int n, int[] arr) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(arr);

//         for (int i = 0; i < n; i++) {
//             //remove duplicates:
//             if (i> 0 && arr[i] == arr[i - 1]) continue;

//             //moving 2 pointers:
//             int j = i + 1;
//             int k = n - 1;
//             while (j < k) {
//                 int sum = arr[i] + arr[j] + arr[k];
//                 if (sum < 0) {
//                     j++;
//                 } else if (sum > 0) {
//                     k--;
//                 } else {
//                     List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                     ans.add(temp);
//                     j++;
//                     k--;
//                     //skip the duplicates:
//                     while (j < k && arr[j] == arr[j - 1]) j++;
//                     while (j < k && arr[k] == arr[k + 1]) k--;
//                 }
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         List<List<Integer>> ans = triplet(n, arr);
//         for (List<Integer> it : ans) {
//             System.out.print("[");
//             for (Integer i : it) {
//                 System.out.print(i + " ");
//             }
//             System.out.print("] ");
//         }
//         System.out.println();
//     }
// }

// -------------------------------------------------------

// 4 SUM PROBLEM 

// BETTER 
// import java.util.*;

// public class tUf {
//     public static List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length; // size of the array
//         Set<List<Integer>> st = new HashSet<>();

//         // checking all possible quadruplets:
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 Set<Long> hashset = new HashSet<>();
//                 for (int k = j + 1; k < n; k++) {
//                     // taking bigger data type
//                     // to avoid integer overflow:
//                     long sum = nums[i] + nums[j];
//                     sum += nums[k];
//                     long fourth = target - sum;
//                     if (hashset.contains(fourth)) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         temp.add((int) fourth);
//                         temp.sort(Integer::compareTo);
//                         st.add(temp);
//                     }
//                     // put the kth element into the hashset:
//                     hashset.add((long) nums[k]);
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(st);
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
//         int target = 9;
//         List<List<Integer>> ans = fourSum(nums, target);
//         System.out.println("The quadruplets are: ");
//         for (List<Integer> it : ans) {
//             System.out.print("[");
//             for (Integer ele : it) {
//                 System.out.print(ele + " ");
//             }
//             System.out.print("] ");
//         }
//         System.out.println();
//     }
// } 
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// OPTIMAL 
// import java.util.*;

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length; // size of the array
//         List<List<Integer>> ans = new ArrayList<>();

//         // sort the given array:
//         Arrays.sort(nums);

//         // calculating the quadruplets:
//         for (int i = 0; i < n; i++) {
//             // avoid the duplicates while moving i:
//             if (i > 0 && nums[i] == nums[i - 1]) continue;
//             for (int j = i + 1; j < n; j++) {
//                 // avoid the duplicates while moving j:
//                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;

//                 // 2 pointers:
//                 int k = j + 1;
//                 int l = n - 1;
//                 while (k < l) {
//                     long sum = nums[i];
//                     sum += nums[j];
//                     sum += nums[k];
//                     sum += nums[l];
//                     if (sum == target) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         temp.add(nums[l]);
//                         ans.add(temp);
//                         k++;
//                         l--;

//                         // skip the duplicates:
//                         while (k < l && nums[k] == nums[k - 1]) k++;
//                         while (k < l && nums[l] == nums[l + 1]) l--;
//                     } else if (sum < target) k++;
//                     else l--;
//                 }
//             } 
//         }
//         return ans;
//     }
// }
// -------------------------------------------------------------
//MERGE OVERLAPPING 
// BRUTE

// import java.util.*;

// public class arrayhard {
//     public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
//         int n = arr.length;
//         Arrays.sort(arr, new Comparator<int[]>() {
//             public int compare(int[] a, int[] b) {
//                 return a[0] - b[0];
//             }
//         });
//         List<List<Integer>> ans = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {

//             int start = arr[i][0];
//             int end = arr[i][1];
//             // when iterating i skip all which are already mergerd by checking last elemt of
//             // prvs array and last elmt of current array (end)
//             if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
//                 continue;
//             }
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j][0] <= end) {
//                     end = Math.max(end, arr[j][1]);
//                 } else {
//                     break; // nothing left to merge
//                 }
//             }
//             ans.add(Arrays.asList(start, end));

//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
//         List<List<Integer>> ans = mergeOverlappingIntervals(arr);
//         System.out.print("The merged intervals are: \n");
//         for (List<Integer> it : ans) {
//             System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
//         }
//         System.out.println();
//     }

// }

// new Comparator<int[]>() is a way to create an instance of a comparator for
// arrays of integers (int[]).

// In Java, Comparator is an interface used for sorting objects. When you use
// new Comparator<int[]>(), you're creating an anonymous inner class that
// implements the Comparator interface specifically for arrays of integers
// (int[]).

// This allows you to define custom sorting logic for arrays of integers when
// using methods like Arrays.sort(), which require a Comparator to determine the
// order of elements.

// In the provided code snippet, this anonymous inner class is used to define
// custom sorting logic for arrays of integers based on the values of their
// first elements.

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//OPTIMAL
// code which ran on lcode 
// class Solution {
//     public int[][] merge(int[][] intervals) {
//         List<int[]> ans = new ArrayList<>();
//         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//         ans.add(intervals[0]);
//         for(int i=1;i<intervals.length;i++){
//             int[] temp = new int[2];
//             if(ans.get(ans.size()-1)[1] >= intervals[i][0]){
//                 temp[0] = Math.min(ans.get(ans.size()-1)[0],intervals[i][0]);
//                 temp[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
//                 ans.set(ans.size()-1,temp);
//             }else{
//                 ans.add(intervals[i]);
//             }
//         }
//         return ans.toArray(new int[ans.size()][]);
//         //https://chat.openai.com/share/7141a35e-0328-4c2f-857c-5c8e02c7567e
//     }
// }




// import java.util.*;

// public class Main {

//     public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
//         int n = arr.length; // size of the array
//         //sort the given intervals:
//         Arrays.sort(arr, new Comparator<int[]>() {
//             public int compare(int[] a, int[] b) {
//                 return a[0] - b[0];
//             }
//         });

//         List<List<Integer>> ans = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             // if the current interval does not
//             // lie in the last interval:
//             if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
//                 ans.add(Arrays.asList(arr[i][0], arr[i][1]));
//             }
//             // if the current interval
//             // lies in the last interval:
//             else {
//                 ans.get(ans.size() - 1).set(1,
//                                             Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
//         List<List<Integer>> ans = mergeOverlappingIntervals(arr);
//         System.out.print("The merged intervals are: \n");
//         for (List<Integer> it : ans) {
//             System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
//         }
//         System.out.println();
//     }
// }

// ---------------------------------------------------------------------------

// Merge two Sorted Arrays Without Extra Space

// OPTIMAL 1 

// import java.util.*;

// public class tUf {

//     public static void merge(long[] arr1, long[] arr2, int n, int m) {

//         // Declare 2 pointers:
//         int left = n - 1;
//         int right = 0;

//         // Swap the elements until arr1[left] is
//         // smaller than arr2[right]:
//         while (left >= 0 && right < m) {
//             if (arr1[left] > arr2[right]) {
//                 long temp = arr1[left];
//                 arr1[left] = arr2[right];
//                 arr2[right] = temp;
//                 left--;
//                 right++;
//             } else {
//                 break;
//             }
//         }

//         // Sort arr1[] and arr2[] individually:
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//     }

//     public static void main(String[] args) {
//         long[] arr1 = {1, 4, 8, 10};
//         long[] arr2 = {2, 3, 9};
//         int n = 4, m = 3;
//         merge(arr1, arr2, n, m);
//         System.out.println("The merged arrays are:");
//         System.out.print("arr1[] = ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr1[i] + " ");
//         }
//         System.out.print("\narr2[] = ");
//         for (int i = 0; i < m; i++) {
//             System.out.print(arr2[i] + " ");
//         }
//         System.out.println();
//     }

// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// OPTIMAL 2 SHELL Sort
// class Solution {
//     public static void swapIfBigger(int[] arr1, int[] arr2, int ind1, int ind2) {
//         if (arr1[ind1] > arr2[ind2]) {
//             int temp = arr1[ind1];
//             arr1[ind1] = arr2[ind2];
//             arr2[ind2] = temp;
//         }
//     }

//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         int len = m + n;
//         // Initial gap:
//         int gap = (len / 2) + (len % 2);

//         while (gap > 0) {
//             int l = 0;
//             int r = l + gap;
//             while (r < len) {
//                 // case 1: l in nums1 and r in nums2
//                 if (l < m && r >= m) {
//                     swapIfBigger(nums1, nums2, l, r - m);
//                 }
//                 // case 2: both in nums1
//                 else if (l < m && r < m) {
//                     swapIfBigger(nums1, nums1, l, r);
//                 }
//                 // case 3: both in nums2
//                 else if (l >= m) {
//                     swapIfBigger(nums2, nums2, l - m, r - m);
//                 }
//                 // case 4: l in nums2 and r in nums2 (shouldn't happen in this context)
//                 l++;
//                 r++;
//             }
//             // break if iteration gap=1 is completed:
//             if (gap == 1) break;

//             // Otherwise, calculate new gap:
//             gap = (gap / 2) + (gap % 2);
//         }

       
//     }}
// ++++++++++++++++++++++++++++++++++++
// 0 CONDITION
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i=m-1;int j=n-1;int k=m+n-1;
//         while(j>=0){
//             if(i>=0 && nums1[i]>nums2[j]){
//                 nums1[k]=nums1[i];
//                 k--;i--;
//             }
//             else{
//                 nums1[k]=nums2[j];
//                 k--;j--;
//             }
//         }
//     }
// }
// =------------------------------------------------------------
// GFG
// Find the repeating and missing numbers
// BETTER 

// public class arrayhard {
// public static int[] findMissingRepeatingNumbers(int[]arr){
//     int n=arr.length;
//     int[] hash = new int[n + 1]; // hash array

// for (int i = 0; i <n; i++) {
//     hash[arr[i]]++;

// }
// int repeating = -1, missing = -1;
// for (int i = 1; i <= n; i++) {
//     if (hash[i] == 2) repeating = i;
//     else if (hash[i] == 0) missing = i;

//     if (repeating != -1 && missing != -1)
//         break;
// }
// int[] ans = {repeating, missing};
// return ans;
// }
//     public static void main(String[] args) {
//         int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
//         int[] ans = findMissingRepeatingNumbers(a);
//         System.out.println("The repeating and missing numbers are: {"
//                            + ans[0] + ", " + ans[1] + "}");
//     }
// }

// ++++++++++++++++++++++++++++++++
// oPTIMAL 
// class Solve {
//     int[] findTwoElement(int arr[], int N) {
//         // Sum of first N natural numbers
//         long SN = (N * (N + 1)) / 2;
//         // Sum of squares of first N natural numbers
//         long S2N = (N * (N + 1) * (2 * N + 1)) / 6;
       
//         long S = 0, S2 = 0;
//         for (int i = 0; i < N; i++) {
//             S += arr[i];
//             S2 += (long)arr[i] * (long)arr[i];
//         }
        
//         // Equation 1: x - y = S - SN
//         long val1 = S - SN;
//         // Equation 2: x^2 - y^2 = S2 - S2N
//         long val2 = S2 - S2N;
        
//         // x^2 - y^2 = (x - y)(x + y)
//         // val2 = val1 * (x + y)
//         long val3 = val2 / val1;
        
//         // Solve the two equations:
//         // x - y = val1
//         // x + y = val3
//         long x = (val1 + val3) / 2;
//         long y = x - val1;
        
//         int[] ans = {(int)x, (int)y};
//         return ans;
//     }
// }
// -----------------------------------------------------------------

// COUNT INVERSION 

// import java.util.*;

// public class arrhard {

//     private static int merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //Modification 1: cnt variable to count the pairs:
//         int cnt = 0;

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 cnt += (mid - left + 1); //Modification 2
//                 right++;
//             }
//         }

//         // if elements on the left half are still left //

//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         //  if elements on the right half are still left //
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transfering all elements from temporary to arr //
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//         return cnt; // Modification 3
//     }

//     public static int mergeSort(int[] arr, int low, int high) {
//         int cnt = 0;
//         if (low >= high) return cnt;
//         int mid = (low + high) / 2 ;
//         cnt += mergeSort(arr, low, mid);  // left half
//         cnt += mergeSort(arr, mid + 1, high); // right half
//         cnt += merge(arr, low, mid, high);  // merging sorted halves
//         return cnt;
//     }

//     public static int numberOfInversions(int[] a, int n) {
//         // Count the number of pairs:
//         return mergeSort(a, 0, n - 1);
//     }


//     public static void main(String[] args) {
//         int[] a = {5, 4, 3, 2, 1};
//         int n = 5;
//         int cnt = numberOfInversions(a, n);
//         System.out.println("The number of inversions are: " + cnt);
//     }
// }

// -------------------------------------------------
// REVERSE PAIRS

// class Solution {
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low; // starting index of left half of arr
//         int right = mid + 1; // starting index of right half of arr

//         // storing elements in the temporary array in a sorted manner
//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // if elements on the left half are still left
//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         // if elements on the right half are still left
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transferring all elements from temporary to arr
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }

//     public static int countpair(int[] a, int low, int mid, int high) {
//         int right = mid + 1;
//         int c = 0;
//         for (int i = low; i <= mid; i++) {
//             while (right <= high && (long) a[i] > 2L * a[right]) {
//                 right++;
//             }
//             c += (right - (mid + 1));
//         }
//         return c;
//     }

//     public static int mergeSort(int[] arr, int low, int high) {
//         int c = 0;
//         if (low >= high) return c;
//         int mid = (low + high) / 2;
//         c += mergeSort(arr, low, mid); // left half
//         c += mergeSort(arr, mid + 1, high); // right half
//         c += countpair(arr, low, mid, high);
//         merge(arr, low, mid, high); // merging sorted halves
//         return c;
//     }

//     public int reversePairs(int[] nums) {
//         int n = nums.length;
//         return mergeSort(nums, 0, n - 1);
//     }
// }