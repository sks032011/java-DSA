// //2 SUM PROBLEM
// import java.util.*;

// public class arrayMed {
//     public static int[] twoSum(int n, int []arr, int target) {
//         int[] ans = new int[2];
//         ans[0] = ans[1] = -1;
//         HashMap<Integer, Integer> mpp = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             int num = arr[i];
//             int moreNeeded = target - num;
//             if (mpp.containsKey(moreNeeded)) {
//                 ans[0] = mpp.get(moreNeeded);
//                 ans[1] = i;
//                 return ans;
//             }

//             mpp.put(arr[i], i);
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         int[] ans = twoSum(n, arr, target);
//         System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
//                            + ans[1] + "]");

//     }

// }





// //OPTIMAL
// class Solution {
//     public void reverse(int[]nums,int i,int j){
//         while(j>i){
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         i++;j--;
//     }
//     return;
//     }
//     public void nextPermutation(int[] nums) {
        
//         int n=nums.length;
        
//         int index =-1;
//         for(int i=n-2;i>=0;i--){
//             if(nums[i]<nums[i+1]){
//                 index=i;
//                 break;
//             }
//         }
//         if(index==-1){
//         reverse(nums,0,n-1);
//         return;
//         //reverse whole arry
//         }
//         for(int i=n-1;i>index;i--){
//             if(nums[index]<nums[i]){
//                 int t=nums[i];
//                 nums[i]=nums[index];
//                 nums[index]=t;
//                 break;
//             }
//         }
//         reverse(nums,index+1,n-1);
//         return;
//     }
// }
// ------------------------------------------------------------

// //SORT AN ARRAY OF 0 1 2
// better

// import java.util.*;

// public class Main {
//     public static void sortArray(ArrayList<Integer> arr, int n) {
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         for (int i = 0; i < n; i++) {
//             if (arr.get(i) == 0) cnt0++;
//             else if (arr.get(i) == 1) cnt1++;
//             else cnt2++;
//         }

//         //Replace the places in the original array:
//         for (int i = 0; i < cnt0; i++) arr.set(i, 0); // replacing 0's

//         for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1); // replacing 1's

//         for (int i = cnt0 + cnt1; i < n; i++) arr.set(i, 2); // replacing 2's
//     }

//     public static void main(String args[]) {
//         int n = 6;
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
//         sortArray(arr, n);
//         System.out.println("After sorting:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();

//     }

// }

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// OPTIMAL
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


// ---------------------------------------------------------
// //MAJORITY ELEMENT MOORES VOTING ALGO

// BETTER HASHING




// import java.util.*;

// public class arrayMed {
//     public static int majorityElement(int []v) {
//         //size of the given array:
//         int n = v.length;

//         //declaring a map:
//         HashMap<Integer, Integer> mpp = new HashMap<>();

//         //storing the elements with its occurnce:
//         for (int i = 0; i < n; i++) {
//             int value = mpp.getOrDefault(v[i], 0);
//             mpp.put(v[i], value + 1);
//         }

//         //searching for the majority element:
//         for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//             if (it.getValue() > (n / 2)) {
//                 return it.getKey();
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         int[] arr = {2, 2, 1, 1, 1, 2, 2};
//         int ans = majorityElement(arr);
//         System.out.println("The majority element is: " + ans);

//     }

// }

// ++++++++++++++++++++++++++++++++++++++

// OPTIMAL
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

//  ex 2 2 1 1 1 2 2
// Basically, we are trying to keep track of the occurrences of the majority element and minority elements dynamically. That is why, in iteration 4, the count becomes 0 as the occurrence of Element and the occurrence of the other elements are the same. So, they canceled each other. This is how the process works. The element with the most occurrence will remain and the rest will cancel themselves.

// Here, we can see that 2 is the majority element. But if in this array, the last two elements were 3, then the Element variable would have stored 3 instead of 2. For that, we need to check if the Element is the majority element by traversing the array once more. But if the question guarantees that the given array contains a majority element, then we can bet the Element will store the majority one....then just return elemt without chrcking again

// --------------------------------------------------------------

// KADANES ALGO MAX SUBARRAY


// import java.util.*;

// public class arrayMed {
//     public static int maxSubarraySum(int[] arr, int n) {
//         int maxi = Integer.MIN_VALUE; // maximum sum

//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 // current subarray = arr[i.....j]

//                 //add the current element arr[j]
//                 // to the sum i.e. sum of arr[i...j-1]
//                 sum += arr[j];

//                 maxi = Math.max(maxi, sum); // getting the maximum
//             }
//         }

//         return maxi;
//     }

//     public static void main(String args[]) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int n = arr.length;
//         int maxSum = maxSubarraySum(arr, n);
//         System.out.println("The maximum subarray sum is: " + maxSum);

//     }

// }

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// OPTIMAL

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


// +++++++++++++++++++++++++++++++++++++++++++++++++++
// SAMEQ FIND THAT SUBARRAY


// import java.util.*;

// public class arrayMed {
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
// --------------------------------------------------------------
// //REARRANGE BY SIGN +-+-

// //LC2149
// BRUTE
// import java.util.*;

// class arrayMed{

// public static int[] RearrangebySign(int[] A, int n){
    
//   // Define 2 vectors, one for storing positive 
//   // and other for negative elements of the array.
//   ArrayList<Integer> pos=new ArrayList<>();
//   ArrayList<Integer> neg=new ArrayList<>();
  
//   // Segregate the array into positives and negatives.
//   for(int i=0;i<n;i++){
      
//       if(A[i]>0) pos.add(A[i]);
//       else neg.add(A[i]);
//   }
  
//   // Positives on even indices, negatives on odd.
//   for(int i=0;i<n/2;i++){
      
//       A[2*i] = pos.get(i);
//       A[2*i+1] = neg.get(i);
//   }

 
//   return A;
// }    

// public static void main(String args[]) 
// {
//   // Array Initialisation.
//   int n = 4;
//   int A[]= {1,2,-4,-5};


//   int[]ans= RearrangebySign(A,n);
  
//   for (int i = 0; i < n; i++) {
//     System.out.print(ans[i]+" ");
//   }

// }
// }

// +++++++++++++++++++++++++++++++++
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
// +++++++++++++++++++++++++++++++++++++++++++
// Variety-2
// Problem Statement:
// There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. The leftover elements should be placed at the very end in the same order as in array A.


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

//     public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
//         // Define 2 ArrayLists, one for storing positive 
//         // and other for negative elements of the array.
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         // Segregate the array into positives and negatives.
//         for (int i = 0; i < n; i++) {
//             if (A.get(i) > 0)
//                 pos.add(A.get(i));
//             else
//                 neg.add(A.get(i));
//         }

//         // If positives are lesser than the negatives.
//         if (pos.size() < neg.size()) {

//             // First, fill array alternatively till the point 
//             // where positives and negatives are equal in number.
//             for (int i = 0; i < pos.size(); i++) {
//                 A.set(2 * i, pos.get(i));
//                 A.set(2 * i + 1, neg.get(i));
//             }

//             // Fill the remaining negatives at the end of the array.
//             int index = pos.size() * 2;
//             for (int i = pos.size(); i < neg.size(); i++) {
//                 A.set(index, neg.get(i));
//                 index++;
//             }
//         }

//         // If negatives are lesser than the positives.
//         else {
//             // First, fill array alternatively till the point 
//             // where positives and negatives are equal in number.
//             for (int i = 0; i < neg.size(); i++) {
//                 A.set(2 * i, pos.get(i));
//                 A.set(2 * i + 1, neg.get(i));
//             }

//             // Fill the remaining positives at the end of the array.
//             int index = neg.size() * 2;
//             for (int i = neg.size(); i < pos.size(); i++) {
//                 A.set(index, pos.get(i));
//                 index++;
//             }
//         }
//         return A;
//     }
// }

// ----------------------------------------------------------------------

// NEXT PERMUTATION

// class Solution {
//     public void reverse(int[]nums,int i,int j){
//         while(j>i){
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         i++;j--;
//     }
//     return;
//     }
//     public void nextPermutation(int[] nums) {
        
//         int n=nums.length;
        
//         int index =-1;
//         for(int i=n-2;i>=0;i--){
//             if(nums[i]<nums[i+1]){
//                 index=i;
//                 break;
//             }
//         }
//         if(index==-1){
//         reverse(nums,0,n-1);
//         return;
//         //reverse whole arry
//         }
//         for(int i=n-1;i>index;i--){
//             if(nums[index]<nums[i]){
//                 int t=nums[i];
//                 nums[i]=nums[index];
//                 nums[index]=t;
//                 break;
//             }
//         }
//         reverse(nums,index+1,n-1);
//         return;
//     }
// }
// ----------------------------------------------------------------------

// LONGEST CONSECUTIVE SEQUENCE 
// BRUTE 

// import java.util.*;

// public class tUf {
//     public static boolean linearSearch(int []a, int num) {
//         int n = a.length; //size of array
//         for (int i = 0; i < n; i++) {
//             if (a[i] == num)
//                 return true;
//         }
//         return false;
//     }
//     public static int longestSuccessiveElements(int []a) {
//         int n = a.length; //size of array
//         int longest = 1;
//         //pick a element and search for its
//         //consecutive numbers:
//         for (int i = 0; i < n; i++) {
//             int x = a[i];
//             int cnt = 1;
//             //search for consecutive numbers
//             //using linear search:
//             while (linearSearch(a, x + 1) == true) {
//                 x += 1;
//                 cnt += 1;
//             }

//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 200, 1, 2, 3, 4};
//         int ans = longestSuccessiveElements(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }
// ++++++++++++++++++++++++++++++++++++++++
//BETTER


// public class arrayMed {
// public static int longestSuccessiveElements(int[]a,int n){
//     int longest=1;int lastSmaller =Integer.MIN_VALUE;int c=0;
//     for (int i = 0; i < n; i++) {
//         if (a[i]-1==lastSmaller) {
//             c++;
//             lastSmaller=a[i];
//         }
//         else if(a[i] != lastSmaller){
//           c=1;
//             lastSmaller=a[i];
            
//         }
//         longest=Math.max(longest, c);
//     }
//     return longest;
// }
//     public static void main(String[] args) {
//         int[] a = {100, 200, 1, 2, 3, 4};
//         int n=a.length;
//         int ans = longestSuccessiveElements(a,n);
//         System.out.println("The longest consecutive sequence is " + ans);
//     } 
// }
// ---------------------------------------------
// OPTIMAL 

// import java.util.*;

// public class tUf {
//     public static int longestSuccessiveElements(int[] a) {
//         int n = a.length;
//         if (n == 0)
//             return 0;

//         int longest = 1;
//         Set<Integer> set = new HashSet<>();

//         // put all the array elements into set
//         for (int i = 0; i < n; i++) {
//             set.add(a[i]);
//         }

//         // Find the longest sequence
//         for (int it : set) {
//             // if 'it' is a starting number
//             if (!set.contains(it - 1)) {
//                 // find consecutive numbers
//                 int cnt = 1;
//                 int x = it;
//                 while (set.contains(x + 1)) {
//                     x = x + 1;
//                     cnt = cnt + 1;
//                 }
//                 longest = Math.max(longest, cnt);
//             }
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 200, 1, 2, 3, 4};
//         int ans = longestSuccessiveElements(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }

// --------------------------------------------------------

//SET MATRIX TO ZEROES **
// OPTIMAL 
// class Solution {
//     public void setZeroes(int[][] nums) {
//         int n=nums.length;
//         int m=nums[0].length;
//         int col0=1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(nums[i][j]==0){
//                     nums[i][0]=0 ;//marking ith row
//                     if(j!=0){
//                         nums[0][j]=0;
//                     }
//                     else{
//                         col0=0;//if the zero is in first col
//                     }
//                 }
//             }
//         }
//         //step 2 zeroing rows and col from row 1 and col 1 and mark 0 if first elemtn of r.c is 0
//          for(int i=1;i<n;i++){
//             for(int j=1;j<m;j++){
//              if(nums[i][0]==0||nums[0][j]==0){
//                 nums[i][j]=0;
//              }
//             }
//             }
//             // now if [0][0]is 0 then first row is zero  if colo0 is 0 then 0 is first col
//             if(nums[0][0]==0){
//                 for(int j=0;j<m;j++){
//                 nums[0][j]=0;
//                 }
//             }
//             if(col0==0){
// for(int i=0;i<n;i++){
//     nums[i][0]=0;
// }
//             }
//     }
// }

// --------------------------------------------------------------
//COUNT ALL SUBARRAY WITH SUM K

// OPTIMAL 


// import java.util.*;

// public class arrayMed {
//     public static int findAllSubarraysWithGivenSum(int arr[], int k) {
//         int n = arr.length; // size of the given array.
//         Map<Integer,Integer> mpp = new HashMap<>();
//    //         <I,I> as key value are integ.
//         int preSum = 0, cnt = 0;

//         mpp.put(0, 1); // Setting 0 in the map.
//         for (int i = 0; i < n; i++) {
//             // add current element to prefix Sum:
//             preSum += arr[i];

//             // Calculate x-k:
//             int remove = preSum - k;

//             // Add the number of subarrays to be removed:
//             cnt += mpp.getOrDefault(remove, 0);

//             // Update the count of prefix sum
//             // in the map.
//             mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
//         }
//         return cnt;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 4};
//         int k = 6;
//         int cnt = findAllSubarraysWithGivenSum(arr, k);
//         System.out.println("The number of subarrays is: " + cnt);
//     }
// }



