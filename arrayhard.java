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

import java.util.*;

public class arrayhard {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            int start = arr[i][0];
            int end = arr[i][1];
            // when iterating i skip all which are already mergerd by checking last elemt of
            // prvs array and last elmt of current array (end)
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break; // nothing left to merge
                }
            }
            ans.add(Arrays.asList(start, end));

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }

}

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
//tuff code



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