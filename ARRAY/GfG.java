// Max sum path in two arrays

// class Solution {
//     public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
//          int m = arr1.size();
//         int n = arr2.size();
//         int sum1 = 0;
//         int sum2 = 0;
//         int i = 0;
//         int j = 0;
//             int result = 0;
//         while(i<m && j<n){
//             if(arr1.get(i)<arr2.get(j)){
//                 sum1+=arr1.get(i);
//                 i++;
//             }
//            else if(arr2.get(j)<arr1.get(i)){
//                 sum2+=arr2.get(j);
//                 j++;
//             }
//             else{
//                 result+=Math.max(sum1,sum2)+arr1.get(i);
//                 sum1=0;sum2=0;
//                 i++;
//                 j++;
//             }
//         }
//          while (i < m) {
//             sum1 += arr1.get(i);
//             i++;
//         }

//         while (j < n) {
//             sum2 += arr2.get(j);
//             j++;
//         }
//         result+=Math.max(sum1,sum2);
//         return result;
//     }
// }

// // If we choose the larger element, we are committing to a path that includes the larger 
// // element. This might limit our options in the future, as we 
// // might not be able to find a common subsequence that includes the larger element.
// // If we choose the smaller element, we are keeping our options open. We can still consider
// // paths that include the larger element in the future, but we are also considering paths
// // that include the smaller element.