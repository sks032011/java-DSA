// Row with max 1s

// class Solution {
//     public int LowerBound(int[] arr, int m, int x) {
//         int low = 0;
//         int high = m - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] >= x) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }

//     public int rowWithMax1s(int arr[][]) {
//         int cntMax = 0;
//         int index = -1;
//         int n = arr.length;
//         int m = arr[0].length;
//         for (int i = 0; i < n; i++) {
//             int lb = LowerBound(arr[i], m, 1);
//             int cnt_ones = m - lb;
//             if (lb != m && cnt_ones > cntMax) {
//                 cntMax = cnt_ones;
//                 index = i;
//             }
//         }
//         return index;
//     }
// }
// ----------------------------------------------------------------
// 74. Search a 2D Matrix

// class Solution {
//     public boolean searchMatrix(int[][] mat, int target) {
//         int n=mat.length;
//         int m=mat[0].length;
//         int low=0;int high=(n*m)-1;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             int row=mid/m;int col=mid%m;
//             if(mat[row][col]==target) return true;
//             else if(mat[row][col]<target) low=mid+1;
//             else high=mid-1;
//         }
//         return false;
//     }
// }
// --------------------------------------------------
// 240. Search a 2D Matrix II

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n=matrix.length;int m =matrix[0].length;
//         int row=0;int col=m-1;
//         while(row<n && col>=0){
//             if(matrix[row][col]==target) return true;
//             else if(matrix[row][col]<target) row++;
//             else col--;
//         }
//         return false;
//     }
// }
// --------------------------------------------------

// 1901. Find a Peak Element II

// class Solution {
//     public int maxElmntRow(int mat[][], int n, int m, int mid) {
//         int maxVal = -1;
//         int maxRow = -1;
//         for (int i = 0; i < n; i++) {
//             if (mat[i][mid] > maxVal) {
//                 maxVal = mat[i][mid];
//                 maxRow = i;
//             }
//         }
//         return maxRow;
//     }

//     public int[] findPeakGrid(int[][] mat) {
//         int n = mat.length;
//         int m = mat[0].length;
//         int low = 0;
//         int high = m - 1;
        
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             int row = maxElmntRow(mat, n, m, mid);
//             int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
//             int right = mid + 1 < m ? mat[row][mid + 1] : -1;

//             if (mat[row][mid] > left && mat[row][mid] > right) {
//                 return new int[]{row, mid};
//             } else if (mat[row][mid] < left) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }


// ------------------------------------------------------------

// Median in a row-wise sorted Matrix
// class Solution {
//     static int median(int matrix[][], int m, int n) {
//         int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

//         // Point low and high to the right elements
//         for (int i = 0; i < m; i++) {
//             low = Math.min(low, matrix[i][0]);
//             high = Math.max(high, matrix[i][n - 1]);
//         }

//         int req = (n * m) / 2;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (blackBox(matrix, m, n, mid) <= req) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return low;
//     }

//     static int blackBox(int[][] mat, int m, int n, int x) {
//         int count = 0;
//         for (int i = 0; i < m; i++) {
//             count += upperBound(mat[i], x);
//         }
//         return count;
//     }

//     static int upperBound(int arr[], int x) {
//         int low = 0, high = arr.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] > x) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }
// }