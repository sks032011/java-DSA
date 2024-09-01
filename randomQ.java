// // SINE SERIES PROGRAM 
// public class randomQ {
//     public static double sine(double x, int n) {
//         double sum = 0;
//         double y = (x * Math.PI / 180);
//         for (int i = 0; i <= n; i++) {
//             int fact = 1;
//             for (int j = 1; j <= 2 * i + 1; j++) {
//                 fact *= j;
//             }
//             sum += Math.pow(-1.0, i) * Math.pow(y, 2.0 * i + 1) / fact;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         double x = 30.0;
//         int n = 10;
//         System.out.println(sine(x, n));
//     }
// }
// // COSINE SERIES PROGRAM 
// public class randomQ {
//     public static double sine(double x, int n) {
//         double sum = 0;
//         double y = (x * Math.PI / 180);
//         for (int i = 0; i <= n; i++) {
//             int fact = 1;
//             for (int j = 1; j <= 2 * i ; j++) {
//                 fact *= j;
//             }
//             sum += Math.pow(-1.0, i) * Math.pow(y, 2.0 * i ) / fact;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         double x = 45.0;
//         int n = 5;
//         System.out.println(sine(x, n));
//     }
// }
// ----------------------------------------------------------
// convert 1 d array to 2d 
// brute
// class Solution {
//     public int[][] construct2DArray(int[] original, int m, int n) {
//         // Check if the total elements in the original array match the required elements in the 2D array
//         if (m * n != original.length) {
//             return new int[0][0]; // Return an empty 2D array if dimensions don't match
//         }

//         // Initialize a 2D array with 'm' rows and 'n' columns
//         int[][] arr2D = new int[m][n];

//         // Fill the 2D array with elements from the 1D array
//         for (int i = 0; i < m; i++) {       
//             for (int j = 0; j < n; j++) {    
//                 // Calculate the correct index in the 1D array and assign the value to the 2D array
//                 arr2D[i][j] = original[i * n + j];
//             }
//         }

    
//         return arr2D;
//     }
// }
// OPTIMAL
// class Solution {
//     public int[][] construct2DArray(int[] original, int m, int n) {
//         if(m*n!=original.length){
//             return new int[0][0];
//         }
//         int [][]arr=new int[m][];
//         for(int i=0;i<m;i++){
//             arr[i]=Arrays.copyOfRange(original,i*n,i*n+n);
//         }
//           return arr;

//     }
// }


// The Java Arrays copyOfRange(short[] original, int from, int to) method copies the specified range of the specified array into a new array.The final index of the range (to), which must be greater than or equal to from, may be greater than original.length, in which case (short)0 is placed in all elements of the copy whose index is greater than or equal to original.length - from. The length of the returned array will be to - from.

// -------------------------------------------------------------------------------------