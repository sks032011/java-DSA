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