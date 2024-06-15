// // Count frequency of each element in the array
// // Problem statement: Given an array, we have found the number of occurrences of each element in the array.

// // import java.util.HashMap;
// // import java.util.Map;

// // public class array {
// //     public static void freq(int[]arr,int n){
// //         Map<Integer, Integer> map = new HashMap<>();
// //         for (int i = 0; i < n; i++) {
// //             if (map.containsKey(arr[i]))
// //             {
// //                 map.put(arr[i], map.get(arr[i]) + 1);
// //             }
// //             else
// //             {
// //                 map.put(arr[i], 1);
// //             }
// //         }
// //         // Traverse through map and print frequencies
// //     for (Map.Entry<Integer,Integer> entry : map.entrySet())
// //     {
// //         System.out.println(entry.getKey() + " " + entry.getValue());
// //     }
// // }
    
// //     public static void main(String[] args) {
// //         int arr[] = {10,5,10,15,10,5};
// //         int n=arr.length;
// //         freq(arr,n);
        
// //     }
// //     Take a unordered_map/HashMap of <Integer, Integer> pair.
// // Use a for loop to iterate the array.
// // If the element is not present in the map then insert it with frequency 1, otherwise increase the existing frequency by 1.
// // Print the value frequency pair.

// // }

// // ---------------------------------------------------------------------------------------

// //2
// // : Given an array of size N. Find the highest and lowest frequency element.
// // import java.util.HashMap;
// // import java.util.Map;

// // public class array {
// //     public static void main(String[] args) {
// //         int arr[] = {10,5,10,15,10,5};
// //              int n=arr.length;
// //              freq(arr,n);
// //     }

// //     public static void freq(int[]arr,int n){
// //         Map<Integer, Integer> map = new HashMap<>();
// //         for (int i = 0; i <n; i++) {
// //             if(map.containsKey(arr[i])){
// //                 map.put(arr[i], map.get(arr[i])+1);

// //             }
// //             else{
// //                 map.put(arr[i], 1);
// //             }
// //         }
// //         int maxElem=0,maxFreq=0;
// //         int minElem=0;int minFreq=n;
// //         for (Map.Entry<Integer,Integer> entry : map.entrySet()){
// //            int count=entry.getValue();
// //            int key=entry.getKey();
         
// //            if (count > maxFreq) {
// //             maxElem = key;
// //             maxFreq = count;
// //         }
// //         if (count < minFreq) {
// //             minElem = key;
// //             minFreq = count;
// //         }
// //     }

// //     System.out.println("The highest frequency element is: " + maxElem);
// //     System.out.println("The lowest frequency element is: " + minElem);
// // }
// // } 
//     // -----------------------------------------------------------------------------------

// // 3 // left shift array by one
   
// // import java.util.*;

// // class array{
// // static void solve(int arr[], int n) {
// //   int temp = arr[0]; // storing the first element of array in a variable
// //   for (int i = 0; i < n - 1; i++) {
// //     arr[i] = arr[i + 1];
// //   }
// //   arr[n - 1] = temp; // assigned the value of variable at the last index
// //   for (int i = 0; i < n; i++) {
// //     System.out.print(arr[i]+" ");
// //   }

  
// // }
// // public static void main(String args[]) {
// //   int n=5;
  
// //   int arr[]= {1,2,3,4,5};
// //   solve(arr, n);
// // }
// // }
// // -------------------------------------------------------------------------------------
//             //   METHOD 1
// //4 shift right by k
// // public class array {
// // public static void solve(int []arr,int n,int k){
// //     if (n == 0)
// //     return;
// //     if (k > n)
// //     return;
// //     k = k % n;
// // int[] temp = new int[k];
// // for (int i = n-k; i < n; i++) {
// //      temp[i-n+k]=arr[i];
// // }
// // for (int i = n-k-1; i >=0; i--) {
// //     arr[i+k]=arr[i];
// // }
// // for (int i = 0; i < k; i++) {
// //     arr[i] = temp[i];
// //   }
// // }
// //     public static void main(String[] args) {
// //         int n=7;
// //         int arr[]={1,2,3,4,5,6,7};
// //         solve(arr,n,3);
// //         for (int i = 0; i < n; i++) {
// //             System.out.print(arr[i] + " ");
// //     }
// // }}
// // -----------------------------------------------------------------------------------------

// // shift by k on left 

// // import java.util.*;
// // public class array {
// //   public static void Rotatetoleft(int[] arr, int n, int k) {
// //     if (n == 0)
// //       return;
// //     k = k % n;
// //     if (k > n)
// //       return;
// //     int[] temp = new int[k];
// //     for (int i = 0; i < k; i++) {
// //       temp[i] = arr[i];
// //     }
// //     for (int i = 0; i < n - k; i++) {
// //       arr[i] = arr[i + k];
// //     }
// //     for (int i = n - k; i < n; i++) {
// //       arr[i] = temp[i - n + k];
// //     }
// //   }
// //   public static void main(String args[]) {
// //     int n = 7;
// //     int[] arr = {1,2,3,4,5,6,7};
// //     int k = 2;
// //     Rotatetoleft(arr, n, k);
// //     System.out.println("After Rotating the elements to left ");
// //     for (int i = 0; i < n; i++) {
// //       System.out.print(arr[i] + " ");
// //     }
// //   }
// // }


// // METHOD 2 OPTIMISED
// // LEFT 
// // public class array {
// //     public static void Reverse(int []arr,int start,int end){
// //         while (start <= end) {
// //             int temp = arr[start];
// //             arr[start] = arr[end];
// //             arr[end] = temp;
// //             start++;
// //             end--;
// //           }
// //     }
// //     public static void Rotateeletoleft(int[] arr, int n, int k) {
// //         // Reverse first k elements
// //         Reverse(arr, 0, k - 1);
// //         // Reverse last n-k elements
// //         Reverse(arr, k , n - 1);
// //         // Reverse whole array
// //         Reverse(arr, 0, n - 1);
// //       }
// //     public static void main(String[] args) {
// //         int[] arr = {1,2,3,4,5,6,7};
// //     int n = 7;
// //     int k = 2;
// //     Rotateeletoleft(arr, n, k);
   
// //     for (int i = 0; i < n; i++)
// //       System.out.print(arr[i] + " ");
// //     System.out.println();
// //   }
// //     }
// // --------------------------------------------------------
// // // for right 
// //     Reverse(arr, 0, n - k - 1);
// //     // Reverse last k elements
// //     Reverse(arr, n - k, n - 1);
// //     // Reverse whole array
// //     Reverse(arr, 0, n - 1);
// //   ----------------------------------------------------------



// // MOVE ALL ZERO TO END          

// // import java.util.*;

// // public class array {
// //     public static int[] moveZeros(int n, int []a) {
// //         int j = -1;
// //         //place the pointer j:
// //         for (int i = 0; i < n; i++) {
// //             if (a[i] == 0) {
// //                 j = i;
// //                 break;
// //             }
// //         }

// //         //no non-zero elements:
// //         if (j == -1) return a;

// //         //Move the pointers i and j
// //         //and swap accordingly:
// //         for (int i = j + 1; i < n; i++) {
// //             if (a[i] != 0) {
// //                 //swap a[i] & a[j]:
// //                 int tmp = a[i];
// //                 a[i] = a[j];
// //                 a[j] = tmp;
// //                 j++;
// //             }
// //         }
// //         return a;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
// //         int n = 10;
// //         int[] ans = moveZeros(n, arr);
// //         for (int i = 0; i < n; i++) {
// //             System.out.print(ans[i] + " ");
// //         }
// //         System.out.println("");
// //     }
// // }

// // --------------------------------------------------------------------------------------------------------
// // 1752 rotated sorted
// // Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
// // There may be duplicates in the original array.
// // Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
// // Example 1:

// // Input: nums = [3,4,5,1,2]
// // Output: true
// // Explanation: [1,2,3,4,5] is the original sorted array.
// // You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
// // Example 2:

// // Input: nums = [2,1,3,4]
// // Output: false
// // Explanation: There is no sorted array once rotated that can make nums.
// // Example 3:

// // Input: nums = [1,2,3]
// // Output: true
// // Explanation: [1,2,3] is the original sorted array.


// // class Solution {
// //     public boolean check(int[] nums) {
// //          int cnt = 0;
// //         for(int i=1;i<nums.length;i++) 
// //         {
// //             if(nums[i] < nums[i-1])
// //                 cnt++;
// //         }
// //         if(nums[nums.length-1] > nums[0])
// //             cnt++;
        
// //         return cnt<=1;
// //     }
// // }


// // --------------------------------------------------------------------------------------------------------

// // INTERSECTION OF TWOARRAY ....SAME ELEMENTS RETAINED 

// // import java.util.ArrayList;

// // public class array {
// // public static ArrayList<Integer> inter(int a[],int b[]){
// //     ArrayList<Integer>ans=new ArrayList<>();
// //     int i=0;int j=0;
    
// //    while (i<a.length&&j<b.length) {
// //     if (a[i]<b[j]) {
// //         i++;
// //     }
// //     else if (b[j]<a[i]) {
// //         j++;
// //     }
// //     else{
// //     ans.add(a[i]);
// //     i++;j++;}
// //    }
// //    return ans;
    
// // }
// //     public static void main(String[] args) {
// //         int []A={1,2,2,3,3,4,5,6,7,9};
// //         int []B={2,3,3,4,4,5,8,9};
      
// //         ArrayList<Integer>ans= inter(A,B);
// //         for (int i = 0; i < ans.size(); i++) {
// //             System.out.print(ans.get(i)+" ");
// //         }
    
// //     }
// // }


// //BRUTE
// // import java.util.*;

// // class array{

// // public static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B){
    
// //     ArrayList<Integer> ans=new ArrayList<>();

// //   // to maintain visited 
// //   int visited[]=new int[B.length]; 
 
// //   for (int i = 0; i < A.length; i++) {
// //     for (int j = 0; j < B.length; j++) {

// //       if (A[i] == B[j] && visited[j] == 0) { 
    
// //         //if element matches and has not been matched with any other before
// //         ans.add(B[j]);
// //         visited[j] = 1;

// //         break;
// //       } else if (B[j] > A[i]) break; 
// //        //because array is sorted , element will not be beyond this
// //     }
// //   }
// //   return ans;
// // }    

// // public static void main(String args[]) 
// // {
// //   // Array Initialisation.
// //   int A[]= {1,2,3,3,4,5,6,7};
// //   int B[]= {3,3,4,4,5,8};

// //   ArrayList<Integer> ans= intersectionOfArrays(A,B);
  
// //   for (int i = 0; i < ans.size(); i++) {
// //     System.out.print(ans.get(i)+" ");
// //   }

// // }
// // }

// // -------------------------------------------------------------------------------------

// //uNION OF TWO ARRAY

// // BRUTE
// // import java.util.*;
// // public class array {
// // static ArrayList<Integer> Findunion(int arr1[], int arr2[], int n, int m) {
// //   HashMap <Integer,Integer > freq=new HashMap<>();
// //   ArrayList<Integer> union=new ArrayList<>();
// //   for (int i = 0; i < n; i++)
// //     freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
    
// //   for (int i = 0; i < m; i++)
// //     freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
// //   for (int it: freq.keySet())
// //     union.add(it);
// //   return union;
// // }

// // public static void main(String args[]) {
// //   int n = 10, m = 7;
// //   int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// //   int arr2[] = {2, 3, 4, 4, 5, 11, 12};
// //   ArrayList<Integer> union = Findunion(arr1, arr2, n, m);
// //   System.out.println("union of arr1 and arr2 is ");
// //   for (int val: union)
// //     System.out.print(val+" ");
// // }
// // }

// // freq is a HashMap where the keys represent elements (numbers) from arr1 and arr2, and the values represent the frequencies of those elements. In a HashMap, each key must be unique. If you attempt to add a key that already exists, the previous value associated with that key will be overwritten.
// // So, when iterating over the keys using freq.keySet(), each key in the set is unique because of the nature of a HashMap. Therefore, when you add these unique keys to the union ArrayList using union.add(it), you are essentially collecting all distinct elements present in both arr1 and arr2.
// // In summary, the uniqueness of keys in the HashMap guarantees that the union ArrayList will only contain distinct elements, providing an effective way to find the union of two arrays.



// // NOW WITH HASHSET


// // import java.util.*;

// // class array{
// // static ArrayList<Integer> Findunion(int arr1[], int arr2[], int n, int m) {
// //   HashSet <Integer> s=new HashSet<>();
// //   ArrayList < Integer > union=new ArrayList<>();
// //   for (int i = 0; i < n; i++)
// //     s.add(arr1[i]);
// //   for (int i = 0; i < m; i++)
// //     s.add(arr2[i]);
// //   for (int it: s)
// //     union.add(it);
// //   return union;
// // }
// // public static void main(String args[]) {
// //   int n = 10, m = 7;
// //   int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// //   int arr2[] = {2, 3, 4, 4, 5, 11, 12};
// //   ArrayList<Integer> union = Findunion(arr1, arr2, n, m);
// //   System.out.println("union of arr1 and arr2 is ");
// //   for (int val: union)
// //     System.out.print(val+" ");
// // }
// // }

// //OPTIMAL 
// // 2 POINTER APPROACH 


// // import java.util.*;

// // class SKS{
// // static ArrayList<Integer> Findunion(int arr1[], int arr2[], int n, int m) {
// //    int i = 0, j = 0; // pointers
// //   ArrayList<Integer > union=new ArrayList<>(); // Uninon vector
// //   while (i < n && j < m) {
// //     if (arr1[i] <= arr2[j]) // Case 1 and 2
// //     {
// //       if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
// //         union.add(arr1[i]);
// //       i++;
// //     } else // case 3
// //     {
// //       if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
// //         union.add(arr2[j]);
// //       j++;
// //     }
// //   }
// //   while (i < n) // IF any element left in arr1
// //   {
// //     if (union.get(union.size()-1) != arr1[i])
// //       union.add(arr1[i]);
// //     i++;
// //   }
// //   while (j < m) // If any elements left in arr2
// //   {
// //     if (union.get(union.size()-1) != arr2[j])
// //       union.add(arr2[j]);
// //     j++;
// //   }
// //   return union;
// // }
// // public static void main(String args[]) {
// //   int n = 10, m = 7;
// //   int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// //   int arr2[] = {2, 3, 4, 4, 5, 11, 12};
// //   ArrayList<Integer> union = Findunion(arr1, arr2, n, m);
// //   System.out.println("union of arr1 and arr2 is ");
// //   for (int val: union)
// //     System.out.print(val+" ");
// // }
// // }
// // ----------------------------------------------------------------------

// // LONGEST SUBAARRAY WITH SUM K 
// //BRUTE



// // import java.util.*;

// // public class tUf {
// //     public static int getLongestSubarray(int []a, long k) {
// //         int n = a.length; // size of the array.

// //         int len = 0;
// //         for (int i = 0; i < n; i++) { // starting index
// //             long s = 0; // Sum variable
// //             for (int j = i; j < n; j++) { // ending index
// //                 // add the current element to
// //                 // the subarray a[i...j-1]:
// //                 s += a[j];

// //                 if (s == k)
// //                     len = Math.max(len, j - i + 1);
// //             }
// //         }
// //         return len;
// //     }

// //     public static void main(String[] args) {
// //         int[] a = {2, 3, 5, 1, 9};
// //         long k = 10;
// //         int len = getLongestSubarray(a, k);
// //         System.out.println("The length of the longest subarray is: " + len);
// //     }
// // }
// // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// // USING HASHING-BETTER 
// K SUM BUT POSITIVE AND NEG NUMBER ALLOWED 

// import java.util.HashMap;
// import java.util.Map;

// public class array {
// public static int getLongestSubarray(int a[],long k){
// int n=a.length;
// long sum=0;
// int maxLen=0;
// Map<Long,Integer>sumidx=new HashMap<>();
// for (int i = 0; i < n; i++) {
//      sum+=a[i];
//      if (sum==k){
//      maxLen=Math.max(maxLen,i+1);
//      }
//     //  x-k wala sum
//      long rem=sum-k;
//      if (sumidx.containsKey(rem)) {
//         // The get() method of Map interface in Java is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key. So, let us check how to get value from the map in Java.

//         int l=i-sumidx.get(rem);
//         maxLen=Math.max(maxLen, l);
// }
// //condition to put in map if the sum isnt already present in the map to get the left most elemt ex[2,0,0,2]
// if (!sumidx.containsKey(sum)) {
//     sumidx.put(sum, i);
// }}
// return maxLen;

// // }

// //     public static void main(String[] args) {
// //         int arr[]={1,2,3,1,1,1,1,4,2,3};
// //         long k=3;
// //         int len = getLongestSubarray(arr, k);
// //         System.out.println("The length of the longest subarray is: " + len);
// //     }
// // }

// // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// //OPTIMISED 
// // USE 2 POINTER 

// public class array {
// public static int getLongestSubarray(int []a,long k){
//     int left=0;int right=0;
//     long sum=a[0];
//     int n=a.length;
//     int maxLen=0;
//     while (right<n) {
//         while(left<=right&&sum>k) {
//             sum-=a[left];
//             left++;
//         }
//         if (sum==k) {
//             maxLen=Math.max(maxLen, right-left+1);
//         }
//         right++;

//         if (right < n) sum += a[right];
// }
// return maxLen;}
//     public static void main(String[] args) {
//         int[] a = {2, 3, 5, 1, 9};
//         long k = 10;
//         int len = getLongestSubarray(a, k);
//         System.out.println("The length of the longest subarray is: " + len);
//     }
// }
// --------------------------------------------------------------------------


