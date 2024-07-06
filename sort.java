


// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }


//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};


//        //selection sort

//        for(int i=0; i<arr.length-1; i++) {
//            int smallest = i;
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[j] < arr[smallest]) {
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }


//        printArray(arr);
//    }
// }



// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }




//    public static void main(String args[]) {
//     int arr[] = {7, 8, 1, 3, 2};


//     //bubble sort
//     for(int i=0; i<arr.length-1; i++) {
//         for(int j=0; j<arr.length-i-1; j++) {
//             if(arr[j] > arr[j+1]) {
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }


//     printArray(arr);
// }
// }


// import java.util.*;


// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }


//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};


//        //insertion sort
//        for(int i=1; i<arr.length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//                while(j >= 0 && arr[j] > current) {
//                    //Keep swapping
//                    arr[j+1] = arr[j];
//                    j--;
//                }
//            arr[j+1] = current;
//        }
//        printArray(arr);
//    }
// }
// ----------------------------------------------------------------------
//Merge Sort 
// import java.util.*;

// class Solution {
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
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
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;
//         int mid = (low + high) / 2 ;
//         mergeSort(arr, low, mid);  // left half
//         mergeSort(arr, mid + 1, high); // right half
//         merge(arr, low, mid, high);  // merging sorted halves
//     }
// }

// public class tUf {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 7;
//         int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
//         System.out.println("Before sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         Solution.mergeSort(arr, 0, n - 1);
//         System.out.println("After sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// }


// ---------------------------------------------------------------------------------------------------

// QUICK SORT 

// public class recursion {
//     public static int partition(int arr[], int low, int high) {
//         int pivot = arr[low];
//         int i = low;
//         int j = high;
//         while (i < j) {
//             while (arr[i] <= pivot && i<=high-1) {
//                 i++;
//             }
//             while (arr[j] > pivot&&j>=low+1) {
//                 j--;
//             }
//             if (i < j) {
//                 int t = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = t;
//             }

//         }
//         int t = arr[low];
//         arr[low] = arr[j];
//         arr[j] = t;

//         return j;
//     }
//     public static void qs(int arr[], int low, int high) {
//         if (low < high) {
//             int partindx = partition(arr, low, high);
//             qs(arr, low, partindx - 1);
//             qs(arr, partindx + 1, high);
//         }
//     }


//     public static void main(String[] args) {
//                 int[] arr = { 1, 5, 4, 8, 9, 6, 2, 3, 7 };
//                 int n = arr.length;
//                 qs(arr,0, n -1);
               
//                 for (int i = 0; i < n; i++) {
        
//                     System.out.print(arr[i] + " ");
//                 }
//                 System.out.println();
//             }
//         }