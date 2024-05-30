
//STRINGS

// 1= abcd in reverse 
// public class recursion {
//     public static void rev(String s,int idx){
//         if (idx==0) {
//             System.out.print(s.charAt(idx));
//             return;
//         }
//         System.out.print(s.charAt(idx));
//         rev(s,idx-1);

//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         rev(str,str.length()-1);
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////

// 2=first and last occurence of element in array using arraylist

// import java.util.ArrayList;
// public class recursion {
//        public static int first(ArrayList list,int x){
//         return list.indexOf(x);
//        }
//        public static int last(ArrayList list,int x){
//         return list.lastIndexOf(x);
//        }
//     public static void main(String[] args) {
//         int arr[]={1,3,3,3,3,4,7,8,8};
//         ArrayList<Integer> clist=new  ArrayList<>();
//         // add elelmets in arrlist
//         for(int i:arr)
//         clist.add(i);
//         int x=8;
//         System.out.println("first="+first(clist,x));
//         System.out.println("last="+last(clist,x));

//     }

// }

///////////////////////////////////////////////////////////////////

//3==first and last occ of element in a string using recursion

// public class recursion {
// public static int first=-1;public static int last=-1;
// public static void occurence(String str,int idx,char element) {
//     if (idx==str.length()) {
//         System.out.println(first);
//         System.out.println(last);
//         return;
//     }
//     char currChar=str.charAt(idx);
//     if (currChar==element) {
//         if (first==-1) {
//             first=idx;

//         }
//         else{
//             last=idx;
//         }
//     }
//     occurence(str, idx+1, element);

// }
//     public static void main(String[] args) {
//         String str="abaacdaefaah";
//         occurence(str, 0, 'a');
//     }
// }

//------------------------------------------------------------------------------------------------------------

// 4  Move all x to end of String axbcxxd to abcdxxx

// public class recursion {
// public static void moveX(String str,int idx,int count ,String newStr){
//     if (idx==str.length()) {
//         for (int i = 0; i < count; i++) {
//             newStr+='x';
//         }
//         System.out.print(newStr);
//         return;
//     }
// char currChar=str.charAt(idx);
// if (currChar=='x') {
//     count++;
//     moveX(str, idx+1, count, newStr);
// }
// else{
//     newStr+=currChar;
//     moveX(str, idx+1, count, newStr);
// }
// }
// public static void main(String[] args) {
//     String s="axbcxxd";
//     int idx=0;
//     int count=0;
//     String newS="";
//     moveX(s, idx, count, newS);
// }    
// }

//--------------------------------------------------------------------------------------------------------

//5 remove duplicates in a string 

// public class recursion {
// public static boolean[] map=new boolean[26];
// public static void remove(String s,int pos,String newString){
//     if (pos==s.length()) {
//         System.out.println(newString);
//         return;
//     }
//     char currChar=s.charAt(pos);
//     if (map[currChar-'a']==true){
//         remove(s, pos+1,newString);
//     }
//     else{
// newString+=currChar;
// map[currChar-'a']=true;
// remove(s, pos+1, newString);
//     }
// }
// public static void main(String[] args) {
//     String s="abbccdee";
//     String newString="";
//     remove(s, 0,newString);
// }    
// }

// ------------------------------------------------------------------------------------

//6
// subsequence of a string 
// "abc"

// public class recursion {
// public static void sub(String s,int idx,String New){
//     if (idx==s.length()) {
//         System.out.println(New);
//         return;
//     }
// char currChar=s.charAt(idx);

// //to be 
// sub(s,idx+1,New+currChar);

// // not to be
// sub(s,idx+1,New);
// }
//     public static void main(String[] args) {
//         String s="abc";

//         sub(s, 0,"");
//     }

// }

// -------------------------------------------------------------------------

//7 Keypad Combination

// public class recursion {
//     public static String keypad[]={".","ABC" ,"DEF" ,"GHI" ,"JKL", "MNO", "PQR", "STU", "VWX", "YZ"};
// public static void keypad(String s,int idx,String combination){
//     if (idx==s.length()) {
//         System.out.println(combination);
//         return;
//     }
//     char currChar=s.charAt(idx);
//     String map=keypad[currChar-'0'];
//     for (int i = 0; i < map.length(); i++) {
//         keypad(s, idx+1, combination+map.charAt(i));
//     }

// }
// public static void main(String[] args) {
//     String s="23";
// keypad(s, 0, "");
// }    
// }
// -----------------------------------------------------------------------------------------------

//8 permutation of string 

// "abc"

// public class recursion {
// public static void permu(String s,String New){
//     if (s.length()==0) {
//         System.out.println(New);
//         return;
//     }
//     for (int i = 0; i < s.length(); i++) {

//         char currChar=s.charAt(i);
//         String yo=s.substring(0, i)+s.substring( i+1);
//         permu(yo, New+currChar);
//     }

// }
// public static void main(String[] args) {
//     String s="abc";
//     permu(s,  "");

// }    
// }

// ---------------------------------------------------------------------------------

//9 total path in a maze to move from 0,0 to n,m
// n=3 m=3

// public class recursion {
// public static int Maze(int i,int j,int n,int m){
//     if (i==n||j==m) {
//         return 0;
//     }

//     if (i==n-1&&j==m-1) {
//         return 1;
//     }
// int right =Maze(i, j+1, n, m);
// int down=Maze(i+1, j, n, m);
// return down+right;
// }
//     public static void main(String[] args) {
//      int total=   Maze(0, 0, 3, 3);

//     System.out.println(total);
// }
// }

// ----------------------------------------------------------------------------------------

// 10 place tiles 1xm on a floor nxm    
// n=4 m=2

// public class recursion {
// public static int count(int n,int m){
//     if (n==m) {
//         return 2;
//     }
//     if (n<m) {
//         return 1;
//     }
//     return count(n-1, m)+count(n-m, m);
// }
// public static void main(String[] args) {
//     int yo=count(4, 2);
// System.out.println(yo);}    
// }

// ----------------------------------------------------------------------------------------

// 11 invite n people to a prty single or in a pair 
// n=4

// public class recursion {
// public static int call(int n){
//     if(n==1){
//         return 1;
//     }
//     if (n==2) {
//         return 2;
//     }
//     return call(n-1)+(n-1)*call(n-2);
// }
// public static void main(String[] args) {
//     int yo =call(4);
// System.out.println(yo);}    
// }

// ----- -------------------------------------------------------------------------------------

//12
// subset of a set of first n natural number 

// import java.util.ArrayList;

// public class recursion {
//     public static void printS(ArrayList<Integer>Subset){
//         for (int i = 0; i < Subset.size(); i++) {
//             System.out.print(Subset.get(i)+ " ");
//         }
//         System.out.println();
//     }

// public static void findS(int n,ArrayList<Integer>Subset){
//     if (n==0) {
//         printS(Subset);
//         return;
//     }
//     //add hoga 
//     Subset.add(n);
//     findS(n-1, Subset);

//     // remove kro kyuki idhar its not added usi level pe
//     Subset.remove(Subset.size()-1);
//     // 1 hata pehli baar me 
//     findS(n-1, Subset);
// }
// public static void main(String[] args) {
//     ArrayList<Integer>Subset=new ArrayList<>();
//     findS(3, Subset);
// }    
// }

// ---------------------------------------------------------------------
//combination sum 1 leetcode q39
// class Solution {
//     public static void comb(int idx,int[]arr,int target, List<List<Integer>>ans,List<Integer>ds){
//         if(idx==arr.length){
//             if(target==0){
//                 ans.add(new ArrayList<>(ds));
//             }
//             return;
//         }
//         if(arr[idx]<=target){
//             ds.add(arr[idx]);
//             comb(idx,arr,target-arr[idx],ans ,ds);
//             ds.remove(ds.size()-1);
//         }
//          comb(idx+1,arr,target,ans ,ds);
//     }

//         public List<List<Integer>> combinationSum(int[] candidates, int target) {
//             List<List<Integer>> ans =new ArrayList<>();
//             comb(0,candidates,target,ans,new ArrayList<>());
//             return ans;
//         }
//     }
// ----------------------------------------------------------------------------

// q 40 combination sum 2 

// class Solution {
//     public static void comb(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {

//         if (target == 0) {
//             ans.add(new ArrayList<>(ds));

//             return;
//         }
//         for (int i = idx; i < arr.length; i++) {
//             if (i > idx && arr[i] == arr[i - 1])
//                 continue;
//             if (arr[i] > target)
//                 break;
//             ds.add(arr[i]);
//             comb(i + 1, arr, target - arr[i], ans, ds);
//             ds.remove(ds.size() - 1);

//         }
//     }

//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(candidates);
//         comb(0, candidates, target, ans, new ArrayList<>());

//         return ans;
//     }
// }

// ------------------------------------------------------------------------------

// q N QUEEN PROBLEM 

// import java.util.ArrayList;
// import java.util.List;

// public class recursion {

//    public boolean isSafe(int row, int col, char[][] board) {
//        //horizontal
//        for(int j=0; j<board.length; j++) {
//            if(board[row][j] == 'Q') {
//                return false;
//            }
//        }

//        //vertical
//        for(int i=0; i<board.length; i++) {
//            if(board[i][col] == 'Q') {
//                return false;
//            }
//        }

//        //upper left
//        int r = row;
//        for(int c=col; c>=0 && r>=0; c--, r--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }

//        //upper right
//        r = row;
//        for(int c=col; c<board.length && r>=0; r--, c++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }

//        //lower left
//        r = row;
//        for(int c=col; c>=0 && r<board.length; r++, c--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }

//        //lower right
//        for(int c=col; c<board.length && r<board.length; c++, r++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }

//        return true;
//    }

//    public void saveBoard(char[][] board, List<List<String>> allBoards) {
//        String row = "";
//        List<String> newBoard = new ArrayList<>();

//        for(int i=0; i<board.length; i++) {
//            row = "";
//            for(int j=0; j<board[0].length; j++) {
//                if(board[i][j] == 'Q')
//                    row += 'Q';
//                else
//                    row += '.';
//            }
//            newBoard.add(row);
//        }

//        allBoards.add(newBoard);
//    }

//    public void aider(char[][] board, List<List<String>> allBoards, int col) {
//        if(col == board.length) {
//            saveBoard(board, allBoards);
//            return;
//        }

//        for(int row=0; row<board.length; row++) {
//            if(isSafe(row, col, board)) {
//                board[row][col] = 'Q';
//                aider(board, allBoards, col+1);
//                board[row][col] = '.';
//            }
//        }
//    }

//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new char[n][n];

//        aider(board, allBoards, 0);
//        return allBoards;
//    }
// }

// --------------------------------------------------------------------------------------    
// SUDOKU

// import java.util.*;

// class Solution {

//   public static boolean solveSudoku(char[][] board) {
//     for (int i = 0; i < 9; i++) {
//       for (int j = 0; j < 9; j++) {
//         if (board[i][j] == '.') {

//           for (char c = '1'; c <= '9'; c++) {
//             if (isValid(board, i, j, c)) {
//               board[i][j] = c;

//               if (solveSudoku(board))
//                 return true;
//               else
//                 board[i][j] = '.';
//             }
//           }

//           return false;
//         }
//       }
//     }
//     return true;
//   }

//   public static boolean isValid(char[][] board, int row, int col, char c) {
//     for (int i = 0; i < 9; i++) {
//       if (board[i][col] == c)
//         return false;

//       if (board[row][i] == c)
//         return false;

//       if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
//         return false;
//     }
//     return true;
//   }

//   public static void main(String[] args) {

//    char[][] board= {
//                     {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
//                     {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
//                     {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
//                     {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
//                     {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
//                     {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
//                     {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
//                     {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
//                     {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
//                     };
//     solveSudoku(board);

//     for (int i = 0; i < 9; i++) {
//       for (int j = 0; j < 9; j++)
//         System.out.print(board[i][j] + " ");
//       System.out.println();
//     }
//   }
// }
// -------------------------------------------------------------------------------------------------

// validate sudoku 
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         HashSet seen =new HashSet();
//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//                 if(board[i][j]!='.'){
//             if(!seen.add("row"+i+board[i][j])||!seen.add("clm"+j+board[i][j])){
//             return false;}
//             if(!seen.add("box"+3*(i/3)+j/3+board[i][j])){
//             return false;}
//         }}

//         }
//           return true;
//     }
// }

// ----------------------------------------------------------------------------------

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
//             while (arr[i] <= pivot&&i<=high-1) {
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

// -------------------------------------------------------------------------------------------

//GCD HCF

// public class recursion {
// public static int gcd(int a,int b){
    
//     int r=a%b;
//  if (r==0) {
//     return b;
//  }
//  else{
// return gcd(b, r);
//  }

// }
//     public static void main(String[] args) {
        
//         int a=25;
//         int b=15;

//         if (a>b) {
//             System.out.println( gcd(a,b));
//         }
//         else{
//              gcd(b,a);
//         }
        
//     }
// }
// -------------------------------------------------------------------------------