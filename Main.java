
//TWO SUM PROBLEM
// USING HASHING 
// class Solution {
//     public int[] twoSum(int[] nums, int target) { 
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//         int firstelmnt=nums[i];
//         int moreneeded=target-firstelmnt;
//         if(map.containsKey(moreneeded)){
//          return new int[]{map.get(moreneeded),i};
//         }
//         map.put(nums[i],i);
//     }
//         return new int[] {};
//     }

// }
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++
// OPTIMISED BUT ONLY YES NO 

// import java.util.*;

// public class arrayMed {
// public static String twoSum(int n,int[]arr,int target){
//     Arrays.sort(arr);
//     int left=0;int right=n-1;
//     while (left<right) {
//     int sum=arr[left]+arr[right];
//     if (sum==target) {
//         return "yes";

//     } else if (sum < target) left++;
//             else right--;
//     }
//     return "no";

// }

//     public static void main(String[] args) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         String ans = twoSum(n, arr, target);
//         System.out.println("This is the answer : " + ans);
//     }
// }
// -------------------------------------------------------------------------

// sort array of 0 1 2 
//BRUTE 

// import java.util.*;

// public class arrayMed {

//         public static void sortArray(ArrayList<Integer> arr, int n) {
//             int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//             for (int i = 0; i < n; i++) {
//                 if (arr.get(i) == 0) cnt0++;
//                 else if (arr.get(i) == 1) cnt1++;
//                 else cnt2++;
//             }

//             //Replace the places in the original array:
//             for (int i = 0; i < cnt0; i++) arr.set(i, 0); // replacing 0's

//             for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1); // replacing 1's

//             for (int i = cnt0 + cnt1; i < n; i++) arr.set(i, 2); // replacing 2's
//         }

//         public static void main(String args[]) {
//             int n = 6;
//             ArrayList<Integer> arr = new ArrayList<>(Arrays.asList (0, 2, 1, 2, 0, 1));
//             sortArray(arr, n);
//             System.out.println("After sorting:");
//             for (int i = 0; i < n; i++) {
//                 System.out.print(arr.get(i) + " ");
//             }
//             System.out.println();

//         }

//     }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//OPTIMAL 
// DUTCH FLAG ALGO
// class Solution {
//     public void sortColors(int[] nums) {
//         int mid = 0;
//         int low = 0;
//         int high = nums.length - 1;
//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 swap(nums, low, mid);
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 2) {
//                 swap(nums, mid, high);
//                 high--;
//             } else {
//                 mid++;
//             }
//         }
//     }

//     void swap(int[] nums, int a, int b) {
//         int temp = nums[a];
//         nums[a] = nums[b];
//         nums[b] = temp;
//     }
// }

// ----------------------------------------------------------------------------

//MAJORITY ELEMNT (COUNT>N/2)

//BETTER SOLN

// import java.util.HashMap;
// import java.util.Map;

// public class arrayMed {
// public static int majorityElement(int[]arr){
//     HashMap<Integer,Integer>mpp=new HashMap<>();
//     for (int i = 0; i < arr.length; i++) {
//         int value=mpp.getOrDefault(arr[i], 0);
//         mpp.put(arr[i], value+1);

//     }
//     for(Map.Entry<Integer,Integer>it:mpp.entrySet()){
//         if (it.getValue()>(arr.length/2)) {
//             return it.getKey();
//         }
//     }
//     return -1;
// }

//     public static void main(String args[]) {
//         int[] arr = {2, 2, 1, 1, 1, 2, 2};
//         int ans = majorityElement(arr);
//         System.out.println("The majority element is: " + ans);

//     }

// }
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//OPTIMISED MOORS VOTING 
// class Solution {
//     public int majorityElement(int[] nums) {
//         int c=0;
//         int el=0;
//         for(int i=0;i<nums.length;i++){
//             if(c==0){
//                 c=1;
//                 el=nums[i];
//             }
//             else
//             {
//                 if(nums[i]==el){
//                     c++;
//                 }
//                 else{ c--;}

//             }

//         }int c1=0;
//         for(int i=0;i<nums.length;i++){
//         if(el==nums[i]){
//             c1++;
//         }
//         if(c1>nums.length/2){
//             return el;
//         }
//         }
//         return -1;
//     }
// }

// -------------------------------------------------------------------------------

// MAX SUB ARRAY KADANE ALGO

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum=0;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];

//         max=Math.max(max,sum);

//         if(sum<0){
//             sum=0;
//         }
//         }
//         return max;
//     }

// }

// ++++++++++++++
//PRINT SUBARRY OF MAX SUM (SAME Q)

// public class tUf {
//     public static long maxSubarraySum(int[] arr, int n) {
//         long maxi = Long.MIN_VALUE; // maximum sum
//         long sum = 0;

//         int start = 0;
//         int ansStart = -1, ansEnd = -1;
//         for (int i = 0; i < n; i++) {

//             if (sum == 0) start = i; // starting index

//             sum += arr[i];

//             if (sum > maxi) {
//                 maxi = sum;

//                 ansStart = start;
//                 ansEnd = i;
//             }

//             // If sum < 0: discard the sum calculated
//             if (sum < 0) {
//                 sum = 0;
//             }
//         }

//         //printing the subarray:
//         System.out.print("The subarray is: [");
//         for (int i = ansStart; i <= ansEnd; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.print("]n");

//         // To consider the sum of the empty subarray
//         // uncomment the following check:

//         //if (maxi < 0) maxi = 0;

//         return maxi;
//     }

//     public static void main(String args[]) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int n = arr.length;
//         long maxSum = maxSubarraySum(arr, n);
//         System.out.println("The maximum subarray sum is: " + maxSum);

//     }

// }

// -------------------------------------------------------------------------------------

// REARRANGE BY SIGN 
//BRUTE
// import java.util.ArrayList;


// public class tUf {
//     public static int[] RearrangebySign(int[] A, int n) {
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (A[i] > 0) {
//                 pos.add(A[i]);

//             } else
//                 neg.add(A[i]);
//         }
//         for (int i = 0; i < n/2; i++) {
//             A[2*i]=pos.get(i);
//             A[2*i+1]=neg.get(i);
//         }
//         return A;
//     }

//     public static void main(String args[]) {
//         // Array Initialisation.
//         int n = 4;
//         int A[] = { 1, 2, -4, -5 };

//         int[] ans = RearrangebySign(A, n);

//         for (int i = 0; i < n; i++) {
//             System.out.print(ans[i] + " ");
//         }

//     }

// }

// ++++++++++++++++++++++++++++++++
// OPTIMAL 
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n=nums.length;
//         int negIdx=1;
//         int posIdx=0;
//         int ans[]=new int[n];
//         for(int i=0;i<n;i++){
//          if(nums[i]<0){
//         ans[negIdx]=nums[i];
//         negIdx+=2;
//          } 
//          else{
//             ans[posIdx]=nums[i];
//             posIdx+=2;
//          }
//         }
//          return ans;
    
//     }
// }

// ++++++++++++++++++++++++++++++++++++++++++++++
//IF POS!=NEG SIGNS 
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // Array Initialization
//         int n = 6;
//         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

//         ArrayList<Integer> ans = RearrangebySign(A, n);

//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//     }
//     public static ArrayList<Integer> RearrangebySign(ArrayList<Integer>A,int n){
//         ArrayList<Integer>pos=new ArrayList<>();
//         ArrayList<Integer>neg=new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (A.get(i)>0) {
//                 pos.add(A.get(i));
//             }
//             else{
//                 neg.add(A.get(i));

//             }
//         }
//             if (pos.size()>neg.size()) {
//                 for (int i = 0; i < neg.size(); i++) {
                    
//                     A.set(2*i,pos.get(i));
//                     A.set(2*i+1,neg.get(i));
//                     int index=neg.size()*2;
//                     for (int j = neg.size(); j <pos.size() ; j++) {
//                         A.set(index, pos.get(j));
//                         index++;
//                     }
//                 }
//             }
//         else {
//             for (int i = 0; i < pos.size(); i++){
//                 A.set(2*i,pos.get(i));
//                 A.set(2*i+1,neg.get(i));}
//                 int index=pos.size()*2;
//                 for (int j = pos.size(); j <neg.size() ; j++) {
//                     A.set(index, neg.get(j));
//                     index++;
//                 }
//             }
        
//         return A;
//     }}