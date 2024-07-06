// Function to find square root
// // x: element to find square root
// class BSOnAnswers
// {
//      long floorSqrt(long x)
// 	 {
// 		long low=0;long high=x; long ans=1;
// 		while(low<=high){
// 		    long mid=(low+high)/2;
// 		    if((mid*mid)<=x){
// 		        ans=mid;
// 		        low=mid+1;
// 		    }
// 		    else{
// 		        high=mid-1;

// 		    }
// 		}
// 		return ans;
// 	 }
// }
// -----------------------------------------------------------------------------
// 875. Koko Eating Bananas
// TC O(N+NLOG(MAX OF ARRAY))

// class BS {
//     public int minEatingSpeed(int[] piles, int h) {
//         int l=1;int hi=findMax(piles);
//         while(l<=hi){
//             int mid=(l+hi)/2;
//             int totalhr=totalHr(piles,mid);
//             if(totalhr<=h){
//              hi=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return l;
//     }
//     public static int totalHr(int[]a,int h){
//         int totalhr=0;
//         for(int i=0;i<a.length;i++){
//                 totalhr+= Math.ceil((double)(a[i]) / (double)(h));
//         }
//         return totalhr;
//     }
//        public static int findMax(int[] v) {
//         int maxi = Integer.MIN_VALUE;;
//         int n = v.length;
//         //find the maximum:
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, v[i]);
//         }
//         return maxi;
//     }
// }-----------------------------------------------------------

// 1482. Minimum Number of Days to Make m Bouquets

// class BS {
//     public int minDays(int[] dayarr, int m, int k) {
//         int n = dayarr.length;
//                long val = (long) m * k;

//         if (val > n) return -1; // Impossible case.
// // Directly return -1 if it's impossible

//        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

//         // Find the minimum and maximum days in the array
//         for (int i = 0; i < n; i++) {
//             mini = Math.min(mini, dayarr[i]);
//             maxi = Math.max(maxi, dayarr[i]);
//         }

//         int l = mini, h = maxi;
//         while (l <= h) {
//             int mid = l + (h - l) / 2; // Prevent overflow
//             if (possible(dayarr, mid, m, k)) {
//                 h = mid - 1;
//             } else {
//                 l = mid + 1;
//             }
//         }
//         return l;
//     }

//     public boolean possible(int[] a, int day, int m, int k) {
//         int n = a.length;
//         int cnt = 0, numboq = 0;

//         for (int i = 0; i < n; i++) {
//             if (a[i] <= day) {
//                 cnt++;
//                 if (cnt == k) {
//                     numboq++;
//                     cnt = 0; // Reset count after forming a bouquet
//                     if (numboq == m) return true; // Early exit if we already have enough bouquets
//                 }
//             } else {
//                 cnt = 0; // Reset count if the current day exceeds the mid value
//             }
//         }
//         return numboq >= m;
//     }
// }
// ------------------------------------------------
// 1283. Find the Smallest Divisor Given a Threshold
// AND FOR KOKO TOO

// class BS {
//     public int smallestDivisor(int[] a, int tld) {
//         int n=a.length;
//         int ans=-1;
//         int low=1;int high=1000000;
//         while(low<=high){
//             int mid=low+(high-low)/2;

//             if(hr(a,mid)<=tld){
//                 ans=mid;
//                 high=mid-1;
//             }
//             else low=mid+1;
//         }
//         return ans;
//     }
//     public int hr(int[]a,int div){
//         int sum=0;
//         for(int i:a){
//             sum += (i + div - 1) / div;
//         }

//         return sum;

//     }
// }
// ------------------------------------------------------------------------

// 1011. Capacity To Ship Packages Within D Days

// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//        int n=weights.length; int sum=0;int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//         if(weights[i]>max) max=weights[i];
//         sum+=weights[i];
//        }
//         int low =max;int h=sum;
//         while(low<=h){
//             int mid=(low+h)/2;
//             if(noOfdaysREQ(weights,mid)<=days){
//               h=mid-1;
//             }
//             else low=mid+1;
//         }
//         return low;
//     }
//     public int noOfdaysREQ(int a[],int cap){
//          int n=a.length;
//         int load=0;int days=1;
//         for(int i=0;i<n;i++){
//             if(a[i]+load>cap){
//                 days+=1;
//                 load=a[i];
//             }
//             else{
//                 load+=a[i];
//             }
//         }
//         return days;
//     }
// }
// ----------------------------------------------------------------

// 1552. Magnetic Force Between Two Balls/// AGRESSIVE COWS

// import java.util.Arrays;
// class Solution {
//     public int maxDistance(int[] pos, int m) {
//         Arrays.sort(pos);
//         int n = pos.length;
//         int h = (pos[n - 1] - pos[0]) / (m - 1);

//         int low = 1;
//         while (low <= h) {
//             int mid = low + (h - low) / 2;
//             if (canweplace(pos, mid, m) == true) {
//                 low = mid + 1;
//             } else {
//                 h = mid - 1;
//                 ;
//             }
//         }
//         return h;
//     }

//     public static boolean canweplace(int[] a, int dist, int magnets) {
//         int cntball = 1;
//         int last = a[0];
//         int n = a.length;
//         for (int i = 1; i < n; i++) {
//             if (a[i] - last >= dist) {
//                 cntball += 1;
//                 last = a[i];
//             }
//             if (cntball >= magnets)
//                 return true;
//         }

//         return false;
//     }

// }

// ----------------------------------------------------------------

// 410. Split Array Largest Sum/Book allocation 

// class Solution {
//     public int splitArray(int[] nums, int k) {
//         int max = 0, sum = 0;
//         for (int num : nums) {
//             max = Math.max(max, num);
//             sum += num;
//         }
        
//         int low = max;
//         int high = sum;
        
//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (count(nums, mid) <= k) {
//                 high = mid;
//             } else {
//                 low = mid + 1;
//             }
//         }
        
//         return low;
//     }
    
//     private int count(int[] nums, int maxSum) {
//         int subarrays = 1, currentSum = 0;
//         for (int num : nums) {
//             if (currentSum + num > maxSum) {
//                 subarrays++;
//                 currentSum = num;
//             } else {
//                 currentSum += num;  //inc the pagesstu
//             }
//         }
//         return subarrays; //return student
//     }
// }
