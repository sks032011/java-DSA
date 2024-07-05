
// CEIL+FLOOR

// //{ Driver Code Starts
// //Initial Template for Java



// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int tc = Integer.parseInt(br.readLine().trim());
//         while (tc-- > 0) {
//             String[] inputLine;
//             inputLine = br.readLine().trim().split(" ");
//             int n = Integer.parseInt(inputLine[0]);
//             int x = Integer.parseInt(inputLine[1]);
//             int[] arr = new int[n];
//             inputLine = br.readLine().trim().split(" ");
//             for (int i = 0; i < n; i++) {
//                 arr[i] = Integer.parseInt(inputLine[i]);
//             }

//             Pair ans = new Solve().getFloorAndCeil(arr, n, x);
//             System.out.println(ans.floor + " " + ans.ceil);
//         }
//     }
// }

// class Pair {
//     int floor, ceil;

//     Pair() {
//         this.floor = 0;
//         this.ceil = 0;
//     }

//     Pair(int floor, int ceil) {
//         this.floor = floor;
//         this.ceil = ceil;
//     }
// }

// // } Driver Code Ends


// //User function Template for Java



// class Solve {
//     Pair getFloorAndCeil(int[] arr, int n, int x) {
//         Arrays.sort(arr);  // Sort the array first
//         int floor = -1;
//         int ceil = -1;
//         int low = 0;
//         int high = n - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == x) {
//                 return new Pair(arr[mid], arr[mid]);
//             }
//             if (arr[mid] < x) {
//                 floor = arr[mid];
//                 low = mid + 1;
//             } else {
//                 ceil = arr[mid];
//                 high = mid - 1;
//             }
//         }
//         return new Pair(floor, ceil);
//     }
// }
// // o return a Pair object, you need to instantiate a new Pair object with the correct values

// ----------------------------------------------------------

// Find the first or last occurrence of a given number in a sorted array

// class BS {
//     public int foc(int[] arr, int x) {
//         int n = arr.length;
//         int first = -1;
//         int low = 0;
//         int high = n - 1;
        
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == x) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] < x) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return first;
//     }

//     public int loc(int[] a, int x) {
//         int n = a.length;
//         int last = -1;
//         int low = 0;
//         int high = n - 1;
        
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (a[mid] == x) {
//                 last = mid;
//                 low = mid + 1;
//             } else if (a[mid] < x) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return last;
//     }

//     public int[] searchRange(int[] nums, int target) {
//         int first = foc(nums, target);
//         if (first == -1) return new int[]{-1, -1};
//         int last = loc(nums, target);
//         return new int[]{first, last};
//     }
// }
// ---------------------------------------------------------------------

// Number of occurrence

// class BS {
//     public int count(int[] arr, int n, int x) {
//         int[] ans = firstAndLastPosition(arr, n, x);
//         if (ans[0] == -1) return 0;
//         return (ans[1] - ans[0] + 1);
//     }

//     private int firstOccurrence(int[] arr, int n, int k) {
//         int low = 0, high = n - 1;
//         int first = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == k) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] < k) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return first;
//     }

//     private int lastOccurrence(int[] arr, int n, int k) {
//         int low = 0, high = n - 1;
//         int last = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == k) {
//                 last = mid;
//                 low = mid + 1;
//             } else if (arr[mid] < k) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return last;
//     }

//     private int[] firstAndLastPosition(int[] arr, int n, int k) {
//         int first = firstOccurrence(arr, n, k);
//         if (first == -1) return new int[]{-1, -1};
//         int last = lastOccurrence(arr, n, k);
//         return new int[]{first, last};
//     }
// }
// --------------------------------------------------------------------
// 33 Search in Rotated Sorted Array I
// class BS {
//     public int search(int[] a, int target) {
//         int n=a.length;
//         int low=0;int high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(a[mid]==target) return mid;

//             // Left half sorted
//             if(a[low]<=a[mid]){
//                 if(a[low]<=target && target<=a[mid] ){
//                     high=mid-1;
                    
//                 }
//                 else low=mid+1;
//             }
//             else if(a[mid]<=target && a[high]>=target){
//                 low=mid+1;
              
//             }
//               else high=mid-1;
//         }
//         return -1;
//     }
// }
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++
// WITH DUPLICATES 
// class Solution {
//     public boolean search(int[] a, int target) {
//         int n=a.length;
//         int low=0;int high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(a[mid]==target){
//                 return true;
//             }
//             if(a[low]==a[mid] && a[mid]==a[high]){
//                 low+=1;high-=1;
//                 continue;
//             }
//             //left check
//             if(a[low]<=a[mid]){
//                 if(a[low]<=target && target<=a[mid] ){
//                     high=mid-1;
                    
//                 }
//                 else low=mid+1;
//             }
//             else if(a[mid]<=target && a[high]>=target){
//                 low=mid+1;
              
//             }
//               else high=mid-1;
//         }
//     return false;
//     }
// }
// -------------------------------------------------------------
// 153. Find Minimum in Rotated Sorted Array

// class BS {
//     public int findMin(int[] a) {
//         int n=a.length;
//         int l=0;int h=n-1;
//         int ans=Integer.MAX_VALUE;
//         while(l<=h){
//             int mid=(l+h)/2;
//             if(a[l]<=a[mid]){
//                 ans=Math.min(ans,a[l]);
//                 l=mid+1;
//             }
//             else{
//                 ans=Math.min(ans,a[mid]);
//                 h=mid-1;
//             }
//         }
//         return ans;
//     }
// }
// --------------------------------------------------------------------------------
// 540. Single Element in a Sorted Array

// class BS {
//     public int singleNonDuplicate(int[] a) {
//         int n=a.length;
//         if(n==1)return a[0];
//         //trim
//         if(a[0]!=a[1])return a[0];
//         if(a[n-1]!=a[n-2])return a[n-1];
//         int l=1;int h=n-2;
//         while(l<=h){
//             int mid=(l+h)/2;
//             if(a[mid-1]!=a[mid] && a[mid]!=a[mid+1]) return a[mid];
//             //eliminate halves
//             if((mid%2==1 && a[mid-1]==a[mid])||(mid%2==0 && a[mid]==a[mid+1])){
//                 l=mid+1;
//             }
//             //we r on right
//             else{
//                 h=mid-1;
//             }

//         }
//         return -1;
//     }
// }

// ---------------------------------------------------------------------------
// 162. Find Peak Element

// class BS {
//     public int findPeakElement(int[] a) {
//         int n=a.length;
//         if (n==1) return 0;
//         if(a[0]>a[1])return 0;
//         if(a[n-1]>a[n-2])return n-1;
//         int l=1;int h=n-2;
//         while(l<=h){
//             int mid=(l+h)/2;
//             if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;
//             else if(a[mid]>a[mid-1]) l=mid+1;
//             else h=mid-1;
//         }
//         return -1;

//     }
// }