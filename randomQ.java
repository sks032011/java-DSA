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